package com.julian.fundamentals.Collections;

import com.julian.fundamentals.Exercises.ElectricCar;
import com.julian.fundamentals.Exercises.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concessionaire {

    private List<Vehicle> inventory;
    private Map<String, Integer> counterByBrand;

    public Concessionaire () {

        inventory = new ArrayList<>();
        counterByBrand = new HashMap<>();
    }

    public void addVehicle (Vehicle vehicle) {

        inventory.add(vehicle);
        String brand = vehicle.getBrand();
        counterByBrand.put(brand, counterByBrand.getOrDefault(brand, 0) + 1);
    }

    public void showInventory () {

        System.out.println("----- INVENTORY -----");
        for (Vehicle vehicle : inventory) {
            vehicle.showInfoVehicle();
            System.out.println("Cost maintenance: $" + vehicle.calculateCostMaintenance());
        }

        System.out.println("Total vehicles: " + inventory.size());
    }

    public String getBrandWithMustVehicles () {

        String brandWinner = null;
        int maxQuantity = 0;

        for (Map.Entry<String, Integer> entry : counterByBrand.entrySet()) {
            if (entry.getValue() > maxQuantity) {
                maxQuantity = entry.getValue();
                brandWinner = entry.getKey();
            }
        }

        return brandWinner;
    }

    public List<Vehicle> getElectricVehicles () {

        List<Vehicle> electrics = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle instanceof ElectricCar) {
                electrics.add(vehicle);
            }
        }

        return electrics;
    }
}
