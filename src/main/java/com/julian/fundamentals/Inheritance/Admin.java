package com.julian.fundamentals.Inheritance;

public class Admin extends User {

    private String levelAccess;

    public Admin (String name, String email, String levelAccess) {
        super(name, email);
        this.levelAccess = levelAccess;
    }

    public void manageSystem () {
        System.out.println(getName() + "Manage system with access: " + levelAccess);
    }
}
