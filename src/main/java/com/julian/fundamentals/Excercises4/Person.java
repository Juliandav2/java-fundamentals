package com.julian.fundamentals.Excercises4;

public abstract class Person {

    private String name;
    private String id;

    public Person (String name, String id) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name cannot be null or blank");
        }

        this.name = name;

        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("The ID cannot be null or blank");
        }

        this.id = id;
    }

    abstract String getRol ();

    public void showInfo () {
        System.out.println("Name: " + name + " | ID: " + id + " | Rol: " + getRol());
    }

    public String getName () {
        return name;
    }

    public String getId () {
        return id;
    }
}
