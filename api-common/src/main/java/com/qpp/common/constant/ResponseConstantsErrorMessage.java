/******************************************************************
 *
 *    Package:     com.company.platform.base.baseenum
 *
 *    Filename:    ResponseConstantsErrorMessage.java
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
package com.qpp.common.constant;

import com.qpp.common.constant.enums.ResponseConstants;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;

/** 
* @ClassName: ResponseConstantsErrorMessage 
* @Description: TODO(定义通用异常提示信息) 
* @author zhengjn 
* @date 2017年11月2日 下午4:51:35 
*  
*/
public class ResponseConstantsErrorMessage {

    public static HashMap<String, String> errorMapMessage = new HashMap<String, String>();

    static {
        errorMapMessage.put("/appApi/modifyPwd", ResponseConstants.USER_MODIFY_PWD_FAIL.getRetMsg());
    }

    public static String getErrorMessage(String uri) {
        String errorMessage = errorMapMessage.get(uri);
        return StringUtils.isEmpty(errorMessage) ? "系统偷懒了，请稍后再操作" : errorMessage;
    }

}
