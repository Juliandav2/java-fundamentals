package com.julian.fundamentals.Exercises9;

public class ContractorEmployee extends Employee {

    private final String company;

    public ContractorEmployee (String name, double salary, Department department, String company) {
        super(name, salary, department);

        if (company == null || company.isBlank()) {
            throw new IllegalArgumentException("The name of company cannot be null or blank");
        }

        this.company = company;
    }

    @Override
    public double calculateBonus() {
        return 500.000;
    }

    public String getCompany() {
        return company;
    }
}
