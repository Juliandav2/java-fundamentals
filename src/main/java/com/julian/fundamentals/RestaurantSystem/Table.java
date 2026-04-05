package com.julian.fundamentals.RestaurantSystem;

public class Table {

    private final int number;
    private final int capacity;
    private TableState tableState;

    public Table (int number, int capacity, TableState tableState) {

        if (number <= 0) {
            throw new IllegalArgumentException("The number of table must be greater than 0");
        }

        this.number = number;

        if (capacity <= 0) {
            throw new IllegalArgumentException("The capacity must be greater than 0");
        }

        this.capacity = capacity;
        this.tableState = tableState;
    }

    public void occupy () {

        if (!tableState.equals(TableState.AVAILABLE)) {
            throw new IllegalStateException("Table not available");
        }

        this.tableState = TableState.BUSY;
    }

    public void release () {

        this.tableState = TableState.AVAILABLE;
    }

    public String toString () {
        return "Table number: " + number + " | Capacity: " + capacity + " | State: " + tableState;
    }

    public int getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public TableState getTableState() {
        return tableState;
    }
}
