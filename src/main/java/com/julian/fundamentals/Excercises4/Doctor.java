package com.julian.fundamentals.Excercises4;

public class Doctor extends Person {

    private String speciality;
    private int patientsServed;

    public Doctor (String name, String id, String speciality, int patientsServed) {
        super(name, id);

        if (speciality == null || speciality.isBlank()) {
            throw new IllegalArgumentException("The speciality cannot be null or blank");
        }

        this.speciality = speciality;
        this.patientsServed = 0;
    }

    @Override
    String getRol() {
        return "Doctor";
    }

    public void attendPatient () {
        this.patientsServed += 1;
    }

    public int getPatientsServed() {
        return patientsServed;
    }

    public String getSpeciality () {
        return speciality;
    }
}
