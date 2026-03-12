package com.julian.fundamentals.Exercises1;

public abstract class Vehicle {

    private String brand;
    private String model;
    private int year;

    public Vehicle (String brand, String model, int year) {

        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public abstract double calculateCostMaintenance ();

    public void showInfoVehicle () {
        System.out.println(brand + " " + model + " (" + year + ")");
    }

    public String getBrand () {
        return brand;
    }

    public String getModel () {
        return model;
    }

    public int getYear () {
        return year;
    }
}
