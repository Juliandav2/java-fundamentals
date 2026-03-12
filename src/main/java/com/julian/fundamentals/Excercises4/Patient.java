package com.julian.fundamentals.Excercises4;

public class Patient extends Person implements Serviceable {

    private int age;
    private String diagnosis;
    private int priority;

    public Patient (String name, String id, int age, String diagnosis, int priority) {
        super(name, id);

        if (age <= 0 || age > 2026) {
            throw new IllegalArgumentException("Invalid age");
        }

        this.age = age;

        if (diagnosis == null || diagnosis.isBlank()) {
            throw new IllegalArgumentException("The diagnosis cannot be null or blank");
        }

        this.diagnosis = diagnosis;

        if (priority <= 0) {
            throw new IllegalArgumentException("The priority cannot be negative");
        }

        if (priority > 10) {
            throw new IllegalArgumentException("The priority cannot be greater than 10");
        }

        this.priority = priority;
    }

    @Override
    String getRol() {
        return "Patient";
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public String getState() {

        if (priority >= 7) {
            return "URGENT";

        } else if (priority >= 4) {
            return "MODERATE";

        } else {
            return "MILD";
        }
    }

    public int getAge () {
        return age;
    }

    public String getDiagnosis () {
        return diagnosis;
    }
}
