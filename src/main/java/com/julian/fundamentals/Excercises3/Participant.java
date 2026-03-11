package com.julian.fundamentals.Excercises3;

public abstract class Participant {

    private String name;
    private int age;

    public Participant (String name, int age) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name cannot ne null or blank");
        }

        this.name = name;

        if (age <= 0) {
            throw new IllegalArgumentException("The age cannot be negative");
        }

        this.age = age;
    }

    public Participant (String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name cannot be null or blank");
        }
        this.name = name;
        this.age = 0;
    }

    public abstract String getType ();

    public void showInfo () {
        System.out.println("Name: " + name + " | Age: " + age + " | Type: " + getType());
    }

    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }
}
