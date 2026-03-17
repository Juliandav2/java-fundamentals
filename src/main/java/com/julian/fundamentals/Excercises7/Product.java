package com.julian.fundamentals.Excercises7;

public abstract class Product {

    private String name;
    private String sku;
    private String category;

    public Product (String name, String sku, String category) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name cannot be null or blank");
        }

        this.name = name;

        if (sku == null || sku.isBlank()) {
            throw new IllegalArgumentException("The sku cannot be null or blank");
        }

        this.sku = sku;

        if (category == null || category.isBlank()) {
            throw new IllegalArgumentException("The category cannot be null or blank");
        }

        this.category = category;

    }

    public abstract String getDescription ();

    public void showInfo () {
        System.out.println("Name: " + name + " | Sku: " + sku + " | Category : " + category);
    }

    public String getName() {
        return name;
    }

    public String getSku() {
        return sku;
    }

    public String getCategory() {
        return category;
    }
}
