package com.julian.fundamentals.Excercises4;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hospital {

    private String name;
    private List<Patient> waitingRoom;
    private Map<String, Doctor> doctors;


    public Hospital (String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The hospital name cannot be null or blank");
        }

        this.name = name;
        waitingRoom = new ArrayList<>();
        doctors = new HashMap<>();

    }

    public void registerDoctor (Doctor doctor) {
        doctors.put(doctor.getSpeciality(), doctor);
    }

    public void admitPatient (Patient patient) {
        waitingRoom.add(patient);
    }

    public Patient careForPatient () {

        Patient nextPatient = null;
        int mustPriority = 0;
        for (Patient patient : waitingRoom) {
            if (patient.getPriority() > mustPriority) {
                mustPriority = patient.getPriority();
                nextPatient = patient;
            }


        }

        waitingRoom.remove(nextPatient);
        System.out.println("Served to: " + nextPatient.getName() + " | State: " + nextPatient.getState());
        return nextPatient;

    }

    public Doctor getDoctorForSpeciality (String speciality) {

        Doctor doctor = doctors.get(speciality);
        if (doctor == null) {
            throw new IllegalArgumentException("There is no specialty doctor: " + speciality);
        }

        return doctor;

    }

    public void getStatistics() {
        int urgent = 0;
        int moderate = 0;
        int mild = 0;

        for (Patient patient : waitingRoom) {
            if (patient.getState().equals("URGENT"))   urgent++;
            if (patient.getState().equals("MODERATE")) moderate++;
            if (patient.getState().equals("MILD"))     mild++;
        }

        String doctorWinner = null;
        int servedPatient = 0;
        for (Map.Entry<String, Doctor> entry : doctors.entrySet()) {
            if (entry.getValue().getPatientsServed() >= servedPatient) {
                servedPatient = entry.getValue().getPatientsServed();
                doctorWinner = entry.getKey();
            }
        }

        System.out.println("Total patients in waiting room: " + waitingRoom.size());
        System.out.println("Urgent: " + urgent);
        System.out.println("Moderate: " + moderate);
        System.out.println("Mild: " + mild);
        System.out.println("Doctor with most patients: " + doctors.get(doctorWinner).getName());
    }

}
