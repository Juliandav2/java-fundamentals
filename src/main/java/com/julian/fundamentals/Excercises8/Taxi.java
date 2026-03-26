package com.julian.fundamentals.Excercises8;

public class Taxi extends Vehicle implements Transportable {

    private final int capacity;
    private int occupation;
    private final double fee;

    public Taxi (String plate, String brand, int year, double fee) {
        super(plate, brand, year);

        if (fee <= 0.0) {
            throw new IllegalArgumentException("Invalid fee");
        }

        this.fee = fee;
        this.capacity = 4;
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
        return "Taxi";
    }

    @Override
    public int getCapacity() {
        return 0;
    }

    @Override
    public int getOccupation() {
        return 0;
    }

    public double getFee() {
        return fee;
    }
}
