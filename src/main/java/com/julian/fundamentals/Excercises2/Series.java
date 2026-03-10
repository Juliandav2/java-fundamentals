package com.julian.fundamentals.Excercises2;

public class Series extends Content implements Reproducible {

    private int numberSeasons;

    public Series (String title, int years, String gender, int numberSeasons) {
        super(title, years, gender);
        this.numberSeasons = numberSeasons;
    }

    @Override
    public String getDescription () {
        return "Series: " + getTitle() + " - " +  numberSeasons + " seasons";
    }

    @Override
    public void reproduce() {
        System.out.println("Reproduce series: " + getTitle());
    }

    @Override
    public int getDurationMinutes() {
        return numberSeasons * 600;
    }
}
