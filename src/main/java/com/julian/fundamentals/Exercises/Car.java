package com.julian.fundamentals.Exercises;

public class Car extends Vehicle {

    private int doorsNumber;

    public Car (String brand, String model, int year, int doorsNumber) {
        super(brand, model, year);
        this.doorsNumber = doorsNumber;
    }

    @Override
    public double calculateCostMaintenance() {

        int ageCar = 2026 - getYear();
        if (ageCar > 5) {
            return 500.0;
        } else {
            return 200.0;
        }
    }

    public int getDoorsNumber () {
        return doorsNumber;
    }
}
