package com.qroxy.crud.common;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;

/**
 * @author: Qroxy
 * *
 * QQ：1114031075
 * *
 * 时间: 2018/9/28-7:06 PM
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
//保证序列化的时候，如果是null的对象，key也会消失
public class ServerRespond<T> implements Serializable {

    private int status;

    public int getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    private String msg;
    private T data;

    private ServerRespond(int status, T data) {
        this.status = status;
        this.data = data;
    }

    private ServerRespond(int status) {
        this.status = status;

    }

    private ServerRespond(int status, String msg, T data) {
        this.status = status;
        this.data = data;
        this.msg = msg;
    }

    private ServerRespond(int status, String msg) {
        this.status = status;

        this.msg = msg;
    }

    @JsonIgnore
//    使之不再序列化结果中
    public boolean isSuccess() {
        return this.status == ResponseCode.SUCCESS.getCode();
    }

    public static <T> ServerRespond<T> createBySuccess() {
        return new ServerRespond<T>(ResponseCode.SUCCESS.getCode());
    }

    public static <T> ServerRespond<T> createBySuccessMessage(String msg) {
        return new ServerRespond<T>(ResponseCode.SUCCESS.getCode(), msg);
    }

    public static <T> ServerRespond<T> createBySuccess(T data) {
        return new ServerRespond<T>(ResponseCode.SUCCESS.getCode(), data);
    }

    public static <T> ServerRespond<T> createBySuccess(int status, String msg, T data) {
        return new ServerRespond<T>(ResponseCode.SUCCESS.getCode(), msg, data);
    }

    public static <T> ServerRespond<T> createBySuccess(String msg, T data) {
        return new ServerRespond<T>(ResponseCode.SUCCESS.getCode(), msg, data);
    }

    public static <T> ServerRespond<T> createByError() {
        return new ServerRespond<T>(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getDesc());
    }

    public static <T> ServerRespond<T> createByErrorMessage(String errorMsg) {
        return new ServerRespond<T>(ResponseCode.ERROR.getCode(), errorMsg);
    }

    public static <T> ServerRespond<T> createByErrorMessage(int errorCode, String errorMessage) {
        return new ServerRespond<T>(errorCode, errorMessage);
    }
}
