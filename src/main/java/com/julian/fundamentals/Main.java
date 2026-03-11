package com.julian.fundamentals;

import com.julian.fundamentals.Collections.Concessionaire;
import com.julian.fundamentals.Excercises2.Catalog;
import com.julian.fundamentals.Excercises2.Content;
import com.julian.fundamentals.Excercises2.Movie;
import com.julian.fundamentals.Excercises2.Series;
import com.julian.fundamentals.Excercises3.*;
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

//        Catalog catalog = new Catalog();
//        catalog.addContent(new Movie("Bee Movie", 2007, "Children", 90));
//        catalog.addContent(new Movie("Toy Story 2", 1999, "Children", 94));
//        catalog.addContent(new Movie("Inside Out", 2015, "Children", 94));
//
//        catalog.addContent(new Series("Breaking Bad", 2008, "Drama - Humor", 5));
//        catalog.addContent(new Series("Attack On Titan", 2013, "Dark Fantasy - Action - Drama", 4));
//
//
//        catalog.showCatalog();
//
//        System.out.println("Gender with must Must popular: " + catalog.genderMustPopular());
//        System.out.println("----- MOVIES -----");
//        List<Content> contents = catalog.getOnlyMovies();
//        for (Content content : contents) {
//            content.showInfo();
//        }
//
//
//        System.out.println("Total hours: " + contents.size());

        Player player1 = new Player("Julian", 21, 500);
        Player player2 = new Player("Andres", 23, 534);
        Player player3 = new Player("Camilo", 25, 555);

        Player player4 = new Player("Andrea", 23, 400);
        Player player5 = new Player("Maria Jose", 34, 500);
        Player player6 = new Player("Josefina", 35, 600);

        Team team1 = new Team("Gamers");
        Team team2 = new Team("Lolis");

        team1.addPlayer(player1);
        team1.addPlayer(player2);
        team1.addPlayer(player3);

        team2.addPlayer(player4);
        team2.addPlayer(player5);
        team2.addPlayer(player6);

        Tournament tournament = new Tournament("Olympics");
        tournament.enroll(player1);
        tournament.enroll(player2);
        tournament.enroll(player3);
        tournament.enroll(player4);
        tournament.enroll(player5);
        tournament.enroll(player6);
        tournament.enroll(team1);
        tournament.enroll(team2);

        player1.sumPoints(500);
        player3.sumPoints(534);
        player4.sumPoints(555);

        tournament.updateScoreboard(player1);
        tournament.updateScoreboard(player2);
        tournament.updateScoreboard(player3);
        tournament.updateScoreboard(player4);
        tournament.updateScoreboard(player5);
        tournament.updateScoreboard(player6);
        tournament.updateScoreboard(team1);
        tournament.updateScoreboard(team2);

        System.out.println("=== SCOREBOARD ===");
        tournament.showScoreboard();

        System.out.println("\nLeader: " + tournament.getLeader());

        System.out.println("\n=== ONLY TEAMS ===");
        for (Competitor competitor : tournament.onlyTeams()) {
            System.out.println(competitor.getName() + " | Score: " + competitor.getScore());
        }





    }
}