package com.charon.excusedexam.constant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseCode {
    SUCCESS(0, "成功"),
    FAIL(1, "失败");

    private final int code;
    private final String message;
}
