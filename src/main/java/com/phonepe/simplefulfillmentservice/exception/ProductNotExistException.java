package com.phonepe.simplefulfillmentservice.exception;

public class ProductNotExistException extends RuntimeException {
    public ProductNotExistException(String e) {
        super(e);
    }
}
