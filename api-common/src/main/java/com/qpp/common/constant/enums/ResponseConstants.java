package com.qpp.common.constant.enums;

/**
 * @ClassName ResponseConstants
 * @Author qipengpai
 * @Description //TODO 响应代码枚举
 * @Date 10:51 2018/10/31
 */
public enum ResponseConstants {

    /**
     * @Fields REQUEST_SUCCESS : TODO(请求调用成功)
     */
    REQUEST_SUCCESS("0000", "请求成功"),

    /**
     * @Fields REQUEST_FAIL : TODO(请求调用失败)
     */
    REQUEST_FAIL("9999", "请求失败"),

    /**
     * @Fields SUCCESS : TODO(通用是否标识)
     */
    SUCCESS("00000000", "成功"),

    /**
     * @Fields FAIL : TODO(通用是否标识)
     */
    FAIL("99999999", "失败"),

    /**
     * @Fields VERIFICATION_FAILED : TODO(字段常规校验失败)
     */
    FIELD_VALIDATE_ERROR("10001000", "请求报文传输信息有误"),

    /**
     * @Fields FIELD_CODEINVALID_ERROR : TODO(验证码错误)
     */
    FIELD_CODEINVALID_ERROR("10002001", "验证码错误"),
    /**
     * @Fields FIELD_CODEINVALID_ERROR : TODO(验证码失效)
     */
    FIELD_CODEINVALID_OUTTIME_ERROR("10002002", "码验证超时"),
    /**
     * @Fields FIELD_CODECHECK_SUCCESS : TODO(验证码验证成功)
     */
    FIELD_CODECHECK_SUCCESS("10002000", "验证码验证成功"),
    /**
     * @Fields FIELD_SMSCODESEND_SUCCESS : TODO(手机短信验证码发送成功)
     */
    FIELD_SMSCODESEND_SUCCESS("20001000", "手机短信验证码发送成功"),
    /**
     * @Fields FIELD_SMSCODEINVALID_ERROR : TODO(手机验证码错误)
     */
    FIELD_SMSCODEINVALID_ERROR("20002005", "手机验证码错误"),
    /**
     * @Fields FIELD_SMSCODEINVALID_OUTTIME_ERROR : TODO(手机验证码失效)
     */
    FIELD_SMSCODEINVALID_OUTTIME_ERROR("20002004", "手机码验证超时"),
    /**
     * @Fields FIELD_SMSCODECHECK_SUCCESS : TODO(手机验证码验证成功)
     */
    FIELD_SMSCODECHECK_SUCCESS("20002006", "手机验证码验证成功"),
    /**
     * @Fields USER_REGISTER_SUCCESS : TODO(密码设置成功)
     */
    USER_REGISTER_SUCCESS("20003000", "密码设置成功"),
    /**
     * @Fields USER_REGISTER_FAIL : TODO(密码设置失败)
     */
    USER_REGISTER_FAIL("20003001", "密码设置失败"),
    /**
     * @Fields USER_UPDATE_PWD_SUCCESS : TODO(密码重置成功)
     */
    USER_UPDATE_PWD_SUCCESS("20003002", "密码重置成功"),
    /**
     * @Fields USER_UPDATE_PWD_FAIL : TODO(密码重置失败)
     */
    USER_UPDATE_PWD_FAIL("20003003", "密码重置失败"),
    /**
     * @Fields USER_MODIFY_PWD_SUCCESS : TODO(密码修改成功)
     */
    USER_MODIFY_PWD_SUCCESS("20003004", "密码修改成功"),
    /**
     * @Fields USER_MODIFY_PWD_FAIL : TODO(密码修改失败)
     */
    USER_MODIFY_PWD_FAIL("20003005", "密码修改失败"),
    /**
     * @Fields USER_MODIFY_PWD_WRONG : TODO(当前密码错误)
     */
    USER_MODIFY_PWD_WRONG("20003015", "当前密码错误"),
    /**
     * @Fields APP_VERSION_DETECTION_SUCCESS : TODO(版本检测成功)
     */
    APP_VERSION_DETECTION_SUCCESS("20003008", "版本检测成功"),
    /**
     * @Fields APP_VERSION_DETECTION_FAIL : TODO(版本检测失败)
     */
    APP_VERSION_DETECTION_FAIL("20003009", "版本检测失败"),
    /**
     * @Fields APP_VERSION_FILE_NOTFOUND : TODO(文件不存在)
     */
    APP_VERSION_FILE_NOTFOUND("20003010", "文件不存在"),
    /**
     * @Fields QUIT_MOBILE_LOGIN_SUCCESS : TODO(退出登录成功)
     */
    QUIT_MOBILE_LOGIN_SUCCESS("20003010", "退出登录成功"),

