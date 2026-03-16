package com.julian.fundamentals.Excercise6;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private String email;
    private List<Material> borrowedMaterials;

    public User (String name, String email) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Thee name cannot be null or negative");
        }

        this.name = name;

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("The email cannot be null or negative and it has to contain @");
        }

        if (!email.contains("@"))
            throw new IllegalArgumentException("The email not contains @");

        this.email = email;
        this.borrowedMaterials = new ArrayList<>();
    }

    public void borrow (Material material) {
        Payable payable = (Payable) material;
        payable.lend();
        borrowedMaterials.add(material);
    }

    public void returnMaterial (Material material) {
        Payable payable = (Payable) material;
        payable.restore();
        borrowedMaterials.remove(material);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Material> getBorrowedMaterials() {
        return borrowedMaterials;
    }
}
