package com.qpp.common.exception;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 业务异常
 *
 * @author qipengpai
 * @Date   15/6/23 Time:18:27
 */
public class BusinessException extends Exception {
    
	private static final long serialVersionUID = -4648879327187605014L;

    private static Map<Integer, String> CODES_MAP = null;

    private static final String DEFAULT_ERROR_CODE_MESSAGE = "系统内部错误";

    private static final String EXCEPTION_MESSAGE_PROPERTIES = "business-exceptions.properties";

    private final static Logger logger = LoggerFactory.getLogger(BusinessException.class);

    static {
        BusinessException.init();
    }

    /**
     * 从properties配置文件中初始化CodeMap
     */
    private synchronized static void init() {
        if (null == BusinessException.CODES_MAP) {
            // 初始化CODE_MAP
            BusinessException.CODES_MAP = new HashMap<Integer, String>();
            BusinessException.CODES_MAP.put(0, BusinessException.DEFAULT_ERROR_CODE_MESSAGE);

            PropertiesConfiguration config = null;
            try (InputStream in = BusinessException.class.getClassLoader().getResourceAsStream(BusinessException.EXCEPTION_MESSAGE_PROPERTIES)) {
                config = new PropertiesConfiguration();
                config.setEncoding("utf8");
                config.load(in);
            } catch (ConfigurationException e) {
                BusinessException.logger.error("[business exception] get pro file error:", e);
            } catch (IOException e) {
                BusinessException.logger.error("[business exception] ", e);
            }
            BusinessException.logger.info("[business exception] init start...");

            if (config != null) {
                Iterator<?> keyIterator = config.getKeys();
                while (keyIterator.hasNext()) {
                    String key = (String) keyIterator.next();
                    if (NumberUtils.isNumber(key)) {
                        BusinessException.CODES_MAP.put(NumberUtils.createInteger(key), config.getString(key));
                        BusinessException.logger.info("[business exception] add exception:code=" + key + ",message=" + config.getString(key));
                    } else {
                        BusinessException.logger.info("[business exception] add exception:code=" + key + ",message=" + config.getString(key));
                    }
                }
            }

            BusinessException.logger.info("[business exception] init exception map suc.");
        }
    }

    /**
     * 附加描述信息
     */
    private String additionMessage = null;

    /**
     * 本异常错误代码
     */
    private Integer errorCode = 0;

    public BusinessException(int errCode, String additionMessage) {
        super(additionMessage);
        this.additionMessage = additionMessage;
        this.errorCode = errCode;
    }

    public BusinessException(Integer erroCode) {
        super();
        errorCode = erroCode;
    }

    public BusinessException(Integer erroCode, String additionMessage, Throwable cause) {
        super(cause);
        errorCode = erroCode;
        this.additionMessage = additionMessage;
    }

    public BusinessException(Integer erroCode, Throwable cause) {
        super(cause);
        errorCode = erroCode;
    }

    /**
     * 获取异常错误代码
     *
     * @return
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    @Override
    public String getMessage() {
        return getLocalizedMessage();
    }

    @Override
    public String getLocalizedMessage() {
        String localMessage = null;
        if (null != this.additionMessage) {
            localMessage = this.additionMessage;
        } else {
            localMessage = BusinessException.CODES_MAP.get(this.errorCode) + "。";
        }
        if (null == this.additionMessage && StringUtils.isEmpty(BusinessException.CODES_MAP.get(this.errorCode))) {
            localMessage = "系统内部错误";
        }
        return localMessage;
    }
}