    /**
     * @Fields AMOUNT_ERROR : TODO(借贷金额格式错误)
     */
    AMOUNT_ERROR("20004000", "借贷金额格式错误"),

    /**
     * @Fields AMOUNT_RULE_ERROR : TODO(借贷金额不在允许范围内)
     */
    AMOUNT_RULE_ERROR("20004001", "借贷金额不在允许范围内"),

    /**
     * @Fields INTEREST_RATE_ERROR : TODO(年化利率格式错误)
     */
    INTEREST_RATE_ERROR("20004002", "年化利率格式错误"),

    /**
     * @Fields INTEREST_RATE_RULE_ERROR: TODO(年化利率不在允许范围内)
     */
    INTEREST_RATE_RULE_ERROR("20004003", "年化利率不在允许范围内"),

    /**
     * @Fields TERMCOUNT_ERROR: TODO(借贷期限格式错误)
     */
    TERMCOUNT_ERROR("20004004", "借贷期限格式错误"),

    /**
     * @Fields TERMCOUNT_RULE_ERROR: TODO(借贷期限不在允许范围内)
     */
    TERMCOUNT_RULE_ERROR("20004005", "借贷期限不在允许范围内"),

    /**
     * @Fields TERMUNIT_ERROR: TODO(借贷期限单位错误)
     */
    TERMUNIT_ERROR("20004006", "借贷期限单位错误"),

    /**
     * @Fields TERMUNIT_RULE_ERROR: TODO(借贷期限单位不在允许范围内)
     */
    TERMUNIT_RULE_ERROR("20004007", "借贷期限单位不在允许范围内"),

    /**
     * @Fields REPAY_TERMCOUNT_ERROR: TODO(还款间隔格式错误)
     */
    REPAY_TERMCOUNT_ERROR("20004008", "还款间隔格式错误"),

    /**
     * @Fields REPAY_TERMCOUNT_RULE_ERROR: TODO(还款间隔不在允许范围内)
     */
    REPAY_TERMCOUNT_RULE_ERROR("20004009", "还款间隔不在允许范围内"),

    /**
     * @Fields REPAY_TERMUNIT_ERROR: TODO(还款间隔单位错误)
     */
    REPAY_TERMUNIT_ERROR("20004010", "还款间隔单位错误"),

    /**
     * @Fields REPAY_TERMUNIT_RULE_ERROR : TODO(还款间隔单位不在允许范围内)
     */
    REPAY_TERMUNIT_RULE_ERROR("20004011", "还款间隔单位不在允许范围内"),

    /**
     * @Fields REPAY_TERMUNIT_SUPPORT_ERROR : TODO(借贷期限单位选择月，还款间隔单位不支持选择日)
     */
    REPAY_TERMUNIT_SUPPORT_ERROR("20004012", "借贷期限单位选择月，还款间隔单位不支持选择日"),

    /**
     * @Fields REPAY_TYPE_ERROR : TODO(还款方式错误)
     */
    REPAY_TYPE_ERROR("20004013", "还款方式错误"),

    /**
     * @Fields REPAY_TYPE_RULE_ERROR : TODO(还款方式不在允许范围内)
     */
    REPAY_TYPE_RULE_ERROR("20004014", "还款方式不在允许范围内"),

    /**
     * @Fields REPAY_TYPE_SUPPORT_ERROR : TODO(借贷期限单位选择日，还款方式不支持选择等额本息)
     */
    REPAY_TYPE_SUPPORT_ERROR("20004015", "借贷期限单位选择日，还款方式不支持选择等额本息"),

    /**
     * @Fields LOAN_PENALTY_RATE_ERROR : TODO(罚息利率不在允许范围内)
     */
    LOAN_PENALTY_RATE_ERROR("20004025", "罚息利率不在允许范围内"),

    /**
     * @Fields GUARANTEE_TYPE_RULE_ERROR : TODO(担保方式不在允许范围内)
     */
    GUARANTEE_TYPE_RULE_ERROR("200040247", "担保方式不在允许范围内"),

    /**
     * @Fields NOT_PERFECT_PERSONAL_INFO : TODO(个人信息尚未完善)
     */
    NOT_PERFECT_PERSONAL_INFO("20004016", "个人信息尚未完善"),

    /**
     * @Fields BLACKLIST_CUSTOMER_ERROR : TODO(黑名单客户)
     */
    BLACKLIST_CUSTOMER_ERROR("20004017", "黑名单客户"),

