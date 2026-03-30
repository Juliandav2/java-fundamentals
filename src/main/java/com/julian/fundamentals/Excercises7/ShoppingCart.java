package com.julian.fundamentals.Excercises7;

import com.julian.fundamentals.Exceptions.EmptyCartException;
import com.julian.fundamentals.Exceptions.InsufficientStockException;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<Salable, Integer> items;
    private String property;

    public ShoppingCart (String property) {

        if (property == null || property.isBlank()) {
            throw new IllegalArgumentException("The property cannot be null or negative");
        }

        this.property = property;
        this.items = new HashMap<>();
    }

    public void addItem (Salable salable, int quantity) {
        if (items.containsKey(salable)) {
            items.compute(salable, (k, currentQuantity) -> currentQuantity + quantity);
        } else {
            items.put(salable, quantity);
        }
    }

    public void deleteItem (Salable salable) {
        if (!items.containsKey(salable)) {
            throw new IllegalArgumentException("Product not found");
        } else {
            items.remove(salable);
        }
    }

    public double getTotal () {
        double total = 0.0;
        for (Map.Entry<Salable, Integer> entry : items.entrySet()) {
            Salable product = entry.getKey();
            int quantity = entry.getValue();
            total += product.getPrice() * quantity;
        }

        return total;
    }

    public String getProperty() {
        return property;
    }

    public void showShoppingCart () {
        for (Map.Entry<Salable, Integer> entry : items.entrySet()) {
            Salable product = entry.getKey();
            int quantity = entry.getValue();
            double subtotal = product.getPrice() * quantity;
            System.out.println(((Product) product).getName() + " | Quantity: " + quantity + " | Subtotal: $" + subtotal);
        }

        System.out.println("Total: $" + getTotal());

    }

    public void makePurchase() {
        if (items.isEmpty()) {
            throw new EmptyCartException("The cart is empty");
        }

        for (Map.Entry<Salable, Integer> entry : items.entrySet()) {
            Salable product = entry.getKey();
            int quantity = entry.getValue();
            try {
                product.sell(quantity);
                System.out.println("Sold: " + quantity + " units");
            } catch (InsufficientStockException e) {
                System.out.println("Insufficient stock - Available: " + e.getAvailableStock()
                        + " | Requested: " + e.getSolicitedStock());
            } catch (Exception e) {
                System.out.println("Error selling product: " + e.getMessage());
            }
        }

        items.clear();
    }
}
