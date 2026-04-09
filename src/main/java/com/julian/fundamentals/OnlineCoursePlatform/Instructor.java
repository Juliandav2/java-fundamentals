package com.julian.fundamentals.OnlineCoursePlatform;

public class Instructor extends User {

    private final String speciality;

    public Instructor (String name, String email, int id, String speciality) {
        super(name, email, id);

        if (speciality == null || speciality.isBlank()) {
            throw new IllegalArgumentException("The speciality cannot be null or blank");
        }

        this.speciality = speciality;
    }

    @Override
    public String getRol() {
        return "Instructor";
    }

    public String getSpeciality() {
        return speciality;
    }
}