    /**
     * @Fields LIMITED_CUSTOMER_ERROR : TODO(受限客户)
     */
    LIMITED_CUSTOMER_ERROR("20004018", "受限客户"),

    /**
     * @Fields NOT_EFFECTIVE_CUSTOMER_ERROR : TODO(未生效客户)
     */
    NOT_EFFECTIVE_CUSTOMER_ERROR("20004019", "未生效客户"),

    /**
     * @Fields WRITE_OFF_CUSTOMER_ERROR : TODO(注销客户)
     */
    WRITE_OFF_CUSTOMER_ERROR("20004020", "注销客户"),

    /**
     * @Fields RISK_CUSTOMER_ERROR : TODO(风险客户)
     */
    RISK_CUSTOMER_ERROR("20004027", "风险客户"),

    /**
     * @Fields TRANSFER_CUSTOMER_ERROR : TODO(请前往pc端进行客户迁移)
     */
    TRANSFER_CUSTOMER_ERROR("20004026", "请前往pc端进行客户迁移"),

    /**
     * @Fields NOT_EXIT_CUSTOMER_ERROR : TODO(当前客户不存在)
     */
    NOT_EXIT_CUSTOMER_ERROR("20004028", "当前客户不存在"),

    /**
     * @Fields PERSONAL_MOBILE_NOT_EMPTY : TODO(联系电话不能为空)
     */
    PERSONAL_MOBILE_NOT_EMPTY("20004029", "联系电话不能为空"),

    /**
     * @Fields PERSONAL_PHONE_NOT_EMPTY : TODO(办公电话不能为空)
     */
    PERSONAL_PHONE_NOT_EMPTY("20004030", "办公电话不能为空"),

    /**
     * @Fields LOCATION_REGISTER_NOT_EMPTY : TODO(户籍地区信息不能为空，精确到市)
     */
    LOCATION_REGISTER_NOT_EMPTY("20004031", "户籍地区信息不能为空，精确到市"),

    /**
     * @Fields LOCATION_LIVE_NOT_EMPTY : TODO(居住地区信息不能为空，精确到区（县）)
     */
    LOCATION_LIVE_NOT_EMPTY("20004032", "居住地区信息不能为空，精确到区（县）"),

    /**
     * @Fields LOCATION_REGISTER_NOT_EMPTY : TODO(户籍详细地址不能为空)
     */
    LOCATION_REGISTER_DETAIL_NOT_EMPTY("20004033", "户籍详细地址不能为空"),

    /**
     * @Fields LOCATION_LIVE_DETAIL_NOT_EMPTY : TODO(居住详细地址不能为空)
     */
    LOCATION_LIVE_DETAIL_NOT_EMPTY("20004034", "居住详细地址不能为空"),

    /**
     * @Fields PERSONAL_CUSTOMER_NOT_EMPTY : TODO(客户个人信息不能为空)
     */
    PERSONAL_CUSTOMER_NOT_EMPTY("20004035", "客户个人信息不能为空"),

    /**
     * @Fields CUSTOMER_CONTACT_NOT_EMPTY : TODO(客户联系信息不能为空)
     */
    CUSTOMER_CONTACT_NOT_EMPTY("20004036", "客户联系信息不能为空"),

    /**
     * @Fields CUSTOMER_LOCATION_NOT_EMPTY : TODO(客户地址信息不能为空)
     */
    CUSTOMER_LOCATION_NOT_EMPTY("20004037", "客户地址信息不能为空"),

    /**
     * @Fields CUSTOMER_JOB_NOT_EMPTY : TODO(客户工作信息不能为空)
     */
    CUSTOMER_JOB_NOT_EMPTY("20004038", "客户工作信息不能为空"),

    /**
     * @Fields CORPORATION_INFO_NOT_EMPTY : TODO(企业客户基本信息不能为空)
     */
    CORPORATION_INFO_NOT_EMPTY("20004039", "企业客户基本信息不能为空"),

    /**
     * @Fields CUSTOMER_NAME_ERROR : TODO(申请人姓名错误)
     */
    CUSTOMER_NAME_ERROR("20004040", "申请人姓名错误"),

    /**
     * @Fields REGISTER_CAPITAL_ERROR : TODO(注册资本格式错误)
     */
    REGISTER_CAPITAL_ERROR("20004041", "注册资本格式错误"),

    /**
     * @Fields CREDENTIAL_NO_ERROR : TODO(证件号码格式错误)
     */
    CREDENTIAL_NO_ERROR("20004042", "证件号码格式错误"),

