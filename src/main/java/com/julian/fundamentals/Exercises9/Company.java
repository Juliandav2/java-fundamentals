package com.julian.fundamentals.Exercises9;

import com.julian.fundamentals.Exceptions.EmployeeNotFoundException;
import com.julian.fundamentals.Exceptions.EmptyDepartmentException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Company {

    private List<Employee> employees;

    public Company () {

        this.employees = new ArrayList<>();
    }

    public void RegisterEmployee (Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getByDepartment (Department department) {
        return employees.stream().filter(employee -> employee.getDepartment() == department).collect(Collectors.toList());
    }

    public double calculateTotalPayroll () {
        return employees.stream().mapToDouble(Employee::getSalary).sum();
    }

    public Employee getBetterPaid () {
        return employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElseThrow(() -> new RuntimeException("There are no employees"));
    }

    public List<String> listNames () {
        return employees.stream().map(Employee::getName).collect(Collectors.toList());
    }

    public Employee findByName (String name) {
        return employees.stream().filter(employee -> employee.getName().equals(name)).findFirst().orElseThrow(() -> new EmployeeNotFoundException("There is no employee with a name: " + name));
    }

    public List<Employee> getByDepartmentOrThrow (Department department) {
        List<Employee> result = employees.stream().filter(employee -> employee.getDepartment() == department).toList();
        if (result.isEmpty()) {
            throw new EmptyDepartmentException("There are no employees in: " + department);
        }
        return result;
    }
 }
