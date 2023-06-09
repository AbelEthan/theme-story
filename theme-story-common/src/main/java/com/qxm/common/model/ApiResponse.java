package com.qxm.common.model;

import lombok.Data;

/**
 * @ClassName: {@link ApiResponse}
 * @Author: AbelEthan
 * @Email AbelEthan@126.com
 * @Date 2023/5/31 17:30
 * @Describes 统一返回对象
 */
@Data
public final class ApiResponse {

    private Integer code;
    private String errorMsg;
    private Object data;

    private ApiResponse(int code, String errorMsg, Object data) {
        this.code = code;
        this.errorMsg = errorMsg;
        this.data = data;
    }

    public static ApiResponse ok() {
        return ok(null);
    }

    public static ApiResponse ok(Object data) {
        return new ApiResponse(0, "", data);
    }

    public static ApiResponse error(String errorMsg) {
        return new ApiResponse(0, errorMsg, null);
    }
}