    /**
     * @Fields PHONE_NO_ERROR : TODO(手机号码格式错误)
     */
    PHONE_NO_ERROR("20004048", "手机号码格式错误"),

    /**
     * @Fields LOCATION_TYPE_ERROR : TODO(客户地址类型错误)
     */
    LOCATION_TYPE_ERROR("20004043", "客户地址类型错误"),

    /**
     * @Fields CONTACT_TYPE_NOT_EMPTY : TODO(客户联系方式类型错误)
     */
    CONTACT_TYPE_NOT_EMPTY("20004044", "客户联系方式类型错误"),

    /**
     * @Fields TERM_UNIT_NOT_PASS : TODO(借贷期限选择"月"，还款间隔不支持选择"日")
     */
    TERM_UNIT_NOT_PASS("20004045", "借贷期限选择\"月\"，还款间隔不支持选择\"日\""),

    /**
     * @Fields REPAY_TYPE_TERM_UNIT_ERROR : TODO(还款方式选择"等额本息"，借贷期限不支持选择"日")
     */
    REPAY_TYPE_TERM_UNIT_ERROR("20004046", "还款方式选择\"等额本息\"，借贷期限不支持选择\"日\""),

    /**
     * @Fields CUSTOMER_RELATION_SHIP_REPEAT : TODO(联系人证件号码重复)
     */
    CUSTOMER_RELATION_SHIP_REPEAT("20004047", "联系人证件号码重复"),

    /**
     * @Fields SURPLUS_AMOUNT_ERROR : TODO(客户可申请额度不足)
     */
    SURPLUS_AMOUNT_ERROR("20004021", "客户可申请额度不足"),

    /**
     * @Fields STOP_USER : TODO(该账号已停用)
     */
    STOP_USER("20004022", "该账号已停用"),

    /**
     * @Fields CANNOT_VIEW_PRODUCT : TODO(产品对互联网客户不可见)
     */
    CANNOT_VIEW_PRODUCT("20004023", "产品对互联网客户不可见"),

    /**
     * @Fields ORGCODENOTEXIST : TODO(进件申请组织结构不存在)
     */
    ORGCODENOTEXIST("20004024", "进件申请组织结构不存在"),

    /**
     * @Fields LOAN_APPLY_SUCCESS : TODO(贷款申请成功)
     */
    LOAN_APPLY_SUCCESS("20005000", "贷款申请成功"),

    /**
     * @Fields LOAN_APPLY_ERROR : TODO(贷款申请失败)
     */
    LOAN_APPLY_ERROR("20005001", "贷款申请失败"),

    /**
     * @Fields LOAN_APPLY_OFFLINE_STATUS : TODO(离线状态修改申请信息)
     */
    LOAN_APPLY_OFFLINE_STATUS("21001000", "离线状态修改申请信息"),

    /**
     * @Fields ORG_SURPLUS_AMOUNT_ERROR : TODO(组织机构额度不足)
     */
    ORG_SURPLUS_AMOUNT_ERROR("20005003", "组织机构额度不足"),

    /**
     * @Fields SURPLUS_AMOUNT_RULE_ERROR : TODO(申请金额不在允许范围内)
     */
    SURPLUS_AMOUNT_RULE_ERROR("20005004", "申请金额不在允许范围内"),

    /**
     * @Fields SURPLUS_AMOUNT_RULE_ERROR : TODO(申请金额不在允许范围内)
     */
    SURPLUS_REPETITION_ERROR("20005005", "该借贷申请可能已经提交"),

    /**
     * @Fields ORGCODE_NOTEXIST : TODO(产品默认组织机构不存在)
     */
    ORGCODE_NOTEXIST("20005002", "产品默认组织机构不存在"),

    /**
     * @Fields NOT_EXIT_CUSTOMER_ERROR : TODO(当前贷款申请不存在)
     */
    NOT_EXIT_LOAN_APPLY_ERROR("25003", "当前贷款申请不存在"),

    /**
     * @Fields LOAN_APPLY_SUBMITTED_ERROR : TODO(当前借贷申请已提交)
     */
    LOAN_APPLY_SUBMITTED_ERROR("20005009", "当前借贷申请已提交"),

    /**
     * @Fields BUSINESS_MODEL_DATA_ERROR : TODO(业务模型数据格式错误)
     */
    BUSINESS_MODEL_DATA_ERROR("20005005", "业务模型数据格式错误"),

    /**
     * @Fields BUSINESS_MODEL_DATA_EMPTY : TODO(业务模型数据不能为空)
     */
    BUSINESS_MODEL_DATA_EMPTY("20005006", "业务模型数据不能为空"),

