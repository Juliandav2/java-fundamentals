package com.julian.fundamentals.OnlineCoursePlatform;

public abstract class User {

    private final String name;
    private final String email;
    private final int id;

    public User (String name, String email, int id) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name cannot be null or blank.");
        }

        this.name = name;

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("The email cannot be null or blank.");
        }

        if (!email.contains("@")) {
            throw new IllegalArgumentException("The email must contain '@'.");
        }

        this.email = email;

        if (id <= 0) {
            throw new IllegalArgumentException("The id must be greater than 0");
        }

        this.id = id;

    }

    public abstract String getRol ();

    @Override
    public String toString() {
        return "Name: " + name + " | Email: " + email + " | Rol: " + getRol();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }
}
