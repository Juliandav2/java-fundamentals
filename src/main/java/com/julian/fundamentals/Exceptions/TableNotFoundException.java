package com.julian.fundamentals.Exceptions;

public class TableNotFoundException extends RuntimeException {
    public TableNotFoundException(String message) {
        super(message);
    }
}