    /**
     * @Fields BUSINESS_MODEL_ID_EMPTY : TODO(业务模型id不能为空)
     */
    BUSINESS_MODEL_ID_EMPTY("20005007", "业务模型id不能为空"),

    /**
     * @Fields BUSINESS_MODEL_ID_ERROR : TODO(业务模型id错误)
     */
    BUSINESS_MODEL_ID_ERROR("20005008", "业务模型id错误"),

    /**
     * @Fields BUSINESS_MODEL_NOT_EXIST : TODO(业务模型不存在)
     */
    BUSINESS_MODEL_NOT_EXIST("20005010", "业务模型不存在"),

    /**
     * @Fields PASSIMAGEAUTH : TODO(已通过认证)
     */
    PASSIMAGEAUTH("20006001", "已通过身份认证"),

    /**
     * @Fields REALNAMEAUTHFAIL : TODO(身份认证失败)
     */
    REALNAMEAUTHFAIL("20006002", "身份认证失败"),

    /**
     * @Fields IDCARDNOISUSED : TODO(已有账号绑定了该身份信息)
     */
    IDCARDNOISUSED("20006003", "已有账号绑定了该身份信息"),

    /**
     * @Fields REPAYMENT_NOT_EXIST : TODO(还款计划不存在)
     */
    REPAYMENT_NOT_EXIST("20007000", "还款计划不存在"),

    /**
     * @Fields APPLY_HAS_FINISHED : TODO(借款已经全部还完)
     */
    APPLY_HAS_FINISHED("20007001", "借款已经全部还完"),

    /**
     * @Fields REPAYMENT_HAS_APPLY_EXTENSION : TODO(该笔还款已申请展期)
     */
    REPAYMENT_HAS_APPLY_EXTENSION("200070002", "该笔还款已申请展期"),

    /**
     * @Fields HAS_BEFORE_UNREPAYMENT : TODO(前期还完才能还下一期)
     */
    HAS_BEFORE_UNREPAYMENT("20007003", "前期还完才能还下一期"),

    /**
     * @Fields APPLY_NOT_EXIST : TODO(不属于该用户的借贷还款)
     */
    APPLY_NOT_EXIST("20007004", "不属于该用户的借贷还款"),

    /**
     * @Fields REPAY_HAS_FINISHED : TODO(当期已经还完)
     */
    REPAY_HAS_FINISHED("20007005", "当期已经还完"),

    /**
     * @Fields ORGID_NOT_SYN : TODO(数据需要同步（机构）)
     */
    ORGID_NOT_SYN("20008001", "数据需要同步（机构）"),

    /**
     * @Fields LOAN_PRODUCT_NOT_SYN : TODO(数据需要同步（产品）)
     */
    LOAN_PRODUCT_NOT_SYN("20008002", "数据需要同步（产品）"),

    /**
     * @Fields AUTHENTICATION_FAIL : TODO(登陆授权失败)
     */
    AUTHENTICATION_SUCCESS("90000000", "登陆成功"),

    /**
     * @Fields AUTHENTICATION_NOTFIND_ACCOUNT_FAIL : TODO(登陆授权失败)
     */
    AUTHENTICATION_NOTFIND_ACCOUNT_FAIL("90001000", "登陆失败，账号不存在"),

    /**
     * @Fields AUTHENTICATION_FAIL : TODO(登陆授权失败)
     */
    AUTHENTICATION_PASSWORD_FAIL("90002000", "密码错误"),

    /**
     * @Fields AUTHENTICATION_FAIL : TODO(登陆授权失败)
     */
    AUTHENTICATION_ACCOUNT_LOCKED_FAIL("90003000", "登陆失败，多次密码错误，账号被锁"),

    /**
     * @Fields AUTHENTICATION_SUCCESS : TODO(登陆授权成功)
     */
    AUTHENTICATION_FAIL("90009000", "登陆失败"),
    /**
     * @Fields NO_ACCESS_ALLOWED : TODO(无权限访问)
     */
    NO_ACCESS_ALLOWED("90002000", "无权限访问"),

    /**
     * @Fields SESSION_TIMEOUT : TODO(请求会话超时)
     */
    SESSION_TIMEOUT("90003000", "请求会话超时"),

    /**
     * @Fields SESSION_TIMEOUT : TODO(请求会话超时)
     */
    REQUEST_LIMIT("90004000", "规定时间内请求受限"),

    /**
     * @Fields LOAN_PRODUCT_NOT_EXIST : TODO(产品不存在)
     */
    LOAN_PRODUCT_NOT_EXIST("90004026", "产品不存在"),

