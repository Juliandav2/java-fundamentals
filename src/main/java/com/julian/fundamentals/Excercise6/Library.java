package com.julian.fundamentals.Excercise6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    private String name;
    private List<Material> catalog;
    private Map<String, User> users;

    public Library (String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name cannot be null or blank");
        }

        this.name = name;
        this.catalog = new ArrayList<>();
        this.users = new HashMap<>();

    }

    public void userRegister (User user) {
        users.put(user.getEmail(), user);
    }

    public void addMaterial (Material material) {
        catalog.add(material);
    }

    public User searchUser (String email) {
        User user = users.get(email);
        if (user == null) {
            throw new IllegalArgumentException("User not found: " + email);
        }
        return user;
    }

    public List<Material> getMaterialsAvailable () {
        List<Material> materialsAvailable = new ArrayList<>();
        for (Material material : catalog) {
            if (material instanceof Payable) {
                Payable payable = (Payable) material;
                if (payable.isAvailable()) {
                    materialsAvailable.add(material);
                }
            }
        }

        return materialsAvailable;
    }

    public void getStatistics () {

        int materials = catalog.size();
        System.out.println("Total materials: " + materials);
        int available = 0;
        int lent = 0;
        int books = 0;
        int magazines = 0;
        User topUser = null;
        int maxBorrowed = 0;

        for (Material material : catalog) {
            if (material instanceof Payable) {
                Payable payable = (Payable) material;
                if (payable.isAvailable()) {
                    available++;
                } else {
                    lent++;
                }
            }


        }

        System.out.println("Available: " + available);
        System.out.println("Lent: " + lent);

        for (Material material : catalog) {
            if (material instanceof Book) {
                books++;
            }
            if (material instanceof Magazine) {
                magazines++;
            }

        }

        System.out.println("Books: " + books);
        System.out.println("Magazines: " + magazines);

        for (User user : users.values()) {
            if (user.getBorrowedMaterials().size() > maxBorrowed) {
                maxBorrowed = user.getBorrowedMaterials().size();
                topUser = user;
            }
        }


        System.out.println("User with most borrowed: " + (topUser != null ? topUser.getName() : "None"));
    }

}
