package com.julian.fundamentals.Excercises2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Catalog {

    private List<Content> contents;
    private Map<String, Integer> countForGender;

    public Catalog () {

        contents = new ArrayList<>();
        countForGender = new HashMap<>();

    }

    public void addContent (Content content) {

        contents.add(content);
        String gender = content.getGender();
        countForGender.put(gender, countForGender.getOrDefault(gender, 0) + 1);
    }

    public void showCatalog () {
        for (Content content : contents) {
            System.out.println(content.getDescription());
        }
    }

    public List<Content> getOnlyMovies () {
        List<Content> movies = new ArrayList<>();
        for (Content movie : contents) {
            if (movie instanceof Movie) {
                movies.add(movie);
            }
        }

        return movies;
    }

    public String genderMustPopular () {

        String genderWinner = null;
        int popularTitles = 0;

        for (Map.Entry<String, Integer> entry : countForGender.entrySet()) {
            if (entry.getValue() > popularTitles) {
                popularTitles = entry.getValue();
                genderWinner = entry.getKey();
            }
        }

        return genderWinner;

    }

    public double getTotalHoursContent () {

        int totalMinutes = 0;

        for (Content content : contents) {
            if (content instanceof Reproducible) {
                Reproducible reproducible = (Reproducible) content;
                totalMinutes += reproducible.getDurationMinutes();
            }

        }

        return totalMinutes / 60.0;

    }
}
