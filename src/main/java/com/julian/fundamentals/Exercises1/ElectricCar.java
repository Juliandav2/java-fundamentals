package com.julian.fundamentals.Exercises1;

public class ElectricCar extends Car implements Electric {

    private int batteryLevel;

    public ElectricCar (String brand, String model, int year, int doorsNumber) {
        super(brand, model, year, doorsNumber);
        this.batteryLevel = 50;
    }

    @Override
    public void chargeBattery (int percent) {

        if (percent <= 0) {
            throw new IllegalArgumentException("The percent cannot be negative");
        }
        batteryLevel = Math.min(100, batteryLevel + percent);
        System.out.println("Battery charged: " + batteryLevel + "%");
    }

    @Override
    public int getBatteryLevel () {
        return batteryLevel;
    }

    @Override
    public double calculateCostMaintenance () {
        return super.calculateCostMaintenance() / 2;
    }
}
