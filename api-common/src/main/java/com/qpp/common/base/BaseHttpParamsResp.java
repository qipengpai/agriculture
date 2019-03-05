/******************************************************************
 *
 *    Package:     com.company.platform.model
 *
 *    Filename:    BaseHttpParamsResp.java
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
package com.qpp.common.base;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.qpp.common.constant.Constants;
import com.qpp.common.constant.enums.ResponseConstants;
import com.qpp.common.utils.RandomUtil;
import com.qpp.common.utils.SHAHelper;
import org.apache.poi.ss.usermodel.DateUtil;


import java.io.Serializable;

/**
 * @ClassName: BaseHttpParamsResp
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author qipengpai
 * @date 2017年9月18日 下午1:50:07
 * 
 */
@SuppressWarnings("serial")
public class BaseHttpParamsResp implements Serializable {

    /**
     * 标识是否成功调用 true 成功 false 失败
     */
    @JsonProperty("exceptionFlag")
    private String exceptionFlag;
    /**
     * @Fields responseCode : TODO(响应状态码)
     */
    @JsonProperty("responseCode")
    private String responseCode;

    /**
     * @Fields timestamp : TODO(时间，用于验签)
     */
    @JsonProperty("timestamp")
    private String timestamp;

    /**
     * @Fields nonce : TODO(随机数，用于验签)
     */
    @JsonProperty("nonce")
    private String nonce;
    /**
     * @Field @sign : TODO(签名，用于验证防篡改)
     */
    @JsonProperty("sign")
    private String sign;
    /**
     * @Fields responseMessage : TODO(响应码描述)
     */
    @JsonProperty("responseMessage")
    private String responseMessage;

    /**
     * @Fields beans : TODO(自定义结果集)
     */
    // 结果集
    @JsonProperty("resultSet")
    private Object resultSet;

    public BaseHttpParamsResp() {
    }

    public BaseHttpParamsResp(String exceptionFlag, String responseMessage) {
        this.exceptionFlag = exceptionFlag;
        this.responseMessage = responseMessage;
    }

    public BaseHttpParamsResp(String exceptionFlag, String responseCode, String responseMessage) {
        this.exceptionFlag = exceptionFlag;
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
    }

    public BaseHttpParamsResp(String exceptionFlag, String responseCode, String responseMessage, Object resultSet) {
        this.exceptionFlag = exceptionFlag;
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.resultSet = resultSet;
    }

    // 请求失败
    public static BaseHttpParamsResp requestError(String responseMessage) {
        return new BaseHttpParamsResp(ResponseConstants.REQUEST_FAIL.getRetCode(), responseMessage);
    }

    // 请求成功，验证报文异常
    public static BaseHttpParamsResp requestError(String responseCode, String responseMessage) {
        return new BaseHttpParamsResp(ResponseConstants.REQUEST_SUCCESS.getRetCode(), responseCode, responseMessage);
    }

    // 成功调用，并放回信息
    public static BaseHttpParamsResp requestSuccess(String responseMessage, Object resultSet) {
        return new BaseHttpParamsResp(ResponseConstants.REQUEST_SUCCESS.getRetCode(),
                ResponseConstants.SUCCESS.getRetCode(), responseMessage, resultSet);
    }

    // 成功调用，并放回信息
    public static BaseHttpParamsResp requestSuccess(String responseCode, String responseMessage, Object resultSet) {
        return new BaseHttpParamsResp(ResponseConstants.REQUEST_SUCCESS.getRetCode(), responseCode, responseMessage,
                resultSet);
    }

    // 生成验签
    public void createSign() {
        String Nonce = String.valueOf(RandomUtil.getRandomDigit(8));
        String Timestamp = String.valueOf(System.currentTimeMillis());
        this.setNonce(Nonce);// 设置随机数
        this.setTimestamp(Timestamp);// 设置毫秒数
        this.setSign(SHAHelper.getSha(Constants.APPKEY + Timestamp + Nonce + JSON.toJSONString(this),SHAHelper.SHA1));
    }

    public String getExceptionFlag() {
        return exceptionFlag;
    }

    public void setExceptionFlag(String exceptionFlag) {
        this.exceptionFlag = exceptionFlag;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public Object getResultSet() {
        return resultSet;
    }

    public void setResultSet(Object resultSet) {
        this.resultSet = resultSet;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String toJSONString() {
        return JSON.toJSONString(this);
    }
}