    /**
     * @Fields LOAN_PRODUCT_ORG_NOT_RELATION : TODO(产品未关联改机构)
     */
    LOAN_PRODUCT_ORG_NOT_RELATION("90004029", "产品未关联改机构"),

    /**
     * @Fields LOAN_PRODUCT_STATUS_ERROR : TODO(产品未生效或已删除)
     */
    LOAN_PRODUCT_STATUS_ERROR("90004035", "产品未生效或已删除"),

    /**
     * @Fields CUSTOMER_PUBLIC_NOT_EXIST : TODO(客户不存在)
     */
    CUSTOMER_PUBLIC_NOT_EXIST("90004036", "客户不存在"),

    /**
     * @Fields PRODUCT_NEED_UPDATE : TODO(产品需要进行更新)
     */
    PRODUCT_NEED_UPDATE("90004038", "产品需要进行更新"),

    /**
     * @Fields LOAN_PRODUCT_APPLY_NOT_EXIST : TODO(借贷申请不存在)
     */
    LOAN_PRODUCT_APPLY_NOT_EXIST("90004037", "借贷申请不存在"),

    /**
     * @Fields LOAN_PRODUCT_INVALID : TODO(产品失效)
     */
    LOAN_PRODUCT_INVALID("90004025", "产品失效"),

    /**
     * @Fields LOAN_PRODUCT_ORG_NOT_REL : TODO(用户无权限)
     */
    LOAN_PRODUCT_ORG_NOT_REL("90004024", "用户无权限"),

    /**
     * @Fields LOAN_PRODUCT_USER_ORG_ERROR : TODO(无获取贷款申请码权限)
     */
    LOAN_PRODUCT_USER_ORG_ERROR("90004023", "无获取贷款申请码权限"),

    /**
     * @Fields LOAN_PRODUCT_APPLY_IS_EMPTY : TODO(贷款信息不能不为空)
     */
    LOAN_PRODUCT_APPLY_IS_EMPTY("90004027", "贷款信息不能不为空"),

    /**
     * @Fields LOAN_PRODUCT_INVALID : TODO(产品流程不存在)
     */
    LOAN_PRODUCT_FLOW_ERROR("90004020", "产品流程不存在"),

    /**
     * @Fields FLOW_REPEAT_ERROR : TODO(流程重复申请错误)
     */
    FLOW_REPEAT_ERROR("90004028", "流程重复申请"),

    /**
     * @Fields CREDENTIAL_TYPE_ERROR : TODO(证件类型字典值错误)
     */
    CREDENTIAL_TYPE_ERROR("90004029", "证件类型字典值错误"),

    /**
     * @Fields SYSTEM_ERROR_COMPRESS : TODO(gzip压缩失败)
     */
    SYSTEM_ERROR_COMPRESS("50001000", "gzip压缩失败，仅能POST可压缩"),

    /**
     * @Fields MD_UPLOAD_SUCCESS : TODO(影像文件上传成功)
     */
    MD_UPLOAD_SUCCESS("30001000", "文件上传成功"),

    /**
     * @Fields MD_UPLOAD_CFGNOTFOUND : TODO(影像资料配置未找到，影像模型或者影像分类不存在)
     */
    MD_UPLOAD_CFGNOTFOUND("30001001", "影像配置缺失"),

    /**
     * @Fields MD_UPLOAD_NONE : TODO(未上传文件)
     */
    MD_UPLOAD_NONE("30001002", "未上传文件"),

    /**
     * @Fields MD_UPLOAD_NONE : TODO(影像资料上传数量超限)
     */
    MD_UPLOAD_MORE("30001003", "影像资料超限"),

    /**
     * @Fields MD_UPLOAD_LESS : TODO(影像资料上传数量不足)
     */
    MD_UPLOAD_LESS("30001004", "影像资料不足"),

    /**
     * @Fields MD_RMFILE_SUCCESS : TODO(影像文件删除成功)
     */
    MD_RMFILE_SUCCESS("30002000", "删除文件成功"),

    /**
     * @Fields MD_RMFILE_INFONOTFOUNT : TODO(要删除的影像文件记录未找到)
     */
    MD_RMFILE_INFONOTFOUNT("30002001", "要删除的文件记录未找到"),

    /**
     * @Fields MD_RMFILE_NONE : TODO(要删除的影像文件不存在)
     */
    MD_RMFILE_NONE("30002002", "要删除的文件不存在"),

    /**
     * @Fields COLLATERAL_WARRANT_NOT_EXIST : TODO(押品不存在)
     */
    COLLATERAL_WARRANT_NOT_EXIST("30000101", "押品不存在"),

