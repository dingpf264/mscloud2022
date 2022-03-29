package com.kass.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class CommonResult<T> implements Serializable {

    private int code;
    private String msg;
    private T t;

    public CommonResult() {
    }

    public CommonResult(int code, String msg, T t) {
        this.code = code;
        this.msg = msg;
        this.t = t;
    }


}
