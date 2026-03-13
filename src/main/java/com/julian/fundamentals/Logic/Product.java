package com.julian.fundamentals.Logic;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private String name;
    private double price;
    private String category;

    public Product (String name, double price, String category) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name cannot be null or negative");
        }

        this.name = name;

        if (price < 0) {
            throw new IllegalArgumentException("The price cannot be negative");
        }

        this.price = price;

        if (category == null || category.isBlank()) {
            throw new IllegalArgumentException("The category cannot be null or negative");
        }

        this.category = category;

    }

    public double calculateFinalTotal(List<Product> products) {
        double total = 0;

        for (Product product : products) {
            if (product.getCategory().equals("FOOD")) {
                total += product.getPrice() * 0.80;
            } else {
                total += product.getPrice();
            }
        }

        return total;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
}
