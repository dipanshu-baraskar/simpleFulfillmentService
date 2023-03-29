package com.phonepe.simplefulfillmentservice.exception;

import com.phonepe.simplefulfillmentservice.error.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class InventoryExceptionHandler {


    @ExceptionHandler(value = ProductNotExistException.class)
    public ResponseEntity<Error> productNotExistException(ProductNotExistException exception) {
        Error error = new Error(400, exception.getMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = InvalidQuantityException.class)
    public ResponseEntity<Error> invalidQuantityException(InvalidQuantityException exception) {
        Error error = new Error(400, exception.getMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = EmptyCartException.class)
    public ResponseEntity<Error> invalidQuantityException(EmptyCartException exception) {
        Error error = new Error(400, exception.getMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
