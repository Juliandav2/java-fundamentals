package com.julian.fundamentals.Excercise6;

public abstract class Material {

    private String title;
    private String code;
    private int publicationYear;

    public Material (String title, String code, int publicationYear) {

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("The title cannot be null or negative");
        }

        this.title = title;

        if (code == null || code.isBlank()) {
            throw new IllegalArgumentException("The code cannot be null or negative");
        }

        this.code = code;

        if (publicationYear < 1800 || publicationYear > 2026) {
            throw new IllegalArgumentException("Invalid publication year");
        }

        this.publicationYear = publicationYear;
    }

    public abstract String getType ();

    public void showInfo () {
        System.out.println("Title: " + title + " | Code: " + code + " | Year: " + publicationYear + " | Type: " + getType());
    }

    public String getTitle() {
        return title;
    }

    public String getCode() {
        return code;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}
