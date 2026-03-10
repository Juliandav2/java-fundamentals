package com.julian.fundamentals.Excercises2;

public abstract class Content {

    private String title;
    private int years;
    private String gender;

    public Content (String title, int years, String gender) {

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("The title cannot be null or blank");
        }

        this.title = title;

        if (years <= 0 || years > 2026) {
            throw new IllegalArgumentException("The year cannot be less than 0 or greater than the current year");
        }

        this.years = years;

        if (gender == null || gender.isBlank()) {
            throw new IllegalArgumentException("The gender cannot be null or blank");
        }

        this.gender = gender;
    }

    public abstract String getDescription ();

    public void showInfo () {
        System.out.println(title + " Year: " + years + " Gender: " + gender);
    }

    public String getTitle () {
        return title;
    }

    public String getGender () {
        return gender;
    }

    public int getYears () {
        return years;
    }
}

