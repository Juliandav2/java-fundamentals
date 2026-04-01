package com.julian.fundamentals.RestaurantSystem;

import com.julian.fundamentals.Exceptions.PlateNotFoundException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private final Table table;
    private final Waiter waiter;
    private final List<Plate> plates;
    private final LocalDateTime hour;

    public Order (Table table, Waiter waiter) {

        this.table = table;
        this.waiter = waiter;
        this.plates = new ArrayList<>();
        this.hour = LocalDateTime.now();

    }

    public void addPlate (Plate plate) {

        plates.add(plate);
    }

    public void removePlate (Plate plate) {

        if (!plates.contains(plate)) {
            throw new PlateNotFoundException("Dish is not on the order");
        }

        plates.remove(plate);
    }

    public double calculateTotal () {
        return plates.stream().mapToDouble(Plate::getPrice).sum();
    }

    public double calculateTotalWithTip (double percent) {
        double total = calculateTotal();
        return total + (total * percent / 100);
    }

    @Override
    public String toString () {
        return String.format("Table: %s | Waiter: %s | Hora: %s | Plates: %d | Total: $%,.0f",
                table.getNumber(), waiter.getName(), hour, plates.size(), calculateTotal());
    }

    public Table getTable() {
        return table;
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public List<Plate> getPlates() {
        return plates;
    }

    public LocalDateTime getHour() {
        return hour;
    }
}
