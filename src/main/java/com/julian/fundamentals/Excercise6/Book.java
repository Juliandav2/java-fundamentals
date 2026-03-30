package com.julian.fundamentals.Excercise6;

import com.julian.fundamentals.Exceptions.ProductNotAvailableException;

public class Book extends Material implements Payable {

    private String author;
    private int numPages;
    private boolean available;

    public Book (String title, String code, int publicationYear, String author, int numPages) {
        super(title, code, publicationYear);

        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("The author cannot be null or negative");
        }

        this.author = author;

        if (numPages <= 0) {
            throw new IllegalArgumentException("The pages numbers cannot be negative");
        }

        this.numPages = numPages;
        this.available = true;

    }

    @Override
    public String getType() {
        return "Book";
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void lend() {
        if (!isAvailable()) {
            throw new ProductNotAvailableException("The book is already lent");
        }
        this.available = false;
    }

    @Override
    public void restore() {
        this.available = true;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumPages() {
        return numPages;
    }
}
