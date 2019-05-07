package com.jd.y.common;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * @author liuchunli3
 * @Description: API 响应数据结构定义
 * @date 2019-03-29 10:27
 */
public class ApiResponse<T> implements Serializable {
    /**
     * 返回码
     */
    private Integer code;
    /**
     * 消息
     */
    private String message;
    /**
     * 返回数据体
     */
    private T data;

    /**
     * @param code
     * @param message
     * @param data
     */
    protected ApiResponse(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> ApiResponse<T> success() {
        return new ApiResponse(HttpStatus.OK.value(), "", null);
    }

    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse(HttpStatus.OK.value(), "", data);
    }

    public static <T> ApiResponse<T> error(Integer code, String message) {
        return error(code, message, null);
    }

    public static <T> ApiResponse<T> error(Integer code, String message, T data) {
        return new ApiResponse(code, message, data);
    }


    public static <T> ApiResponse<T> response(Integer code, String message) {
        return response(code, message, null);
    }

    public static <T> ApiResponse<T> response(Integer code, String message, T data) {
        return new ApiResponse(code, message, data);
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