    /**
     * @Fields COLLATERAL_WARRANT_DELETED : TODO(押品已被删除)
     */
    COLLATERAL_WARRANT_DELETED("30000102", "押品已被删除"),

    /**
     * @Fields COLLATERAL_WARRANT_USED : TODO(押品正在被使用)
     */
    COLLATERAL_WARRANT_USED("30000103", "押品正在被使用"),

    /**
     * @Fields COLLATERAL_WARRANT_STORAGE : TODO(押品已入库)
     */
    COLLATERAL_WARRANT_STORAGE("30000104", "押品已入库"),

    /**
     * @Fields WARRANT_CUSTOMER_NOT_EXIST : TODO(权属人不存在)
     */
    WARRANT_CUSTOMER_NOT_EXIST("30000105", "权属人不存在"),

    /**
     * @Fields COLLATERAL_REL_CANCEL_INTRODUCED : TODO(押品已取消引入)
     */
    COLLATERAL_REL_CANCEL_INTRODUCED("30000106", "押品已取消引入"),

    /**
     * @Fields ES_VALUE_ERROR : TODO(人工评估价值格式错误)
     */
    ES_VALUE_ERROR("30000107", "人工评估价值格式错误"),

    /**
     * @Fields ES_VALUE_SYS_ERROR : TODO(系统评估价值格式错误)
     */
    ES_VALUE_SYS_ERROR("30000108", "系统评估价值格式错误"),

    /**
     * @Fields WARRANT_CUSTOMER_ERROR : TODO(押品权属人错误)
     */
    WARRANT_CUSTOMER_ERROR("30000109", "押品权属人错误"),

    /**
     * @Fields COLLATERAL_WARRANT_INTRODUCED : TODO(押品已被引入)
     */
    COLLATERAL_WARRANT_INTRODUCED("30000110", "押品已被引入"),

    /**
     * @Fields INCOME_FORMAT_ERROR : TODO(月均收入格式错误)
     */
    INCOME_FORMAT_ERROR("30000111", "月均收入格式错误"),

    /**
     * @Fields CUSTOMER_MATE_NOT_EMPTY : TODO(配偶信息不能为空)
     */
    CUSTOMER_MATE_NOT_EMPTY("30000112", "配偶信息不能为空"),

    /**
     * @Fields HAS_HOUSE_VALUE_ERROR : TODO(是否有房类型值错误)
     */
    HAS_HOUSE_VALUE_ERROR("30000113", "是否有房类型值错误"),

    /**
     * @Fields HAS_VEHICLE_VALUE_ERROR : TODO(是否有车类型值错误)
     */
    HAS_VEHICLE_VALUE_ERROR("30000113", "是否有车类型值错误"),

    /**
     * @Fields CURRENT_HOUSE_AREA_ERROR : TODO(住房面积格式错误)
     */
    CURRENT_HOUSE_AREA_ERROR("30000114", "住房面积格式错误"),

    /**
     * @Fields VEHICLE_NO_ERROR : TODO(车辆数目格式错误)
     */
    VEHICLE_NO_ERROR("30000115", "车辆数目格式错误"),

    /**
     * @Fields APP_VERSION_NOT_USED : TODO(目前没有可使用的文件)
     */
    APP_VERSION_NOT_USED("30000116", "目前没有可使用的文件"),

    /**
     * @Fields LOAN_APPLY_GUARANTOR_REPEAT : TODO(担保人证件号码重复)
     */
    LOAN_APPLY_GUARANTOR_REPEAT("30000119", "担保人证件号码重复"),

    /**
     * @Fields PROCESS_AUDIT_ERROR : TODO(流程审核状态错误)
     */
    PROCESS_AUDIT_ERROR("40001000", "流程审核状态错误"),

    /**
     * @Fields REPLY_AMOUNT_NOT_EMPTY : TODO(批复金额不能为空)
     */
    REPLY_AMOUNT_NOT_EMPTY("40001004", "批复金额不能为空"),

    /**
     * @Fields AUTH_TERM_COUNT_NOT_EMPTY : TODO(批复期限不能为空)
     */
    AUTH_TERM_COUNT_NOT_EMPTY("40001005", "批复期限不能为空"),

    /**
     * @Fields AUTH_TERM_TERM_NOT_EMPTY : TODO(批复期限单位不能为空)
     */
    AUTH_TERM_TERM_NOT_EMPTY("40001006", "批复期限单位不能为空"),

