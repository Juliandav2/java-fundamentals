package com.julian.fundamentals.RestaurantSystem;

public class Waiter {

    private final String name;
    private final int id;

    public Waiter (String name, int id) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name cannot be null or blank");
        }

        this.name = name;

        if (id <= 0) {
            throw new IllegalArgumentException("The id must be greater than 0");
        }

        this.id = id;
    }

    @Override
    public String toString () {
        return "Name: " + name + " | ID: " + id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
