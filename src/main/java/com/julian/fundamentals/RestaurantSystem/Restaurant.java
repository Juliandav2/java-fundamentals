package com.julian.fundamentals.RestaurantSystem;

import com.julian.fundamentals.Exceptions.TableNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Restaurant {

    private final String name;
    private final List<Table> tables;
    private final List<Waiter> waiters;
    private final List<Order> orders;
    private final List<Plate> menu;

    public Restaurant (String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name cannot be null or blank");
        }

        this.name = name;
        this.tables = new ArrayList<>();
        this.waiters = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.menu = new ArrayList<>();
    }

    public void addTable (Table table) {
        tables.add(table);
    }

    public void addWaiter (Waiter waiter) {
        waiters.add(waiter);
    }

    public void addToMenu (Plate plate) {
        menu.add(plate);
    }

    public Order createOrder (int numberTable, Waiter waiter) {
        Table table = tables.stream().filter(table1 -> table1.getNumber() == numberTable).findFirst().orElseThrow(() -> new TableNotFoundException("Table not found: " + numberTable));
        table.occupy();

        return new Order(table, waiter);
    }

    public void closeOrder (Order order) {
        orders.add(order);
        order.getTable().release();
    }

    public List<Table> getTablesAvailable () {
        return tables.stream().filter(table -> table.getTableState().equals(TableState.AVAILABLE)).collect(Collectors.toList());
    }

    public List<String> getMostSoldDishes () {
        return orders.stream().flatMap(order -> order.getPlates().stream()).collect(Collectors.groupingBy(Plate::getName, Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.<String, Long> comparingByValue().reversed()).map(Map.Entry::getKey).collect(Collectors.toList());
    }

    public Waiter getWaiterOfTheDay () {
        return orders.stream().collect(Collectors.groupingBy(Order::getWaiter, Collectors.counting())).entrySet().stream().max(Map.Entry
                .comparingByValue()).orElseThrow(() -> new RuntimeException("There are no orders")).getKey();
    }

    public Map<DishCategory, Long> getReportByCategory () {
        return orders.stream().flatMap(order -> order.getPlates().stream()).collect(Collectors.groupingBy(Plate::getDishCategory,
                Collectors.counting()));
    }
}