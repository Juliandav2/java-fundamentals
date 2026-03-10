package com.julian.fundamentals;

import com.julian.fundamentals.Collections.Concessionaire;
import com.julian.fundamentals.Excercises2.Catalog;
import com.julian.fundamentals.Excercises2.Content;
import com.julian.fundamentals.Excercises2.Movie;
import com.julian.fundamentals.Excercises2.Series;
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

//    List<Vehicle> vehicles = new ArrayList<>();
//    vehicles.add(new Car("TOYOTA", "COROLLA", 2020, 4));
//    vehicles.add(new Car("CHEVROLET", "CAMARO SS", 2023, 2));
//    vehicles.add(new Car("MAZDA", "CX-30", 2026, 4));
//    vehicles.add(new Car("MITSUBISHI", "OUTLANDER", 2006, 4));
//    vehicles.add(new Car("LAMBORGHINI", "V8 SUV", 2026, 2));
//    ElectricCar tesla = new ElectricCar("Tesla", "Model 3", 2023, 4);
//    vehicles.add(tesla);
//    System.out.println("Level battery: " + tesla.getBatteryLevel() + "%");
//    tesla.chargeBattery(30);
//    System.out.println("Final level battery: " + tesla.getBatteryLevel() + "%");
//    System.out.println("Electric maintenance: $" + tesla.calculateCostMaintenance());
//
//    for (Vehicle vehicle : vehicles) {
//        vehicle.showInfoVehicle();
//        System.out.println("Cost maintenance: $" + vehicle.calculateCostMaintenance());
//    }

//    Concessionaire concessionaire = new Concessionaire();
//
//    concessionaire.addVehicle(new Car("TOYOTA", "PRADO", 2025, 4));
//    concessionaire.addVehicle(new Car("TOYOTA", "HILUX", 2024, 4));
//    concessionaire.addVehicle(new Car("FORD", "MUSTANG", 2023, 2));
//    concessionaire.addVehicle(new ElectricCar("TESLA", "MODEL 3", 2026, 4));
//    concessionaire.addVehicle(new ElectricCar("TESLA", "MODEL 6", 2026, 4));
//
//    concessionaire.showInventory();
//
//    System.out.println("Brand with must vehicles: " + concessionaire.getBrandWithMustVehicles());
//    System.out.println("----- ELECTRIC VEHICLES -----");
//    List<Vehicle> electrics = concessionaire.getElectricVehicles();
//    for (Vehicle vehicle : electrics) {
//        vehicle.showInfoVehicle();
//    }
//
//    System.out.println("Total electrics: " + electrics.size());
//
//
//    }

        Catalog catalog = new Catalog();
        catalog.addContent(new Movie("Bee Movie", 2007, "Children", 90));
        catalog.addContent(new Movie("Toy Story 2", 1999, "Children", 94));
        catalog.addContent(new Movie("Inside Out", 2015, "Children", 94));

        catalog.addContent(new Series("Breaking Bad", 2008, "Drama - Humor", 5));
        catalog.addContent(new Series("Attack On Titan", 2013, "Dark Fantasy - Action - Drama", 4));


        catalog.showCatalog();

        System.out.println("Gender with must Must popular: " + catalog.genderMustPopular());
        System.out.println("----- MOVIES -----");
        List<Content> contents = catalog.getOnlyMovies();
        for (Content content : contents) {
            content.showInfo();
        }


        System.out.println("Total hours: " + contents.size());
    }
}
