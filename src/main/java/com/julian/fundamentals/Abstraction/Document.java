package com.julian.fundamentals.Abstraction;

import java.time.LocalDate;

public abstract class Document {

    protected String number;
    protected LocalDate date;

    public Document (String number) {

        this.number = number;
        this.date = LocalDate.now();
    }

    public abstract String generateResume ();

    public String getNumber () {
        return number;
    }
}
