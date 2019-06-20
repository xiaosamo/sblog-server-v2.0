package com.sblog.common.utils;

/**
 * @author yuan
 * @date 2019/6/20
 * @description
 */
public class ParamUtil {
    public static void notNull(String param) {
        if (param == null) {
            // todo
            throw new NullPointerException();
        }
    }
}
