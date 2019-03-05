/******************************************************************
 *
 *    Package:     com.company.platform.base.aop.RequestLimit
 *
 *    Filename:    RequestLimitByTimeAspect.java
 *
 *    Description: TODO(用一句话描述该文件做什么)
 *
 *    Copyright:   Copyright (c) 2017
 *
 *    Company:     北京中科博润科技股份有限公司
 *
 *    @author:     zhengjn
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年3月27日 下午5:33:58
 *
 *    Revision:
 *
 *    2017年3月27日 下午5:33:58
 *        - first revision
 *
 *****************************************************************/
package com.qpp.admin.core.aspect;

import com.company.platform.base.baseenum.ResponseConstants;
import com.company.platform.base.exception.BusinessException;
import com.company.platform.base.model.requestLimit.RequestLimitByTimeModel;
import com.company.platform.base.service.requestLimit.IRequestLimitByTimeService;
import com.qpp.admin.entity.requestLimit.RequestLimitByTimeModel;
import com.qpp.admin.service.requestLimit.IRequestLimitByTimeService;
import com.qpp.common.annotation.requestLimit.RequestLimitByTimeAnnotation;
import com.qpp.common.constant.enums.ResponseConstants;
import eu.bitwalker.useragentutils.UserAgent;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName: RequestLimitByTimeAspect
 * @Description: TODO(单位时间内请求次数限制切片类)
 * @author qipengpai
 * @date 2017年10月18日 下午2:52:09
 */
@Component
@Aspect
@Slf4j
public class RequestLimitByTimeAspect {


	@Autowired
	private IRequestLimitByTimeService requestLimitByTimeServiceImp;

	public RequestLimitByTimeAspect() {
		if (log.isInfoEnabled()) {
			log.info("实例RequestLimitByTimeAspect");
		}
	}

	@Pointcut("@annotation(com.qpp.common.annotation.requestLimit.RequestLimitByTimeAnnotation)")
	public void controllerAspect() {
	}

	/** 
	* @Title: limitByTime 
	* @Description: TODO(拦截controller且@requestLimitByTimeAnnotation) 
	* @param @param jp
	* @param @param requestLimitByTimeAnnotation
	* @param @throws BusinessException    设定文件 
	* @return void    返回类型 
	* @throws 
	*/
	@Before(value = "controllerAspect()&&@annotation(requestLimitByTimeAnnotation)")
	public void limitByTime(JoinPoint jp, RequestLimitByTimeAnnotation requestLimitByTimeAnnotation)
			throws BusinessException {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		String ip = request.getRemoteAddr();
		String uri = request.getRequestURI().toString();
		UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("User-Agent"));
		final String key = "req_limit_".concat(userAgent.getBrowser().name()).concat(uri).concat(ip);
		if (requestLimitByTimeServiceImp.getRequesTimesByKey(key) == null
				|| requestLimitByTimeServiceImp.getRequesTimesByKey(key).getTimes() == 0) {// 初始添加一次访问
			RequestLimitByTimeModel requestLimitByTimeModel = new RequestLimitByTimeModel();
			requestLimitByTimeModel.setKey(key);
			requestLimitByTimeModel.setTimes(1);
			requestLimitByTimeServiceImp.putRequesTimesByKey(requestLimitByTimeModel, key);
		} else {// 增加一次访问
			RequestLimitByTimeModel requestLimitByTimeModel = new RequestLimitByTimeModel();
			requestLimitByTimeModel.setKey(key);
			requestLimitByTimeModel.setTimes(requestLimitByTimeServiceImp.getRequesTimesByKey(key).getTimes() + 1);
			requestLimitByTimeServiceImp.putRequesTimesByKey(requestLimitByTimeModel, key);
		}

		int count = requestLimitByTimeServiceImp.getRequesTimesByKey(key).getTimes(); // 获取总访问次数
		if (count >= requestLimitByTimeAnnotation.count()) {// 当请求数大于等于限制次数
			Timer timer = new Timer();
			TimerTask task = new TimerTask() { // 创建一个新的计时器任务。

				@Override
				public void run() {
					requestLimitByTimeServiceImp.delRequesTimesByKey(key);
				}
			};
			timer.schedule(task, requestLimitByTimeAnnotation.time());
			// 安排在指定延迟后执行指定的任务。task : 所要安排的任务。 执行任务前的延迟时间，单位是毫秒。
		}

		if (count > requestLimitByTimeAnnotation.count()) { // 大于约定时间内执行次数，抛出异常
			log.info("用户IP[" + ip + "]访问地址[" + uri + "]超过了限定的次数[" + requestLimitByTimeAnnotation.count() + "]");
			throw new BusinessException(ResponseConstants.REQUEST_LIMIT.getRetCode(),
					"超过规定" + requestLimitByTimeAnnotation.time() / 1000 + "秒时间内访问"
							+ requestLimitByTimeAnnotation.count() + "次限制，请稍后再试");
		}
	}
}
