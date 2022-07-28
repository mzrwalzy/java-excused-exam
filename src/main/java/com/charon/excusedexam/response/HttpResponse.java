package com.charon.excusedexam.response;

import com.charon.excusedexam.constant.ResponseCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HttpResponse {
    private int code;
    private String message;
    private Object data;

    public HttpResponse(ResponseCode responseCode, Object data) {
        this.code = responseCode.getCode();
        this.message = responseCode.getMessage();
        this.data = data;
    }

    public HttpResponse(ResponseCode responseCode) {
        this(responseCode, null);
    }

    public static HttpResponse ok() {
        return new HttpResponse(ResponseCode.SUCCESS);
    }

    public static HttpResponse ok(Object data) {
        return new HttpResponse(ResponseCode.SUCCESS, data);
    }

    public static HttpResponse error() {
        return new HttpResponse(ResponseCode.FAIL);
    }

    public static HttpResponse error(Object data) {
        return new HttpResponse(ResponseCode.FAIL, data);
    }
}
