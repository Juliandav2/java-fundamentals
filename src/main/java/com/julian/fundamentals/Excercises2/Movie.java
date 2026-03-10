package com.julian.fundamentals.Excercises2;

public class Movie  extends Content implements Reproducible {

    private int durationMinutes;

    public Movie (String title, int years, String gender, int durationMinutes) {
        super(title, years, gender);

        if (durationMinutes <= 0) {
            throw new IllegalArgumentException("The minutes cannot be negative");
        }

        this.durationMinutes = durationMinutes;
    }

    @Override
    public String getDescription () {
        return "Movie: " + getTitle() + " (" + getYears() + ")";
    }

    @Override
    public void reproduce () {
        System.out.println("Reproduce movie: " + getTitle());
    }

    @Override
    public int getDurationMinutes () {
        return durationMinutes;
    }
}
