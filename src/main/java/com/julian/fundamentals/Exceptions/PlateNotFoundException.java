package com.julian.fundamentals.Exceptions;

public class PlateNotFoundException extends RuntimeException {
    public PlateNotFoundException(String message) {
        super(message);
    }
}
