package com.julian.fundamentals.Excercises8;

public class Bus extends Vehicle implements Transportable {

    private final int capacity;
    private int occupation;

    public Bus (String plate, String brand, int year, int capacity) {
        super(plate, brand, year);

        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity cannot be 0 or negative");
        }

        this.capacity = capacity;
        this.occupation = 0;
    }

    @Override
    public void board(int passengers) {

        if (occupation + passengers > capacity) {
            throw new IllegalArgumentException("No space");
        } else {
            occupation += passengers;
            System.out.println("Successful approach. Current occupation: " + occupation);
        }
    }

    @Override
    public void deplane(int passengers) {

        if (passengers > occupation) {
            throw new IllegalArgumentException("There are not enough passengers");
        } else if (passengers < 0) {
            throw new IllegalArgumentException("The number of passengers cannot be negative");
        } else {
            occupation -= passengers;
            System.out.println("Successful landing. Current occupation: " + occupation);
        }
    }

    @Override
    public String getType() {
        return "Bus";
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public int getOccupation() {
        return occupation;
    }
}
