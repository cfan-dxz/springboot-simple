package com.example.mydemo.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class ApiResponse<T> {
    @ApiModelProperty(value = "消息", dataType = "String", example = "响应消息")
    @JsonProperty("msg")
    private String msg;

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @ApiModelProperty(value = "代码", dataType = "Integer", example = "200")
    @JsonProperty("code")
    private Integer code;

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @ApiModelProperty(value = "成功", dataType = "Boolean", example = "true")
    @JsonProperty("success")
    private Boolean success;

    public Boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @ApiModelProperty(value = "数据", dataType = "T", example = "{}")
    @JsonProperty("data")
    private T data;

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> ApiResponse init(T data, Boolean success, Integer code, String msg) {
        ApiResponse<T> dto = new ApiResponse<T>();
        dto.setData(data);
        dto.setSuccess(success);
        dto.setCode(code);
        dto.setMsg(msg);
        return dto;
    }

    /**
     * 成功响应
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ApiResponse success(T data) {
        return ApiResponse.init(data, true, 0, null);
    }

    /**
     * 错误响应
     *
     * @param msg
     * @return
     */
    public static ApiResponse error(String msg) {
        return ApiResponse.error(msg, 100);
    }

    /**
     * 错误响应
     *
     * @param msg
     * @param code
     * @return
     */
    public static ApiResponse error(String msg, Integer code) {
        return ApiResponse.init(null, false, code, msg);
    }
}
