package com.julian.fundamentals.Excercises8;

import java.util.*;

public class TransportTerminal {

    private List<Vehicle> flota;
    private Map<String, Vehicle> vehicleForPlate;

    public TransportTerminal () {

        this.flota = new ArrayList<>();
        this.vehicleForPlate = new HashMap<>();

    }

    public void registerVehicle (Vehicle vehicle) {

        flota.add(vehicle);
        vehicleForPlate.put(vehicle.getPlate(), vehicle);
    }

    public Vehicle searchForPlate (String plate) {

        Vehicle vehicle =  vehicleForPlate.get(plate);

        if (vehicle == null) {
            throw new IllegalArgumentException("Plate not found: " + plate);
        }

        return vehicle;
    }

    public List<Vehicle> getVehiclesAvailable () {

        List<Vehicle> available = new ArrayList<>();

        for (Vehicle vehicle : flota) {

            if (vehicle instanceof Transportable) {
                Transportable transportable = (Transportable) vehicle;

                if (transportable.getOccupation() < transportable.getCapacity()) {
                    available.add(vehicle);
                }
             }
        }

        return available;
    }

    public void getStatics () {

        int vehicles = flota.size();
        System.out.println("Total vehicles available: " + vehicles);

        int available = 0;
        int full = 0;

        for (Vehicle vehicle : flota) {
            if (vehicle instanceof Transportable) {
                Transportable transportable = (Transportable) vehicle;
                if (transportable.getOccupation() < transportable.getCapacity()) {
                    available++;
                } else {
                    full++;
                }
            }
        }

        System.out.println("How many available: " + available);
        System.out.println("How many full: " + full);

        int totalPassengers = 0;

        for (Vehicle vehicle : flota) {

            if (vehicle instanceof Transportable) {
                Transportable transportable = (Transportable) vehicle;
                totalPassengers += transportable.getOccupation();
            }
        }

        System.out.println("Total passengers: " + totalPassengers);

        Vehicle busier = null;
        int maxOccupation = 0;

        for (Vehicle vehicle : flota) {
            if (vehicle instanceof Transportable) {
                Transportable transportable = (Transportable) vehicle;
                if (transportable.getOccupation() > maxOccupation) {
                    maxOccupation = transportable.getOccupation();
                    busier =  vehicle;
                }
            }
        }

        System.out.println("The busiest vehicle: " + (busier != null ? busier.getPlate() : "None"));

    }
}
