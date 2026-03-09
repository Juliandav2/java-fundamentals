package com.julian.fundamentals.Inheritance;

public class User {

    private String name;
    private String email;

    public User (String name, String email) {

        this.name = name;
        this.email = email;
    }

    public void showInfo () {
        System.out.println("User: " + name + " Email: " + email);
    }

    public String getName () {
        return name;
    }

    public String getEmail () {
        return email;
    }
}
