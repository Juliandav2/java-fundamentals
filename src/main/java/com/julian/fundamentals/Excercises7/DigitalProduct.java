package com.julian.fundamentals.Excercises7;

public class DigitalProduct extends Product implements Salable {

    private double price;
    private int licence;

    public DigitalProduct (String name, String sku, String category, double price, int licence) {
        super(name, sku, category);

        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        }

        this.price = price;

        if (licence < 0) {
            throw new IllegalArgumentException("Licence cannot be negative");
        }

        this.licence = licence;
    }

    @Override
    public String getDescription() {
        return "Digital: " + getName() + " | Price: $" + price + " | Licences: " + licence;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean stateStock() {
        return licence > 0;
    }

    @Override
    public void sell(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("The quantity must be greater than 0");
        }
        if (quantity > licence) {
            throw new IllegalStateException("Insufficient licenses: there are: " + licence + ", you asked: " + quantity);
        }
        licence -= quantity;
    }

    public int getLicence() {
        return licence;
    }
}
