package com.phonepe.simplefulfillmentservice.entity;

public class DeleteProductResponse {
    private String msg;

    public DeleteProductResponse(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
