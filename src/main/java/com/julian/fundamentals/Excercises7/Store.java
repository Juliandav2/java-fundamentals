package com.julian.fundamentals.Excercises7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store {

    private String name;
    private List<Product> inventory;
    private Map<String, ShoppingCart> carts;

    public Store (String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name cannot be null or blank");
        }

        this.name = name;
        this.inventory = new ArrayList<>();
        this.carts = new HashMap<>();
    }

    public void addProduct (Product product) {
        inventory.add(product);
    }

    public void createCart (String property) {
        ShoppingCart shoppingCart = new ShoppingCart(property);
        carts.put(property, shoppingCart);
    }

    public ShoppingCart getShoppingCart (String property) {
        ShoppingCart cart = carts.get(property);
        if (cart == null) {
            throw new IllegalArgumentException("The shopping cart does not exist");
        }
        return cart;
    }

    public List<Product> getProductsInStock () {
        List<Product> inStock = new ArrayList<>();
        for (Product product : inventory) {
            if (product instanceof Salable) {
                Salable salable = (Salable) product;
                if (salable.stateStock()) {
                    inStock.add(product);
                }
            }
        }
        return inStock;
    }

    public void getStatistics () {

        int products = inventory.size();
        System.out.println("Total products in inventory: " + products);
        int inStock = 0;
        int outOfStock = 0;

        for (Product product : inventory) {
            if (product instanceof Salable) {
                Salable salable = (Salable) product;
                if (salable.stateStock()) {
                    inStock++;
                } else {
                    outOfStock++;
                }
            }
        }

        System.out.println("How many in stock: " + inStock);
        System.out.println("How many sold out: " + outOfStock);

        Product mostExpensive = null;
        double maxPrice = 0.0;

        for (Product product : inventory) {
            if (product instanceof Salable) {
                Salable salable = (Salable) product;
                if (salable.getPrice() > maxPrice) {
                    maxPrice = salable.getPrice();
                    mostExpensive = product;
                }
            }
        }

        System.out.println("Most expensive product: " + (mostExpensive != null ? mostExpensive.getName() : "None"));

        double totalValue = 0.0;

        for (Product product : inventory) {
            if (product instanceof PhysicalProduct) {
                PhysicalProduct physicalProduct = (PhysicalProduct) product;
                totalValue += physicalProduct.getPrice() * physicalProduct.getStock();
            }
        }
        System.out.println("Total inventory value: " + totalValue);
    }
}
