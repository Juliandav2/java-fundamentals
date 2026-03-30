package com.julian.fundamentals.Exceptions;

public class ProductNotAvailableException extends RuntimeException {
    public ProductNotAvailableException (String message) {
        super(message);
    }
}
