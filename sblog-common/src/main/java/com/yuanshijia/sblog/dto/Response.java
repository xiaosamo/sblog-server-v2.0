package com.yuanshijia.sblog.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.yuanshijia.sblog.enums.ResponseEnum;
import lombok.Getter;

import java.io.Serializable;

/**
 * 返回结果的封装
 * status=0 表示成功
 * @author yuan
 * @param <T>
 */
@Getter
public class Response<T> implements Serializable {

    private Integer status;
    private String msg;
    private T data;

    private Response(Integer status) {
        this.status = status;
    }

    private Response(Integer status, T data) {
        this.status = status;
        this.data = data;
    }

    private Response(Integer status, String msg, T data) {
        this.status = status;
        this.data = data;
        this.msg = msg;
    }

    private Response(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    /**
     * JsonIgnore：使方法不在json序列号中，不返回给前台
     * @return
     */
    @JsonIgnore
    public boolean isSuccess() {
        return this.status.equals(ResponseEnum.SUCCESS.getCode());
    }


    public static <T> Response<T> success(){
        return new Response<T>(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getDesc());
    }

    public static <T> Response<T> successMsg(String msg){
        return new Response<T>(ResponseEnum.SUCCESS.getCode(),msg);
    }

    public static <T> Response<T> success(T data){
        return new Response<T>(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getDesc(), data);
    }

    public static <T> Response<T> successMsg(String msg, T data){
        return new Response<T>(ResponseEnum.SUCCESS.getCode(),msg,data);
    }

    public static <T> Response<T> error() {
        return new Response<>(ResponseEnum.ERROR.getCode(), ResponseEnum.ERROR.getDesc());
    }

    public static <T> Response<T> error(String errorMsg) {
        return new Response<>(ResponseEnum.ERROR.getCode(), errorMsg);
    }

    public static <T> Response<T> errorMsg(Integer errorCode, String errorMsg) {
        return new Response<>(errorCode, errorMsg);
    }

    public static <T> Response<T> errorMsg(ResponseEnum resultEnum) {
        return new Response<>(resultEnum.getCode(), resultEnum.getDesc());
    }


}
