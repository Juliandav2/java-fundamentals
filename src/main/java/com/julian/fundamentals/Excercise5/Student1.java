package com.julian.fundamentals.Excercise5;

import java.util.ArrayList;
import java.util.List;

public class Student1 extends Person implements Evaluable {

    private String universityDegree;
    private List<Double> notes;

    public Student1(String name, String id, String universityDegree) {
        super(name, id);

        if (universityDegree == null || universityDegree.isBlank()) {
            throw new IllegalArgumentException("The university degree cannot be null or blank");
        }

        this.universityDegree = universityDegree;

        notes = new ArrayList<>();
    }

    public void addNote (double note) {

        if (note < 0.0 || note > 10.0) {
            throw new IllegalArgumentException("Invalid note");
        }

        notes.add(note);
    }

    @Override
    public String getRol() {
        return "Student";
    }

    @Override
    public double getAverage() {
        double average = 0;
        for (double note : notes) {
            average += note;
        }

        if (notes.isEmpty()) {
            return 0.0;
        }

        return average / notes.size();
    }

    @Override
    public boolean approve() {
        return getAverage() >= 6.0;
    }

    public String getUniversityDegree() {
        return universityDegree;
    }

    public List<Double> getNotes() {
        return notes;
    }
}
