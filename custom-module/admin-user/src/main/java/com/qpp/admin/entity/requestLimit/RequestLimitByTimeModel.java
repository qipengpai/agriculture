/******************************************************************
 *
 *    Package:     com.company.platform.base.model.requestLimit
 *
 *    Filename:    RequestLimitByTimeModel.java
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
package com.qpp.admin.entity.requestLimit;


/** 
* @ClassName: RequestLimitByTimeModel 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author qipengpai
* @date 2017年10月18日 下午4:48:43 
*  
*/
@SuppressWarnings("serial")
public class RequestLimitByTimeModel{

    String key ;
    
    Integer times;

    
    public String getKey() {
        return key;
    }

    
    public void setKey(String key) {
        this.key = key;
    }

    
    public Integer getTimes() {
        return times;
    }

    
    public void setTimes(Integer times) {
        this.times = times;
    }
}