    /**
     * @Fields REPLY_AMOUNT_NOT_RANGE : TODO(批复金额不在范围内)
     */
    REPLY_AMOUNT_NOT_RANGE("40001007", "批复金额不在范围内"),

    /**
     * @Fields AUTH_TERM_COUNT_NOT_RANGE : TODO(批准期限不在范围内)
     */
    AUTH_TERM_COUNT_NOT_RANGE("40001008", "批准期限不在范围内"),

    /**
     * @Fields AUDIT_REJECT_REASON_IS_EMPTY : TODO(退回原因不能为空)
     */
    AUDIT_REJECT_REASON_IS_EMPTY("40001009", "退回原因不能为空"),

    /**
     * @Fields AUDIT_REFUSE_REASON_IS_EMPTY : TODO(拒绝原因不能为空)
     */
    AUDIT_REFUSE_REASON_IS_EMPTY("40001010", "拒绝原因不能为空"),

    /**
     * @Fields LOAN_APPLY_AUDITING_ERROR : TODO(借贷申请非审核中)
     */
    LOAN_APPLY_AUDITING_ERROR("40001011", "借贷申请非审核中"),

    /**
     * @Fields REPAY_TERMCOUNT_IS_EMPTY : TODO(还款间隔不能为空)
     */
    REPAY_TERMCOUNT_IS_EMPTY("40001012", "还款间隔不能为空"),

    /**
     * @Fields REPAY_TERMUNIT_IS_EMPTY : TODO(还款间隔单位不能为空)
     */
    REPAY_TERMUNIT_IS_EMPTY("40001013", "还款间隔单位不能为空"),

    /**
     * @Fields REPLY_TERM_UNIT_NOT_PASS : TODO(批准期限选择"月"，还款间隔不支持选择"日")
     */
    REPLY_TERM_UNIT_NOT_PASS("40001014", "批准期限选择\"月\"，还款间隔不支持选择\"日\""),

    /**
     * @Fields REPAY_TERM_UNIT_NOT_PASS : TODO(还款方式选择"等额本息"，批准期限不支持选择"日")
     */
    REPAY_TERM_UNIT_NOT_PASS("40001015", "还款方式选择\"等额本息\"，批准期限不支持选择\"日\""),

    /**
     * @Fields NEXT_USER_ID_IS_EMPTY : TODO(下一节点审批人id不能为空)
     */
    NEXT_USER_ID_IS_EMPTY("40001016", "下一节点审批人id不能为空"),

    /**
     * @Fields NEXT_USER_NAME_IS_EMPTY : TODO(下一节点审批人姓名不能为空)
     */
    NEXT_USER_NAME_IS_EMPTY("40001017", "下一节点审批人姓名不能为空"),

    /**
     * @Fields DOWN_RAYMENT_AMOUNT_IS_EMPTY : TODO(首付金额不能为空)
     */
    DOWN_RAYMENT_AMOUNT_IS_EMPTY("40001018", "首付金额不能为空"),

    /**
     * @Fields DOWN_RAYMENT_AMOUNT_RULE_ERROR : TODO(首付金额不在允许范围内)
     */
    DOWN_RAYMENT_AMOUNT_RULE_ERROR("40001019", "首付金额不在允许范围内"),

    /**
     * @Fields APPLY_REPLY_AMOUNT_COMPARE_ERROR : TODO(批复金额不能大于申请金额)
     */
    APPLY_REPLY_AMOUNT_COMPARE_ERROR("40001020", "批复金额不能大于申请金额"),

    /**
     * @Fields LOAN_APPLY_PROCESS_TASK_ERROR : TODO(借贷申请已进入下一节点)
     */
    LOAN_APPLY_PROCESS_TASK_ERROR("40001021", "借贷申请已进入下一节点"),

    /**
     * @Fields LOAN_APPLY_NOT_IN_DEAL : TODO(借贷申请不在待办列表中)
     */
    LOAN_APPLY_NOT_IN_DEAL("40001022", "借贷申请不在待办列表中"),

    /**
     * @Fields EXCEPTION : TODO(未知异常通用)
     */
    EXCEPTION("-1", "未知异常");

    private final String retCode;

    private final String retMsg;

    private ResponseConstants(String retCode, String retMsg) {
        this.retCode = retCode;
        this.retMsg = retMsg;
    }

    public String getRetCode() {
        return retCode;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public static String getRetMsg(String retCode) {
        ResponseConstants[] responseConstants = ResponseConstants.values();
        for (ResponseConstants ret : responseConstants) {
            if (ret.getRetCode().equals(retCode)) {
                return ret.getRetMsg();
            }
        }
        return "";
    }
}
