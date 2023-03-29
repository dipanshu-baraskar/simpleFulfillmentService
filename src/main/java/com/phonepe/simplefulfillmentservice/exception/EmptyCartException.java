package com.phonepe.simplefulfillmentservice.exception;

public class EmptyCartException extends RuntimeException {
    public EmptyCartException(String e) {
        super(e);
    }
}
