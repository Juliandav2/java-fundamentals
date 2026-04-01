package com.julian.fundamentals.Exercises9;

public class PermanentEmployee extends Employee {

    public PermanentEmployee (String name, double salary, Department department) {
        super(name, salary, department);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.10;
    }
}
