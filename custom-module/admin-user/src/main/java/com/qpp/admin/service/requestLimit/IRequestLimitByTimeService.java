/******************************************************************
 *
 *    Package:     com.company.platform.base.service.requestLimit.imp
 *
 *    Filename:    IRequestLimitByTime.java
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
package com.qpp.admin.service.requestLimit;


import com.qpp.admin.entity.requestLimit.RequestLimitByTimeModel;

/**
 * @ClassName: IRequestLimitByTime
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author qipengpai
 * @date 2017年10月18日 下午3:33:05
 */
public interface IRequestLimitByTimeService {

    /**
     * @Title: addRequesTimeByKey @Description: TODO(存储请求次数) @param @param info 设定文件 @return void 返回类型 @throws
     */
    RequestLimitByTimeModel putRequesTimesByKey(RequestLimitByTimeModel requestLimitByTimeModel, String key);

    /**
     * @Title: getRequesTimesByKey @Description: TODO(通过key查询请求次数) @param @param key @param @return 设定文件 @return int
     * 返回类型 @throws
     */
    RequestLimitByTimeModel getRequesTimesByKey(String key);

    /**
     * @Title: delRequesTimesByKey @Description: TODO(通过key清楚次数) @param @param key 设定文件 @return void 返回类型 @throws
     */
    void delRequesTimesByKey(String key);
}
