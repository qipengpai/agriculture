/******************************************************************
 *
 *    Package:     com.company.platform.base.aop.RequestLimit
 *
 *    Filename:    RequestLimitByTime.java
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
package com.qpp.common.annotation.requestLimit;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.lang.annotation.*;

/**
 * @ClassName: RequestLimitByTime
 * @Description: TODO(指定时间内限制请求次数)
 * @author qipengpai
 * @date 2017年10月18日 下午2:38:16
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
@Documented
// 最高优先级
@Order(Ordered.HIGHEST_PRECEDENCE)
public @interface RequestLimitByTimeAnnotation {
	/**
	 * 
	 * 允许访问的次数，默认值MAX_VALUE
	 */
	int count() default Integer.MAX_VALUE;

	/**
	 * 
	 * 时间段，单位为毫秒，默认半一分钟
	 */
	long time() default 30000;
}
