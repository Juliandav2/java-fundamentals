package com.julian.fundamentals.Exceptions;

public class EmptyCartException extends RuntimeException {
    public EmptyCartException (String message) {
        super(message);
    }
}
