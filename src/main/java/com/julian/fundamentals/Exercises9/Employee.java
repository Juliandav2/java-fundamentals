package com.julian.fundamentals.Exercises9;

public abstract class Employee {

    private final String name;
    private final double salary;
    private final Department department;

    public Employee (String name, double salary, Department department) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name cannot be null or blank");
        }

        this.name = name;

        if (salary <= 0) {
            throw new IllegalArgumentException("The salary must be greater than 0");
        }

        this.salary = salary;
        this.department = department;
    }

    public abstract double calculateBonus ();

    @Override
    public String toString () {
        return String.format("Name: %s | Salary: $%,.0f | Department: %s | Bonus: $%,.0f", name, salary, department, calculateBonus());
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }
}
