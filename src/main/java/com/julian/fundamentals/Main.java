package com.julian.fundamentals;

import com.julian.fundamentals.Exercises.Car;
import com.julian.fundamentals.Exercises.ElectricCar;
import com.julian.fundamentals.Exercises.Vehicle;
import com.julian.fundamentals.Polymorphism.Animal;
import com.julian.fundamentals.Polymorphism.Cat;
import com.julian.fundamentals.Polymorphism.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    List<Vehicle> vehicles = new ArrayList<>();
    vehicles.add(new Car("TOYOTA", "COROLLA", 2020, 4));
    vehicles.add(new Car("CHEVROLET", "CAMARO SS", 2023, 2));
    vehicles.add(new Car("MAZDA", "CX-30", 2026, 4));
    vehicles.add(new Car("MITSUBISHI", "OUTLANDER", 2006, 4));
    vehicles.add(new Car("LAMBORGHINI", "V8 SUV", 2026, 2));
    ElectricCar tesla = new ElectricCar("Tesla", "Model 3", 2023, 4);
    vehicles.add(tesla);
    System.out.println("Level battery: " + tesla.getBatteryLevel() + "%");
    tesla.chargeBattery(30);
    System.out.println("Final level battery: " + tesla.getBatteryLevel() + "%");
    System.out.println("Electric maintenance: $" + tesla.calculateCostMaintenance());

    for (Vehicle vehicle : vehicles) {
        vehicle.showInfoVehicle();
        System.out.println("Cost maintenance: $" + vehicle.calculateCostMaintenance());
    }



    }

}