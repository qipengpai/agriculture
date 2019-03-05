package com.qpp.common.constant;

/**
 * @ClassName Constants
 * @Description TODO 通用常量信息
 * @Author qipengpai
 * @Date 2018/10/23 10:58
 * @Version 1.0.1
 */
public class Constants {

    private Constants(){}

    /**
     * UTF-8 字符集
     */
    public static final String UTF8 = "UTF-8";

    /**
     * 通用成功标识
     */
    public static final String SUCCESS = "0";

    /**
     * 通用失败标识
     */
    public static final String FAIL = "1";

    /**
     * 登录成功
     */
    public static final String LOGIN_SUCCESS = "Success";

    /**
     * 注销
     */
    public static final String LOGOUT = "Logout";

    /**
     * 登录失败
     */
    public static final String LOGIN_FAIL = "Error";

    /**
     * 自动去除表前缀
     */
    public static String AUTO_REOMVE_PRE = "true";

    /**
     * 当前记录起始索引
     */
    public static String PAGE_NUM = "pageNum";

    /**
     * 每页显示记录数
     */
    public static String PAGE_SIZE = "pageSize";

    /**
     * 排序列
     */
    public static String ORDER_BY_COLUMN = "orderByColumn";

    /**
     * 排序的方向 "desc" 或者 "asc".
     */
    public static String IS_ASC = "isAsc";

    /**
     * @Fields LOCKTIMES : TODO(被锁定限定次数)
     */
    public static final String LOCKTIMES = "LOCKTIMES";

    /**
     * @Fields APPKEY : TODO(用一句话描述这个变量表示什么)
     */
    public static String APPKEY = "12345678";

    /**
     * @Fields APPKEY : TODO(新注册用户默认角色)
     */
    public static String DEFAULT_ROLE = "COMMON_ROLE";

    /**
     * @Fields APPKEY : TODO(蚂蚁金盾app 默认角色id)
     */
    public static String DEFAULT_MANAGER_ROLE = "2";

    /**
     * @Fields GZIP_URI : TODO(指定gzip压缩过滤器的URI)
     */
    public static String GZIP_URI_FILTER1 = "/appApi/*";

    /**
     * @Fields GZIP_URI : TODO(用一句话描述这个变量表示什么)
     */
    public static String GZIP_URI1 = "/appApi/";
    /**
     * @Fields GZIP_URI : TODO(指定gzip压缩过滤器的URI)
     */
    public static String GZIP_URI_FILTER2 = "/appCommonApi/*";

    /**
     * @Fields GZIP_URI : TODO(用一句话描述这个变量表示什么)
     */
    public static String GZIP_URI2 = "/appCommonApi/";
    /**
     * @Fields GZIP_URI : TODO(指定gzip压缩过滤器的URI)
     */
    public static String GZIP_URI_FILTER3 = "/openCommonApi/*";

    /**
     * @Fields GZIP_URI : TODO(用一句话描述这个变量表示什么)
     */
    public static String GZIP_URI3 = "/openCommonApi/";
}
