package com.example.usermanagement.common;

import lombok.Getter;

@Getter
public enum CodeEnum {
    SUCCESS("200", "Success"),
    ERROR("500", "Error");

    private final String code;
    private final String message;

    CodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
