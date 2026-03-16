package com.julian.fundamentals.Excercise6;

public class Magazine extends Material implements Payable {

    private int edition;
    private boolean available;

    public Magazine (String title, String code, int publicationYear, int edition) {
        super(title, code, publicationYear);

        if (edition <= 0) {
            throw new IllegalArgumentException("Edition must be positive");
        }

        this.edition = edition;
        this.available = true;

    }

    @Override
    public String getType() {
        return "Magazine";
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void lend() {
        if (!isAvailable()) {
            throw new IllegalStateException("The magazine has already been loaned out");
        }
        this.available = false;
    }

    @Override
    public void restore() {
        this.available = true;
    }

    public int getEdition() {
        return edition;
    }
}
