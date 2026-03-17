package com.julian.fundamentals.Excercises7;

public class PhysicalProduct extends Product implements Salable {

    private double price;
    private int stock;
    private double weightKg;

    public PhysicalProduct (String name, String sku, String category, double price, int stock, double weightKg) {
        super(name, sku, category);

        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        }

        this.price = price;

        if (stock <= 0) {
            throw new IllegalArgumentException("The stock must be greater than 0");
        }

        this.stock = stock;

        if (weightKg < 0) {
            throw new IllegalArgumentException("Weight cannot be negative");
        }

        this.weightKg = weightKg;

    }

    @Override
    public String getDescription() {
        return "Physical: " + getName() + " | Price" + price + " | Stock: " + stock;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean stateStock() {
        return stock > 0;
    }

    @Override
    public void sell (int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("the quantity must be greater than 0");
        }
        if (quantity > stock) {
            throw new IllegalStateException("Insufficient stock, stock: " + stock + ", you asked: " + quantity);
        }
        stock -= quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public double getWeightKg() {
        return weightKg;
    }
}
