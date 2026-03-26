package com.julian.fundamentals.Excercises8;

public abstract class Vehicle {

    private final String plate;
    private final String brand;
    private final int year;

    public Vehicle (String plate, String brand, int year) {

        if (plate == null || plate.isBlank()) {
            throw new IllegalArgumentException("The plate cannot be null or blank");
        }

        this.plate = plate;

        if (brand == null || brand.isBlank()) {
            throw new IllegalArgumentException("The brand cannot be null or blank");
        }

        this.brand = brand;

        if (year < 1990 || year > 2026) {
            throw new IllegalArgumentException("Invalid year");
        }

        this.year = year;
    }

    public abstract String getType ();

    public void showInfo () {
        System.out.println("Plate: " + plate + " | Brand: " + brand + " | Year: " + year + "| Type: " + getType());
    }

    public String getPlate() {
        return plate;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
}
