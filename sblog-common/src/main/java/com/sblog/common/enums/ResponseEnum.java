package com.sblog.common.enums;


import lombok.Getter;


/**
 * @author ysj
 */

@Getter
public enum ResponseEnum {
    /**
     * 成功
     */
    SUCCESS(0,"SUCCESS"),
    /**
     * 失败
     */
    ERROR(1,"ERROR"),
    /**
     * 需要登入
     */
    NEED_LOGIN(10,"NEED_LOGIN"),

    /**
     * 非法参数
     */
    ILLEGAL_ARGUMENT(2, "ILLEGAL_ARGUMENT"),

    /**
     * 用户无权限访问
     */
    NO_PERMISSIONS(403,"无权限"),

    /**
     * 没有token认证
     */
    NO_AUTHENTICATION(401, "未授权"),

    ;
    private final int code;
    private final String desc;

    ResponseEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
