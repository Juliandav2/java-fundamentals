package com.julian.fundamentals.RestaurantSystem;

public class Plate {

    private final String name;
    private final double price;
    private final DishCategory dishCategory;

    public Plate (String name, double price, DishCategory dishCategory) {

        assert name != null;
        if (name.isBlank()) {
            throw new IllegalArgumentException("The name cannot be null or blank");
        }

        this.name = name;

        if (price <= 0) {
            throw new IllegalArgumentException("The price must be greater than 0");
        }

        this.price = price;
        this.dishCategory = dishCategory;
    }

    @Override
    public String toString () {
        return "Name: " + name + " | Price: " + price + " Category: " + dishCategory;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public DishCategory getDishCategory() {
        return dishCategory;
    }
}
