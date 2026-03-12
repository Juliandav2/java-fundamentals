package com.julian.fundamentals;

import com.julian.fundamentals.Excercises3.*;
import com.julian.fundamentals.Excercises4.Doctor;
import com.julian.fundamentals.Excercises4.Hospital;
import com.julian.fundamentals.Excercises4.Patient;

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

//        Player player1 = new Player("Julian", 21, 500);
//        Player player2 = new Player("Andres", 23, 534);
//        Player player3 = new Player("Camilo", 25, 555);
//
//        Player player4 = new Player("Andrea", 23, 400);
//        Player player5 = new Player("Maria Jose", 34, 500);
//        Player player6 = new Player("Josefina", 35, 600);
//
//        Team team1 = new Team("Gamers");
//        Team team2 = new Team("Lolis");
//
//        team1.addPlayer(player1);
//        team1.addPlayer(player2);
//        team1.addPlayer(player3);
//
//        team2.addPlayer(player4);
//        team2.addPlayer(player5);
//        team2.addPlayer(player6);
//
//        Tournament tournament = new Tournament("Olympics");
//        tournament.enroll(player1);
//        tournament.enroll(player2);
//        tournament.enroll(player3);
//        tournament.enroll(player4);
//        tournament.enroll(player5);
//        tournament.enroll(player6);
//        tournament.enroll(team1);
//        tournament.enroll(team2);
//
//        player1.sumPoints(500);
//        player3.sumPoints(534);
//        player4.sumPoints(555);
//
//        tournament.updateScoreboard(player1);
//        tournament.updateScoreboard(player2);
//        tournament.updateScoreboard(player3);
//        tournament.updateScoreboard(player4);
//        tournament.updateScoreboard(player5);
//        tournament.updateScoreboard(player6);
//        tournament.updateScoreboard(team1);
//        tournament.updateScoreboard(team2);
//
//        System.out.println("=== SCOREBOARD ===");
//        tournament.showScoreboard();
//
//        System.out.println("\nLeader: " + tournament.getLeader());
//
//        System.out.println("\n=== ONLY TEAMS ===");
//        for (Competitor competitor : tournament.onlyTeams()) {
//            System.out.println(competitor.getName() + " | Score: " + competitor.getScore());
//        }

        Doctor doctor1 = new Doctor("Jaime", "12345", "Pediatrician", 4);
        Doctor doctor2 = new Doctor("Camilo", "54321", "Geriatrician", 6);
        Doctor doctor3 = new Doctor("Jaime", "15432", "Cardiologist", 7);

        Patient patient1 = new Patient("Natalia", "3333", 19, "Chronic", 10);
        Patient patient2 = new Patient("Andrea", "7564", 22, "Acute", 4);
        Patient patient3 = new Patient("Nicole", "8556", 22, "Stable", 1);
        Patient patient4 = new Patient("Carolina", "2423", 21, "In remission", 6);
        Patient patient5 = new Patient("Kelly", "85432", 23, "Chronic", 3);
        Patient patient6 = new Patient("Sandra", "66422", 23, "Malignant", 8);

        Hospital hospital = new Hospital("San Jose");

        hospital.registerDoctor(doctor1);
        hospital.registerDoctor(doctor2);
        hospital.registerDoctor(doctor3);

        hospital.admitPatient(patient1);
        hospital.admitPatient(patient2);
        hospital.admitPatient(patient3);
        hospital.admitPatient(patient4);
        hospital.admitPatient(patient5);
        hospital.admitPatient(patient6);

        System.out.println("----- SERVING -----");
        hospital.getStatistics();

        System.out.println("----- SERVING -----");
        Patient served1 = hospital.careForPatient();
        hospital.getDoctorForSpeciality("Pediatrician").attendPatient();

        Patient served2 = hospital.careForPatient();
        hospital.getDoctorForSpeciality("Geriatrician").attendPatient();

        Patient served3 = hospital.careForPatient();
        hospital.getDoctorForSpeciality("Cardiologist").attendPatient();

        System.out.println("=== DOCTORS ===");
        System.out.println(doctor1.getName() + " | Served: " + doctor1.getPatientsServed());
        System.out.println(doctor2.getName() + " | Served: " + doctor2.getPatientsServed());
        System.out.println(doctor3.getName() + " | Served: " + doctor3.getPatientsServed());


        System.out.println("\n=== STATISTICS AFTER ===");
        hospital.getStatistics();
    }

}