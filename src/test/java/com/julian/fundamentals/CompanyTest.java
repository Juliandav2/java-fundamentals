package com.julian.fundamentals;

import com.julian.fundamentals.Exceptions.EmployeeNotFoundException;
import com.julian.fundamentals.Exercises9.Company;
import com.julian.fundamentals.Exercises9.Department;
import com.julian.fundamentals.Exercises9.Employee;
import com.julian.fundamentals.Exercises9.PermanentEmployee;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CompanyTest {

    @Test
    void calculateTotalPayroll_shouldReturnCorrectSum () {

        Company company = new Company();
        company.RegisterEmployee(new PermanentEmployee("Juan", 3_000_000, Department.SYSTEMS));
        company.RegisterEmployee(new PermanentEmployee("Andres", 2_000_000, Department.SALES));

        double result = company.calculateTotalPayroll();
        assertEquals(5_000_000, result);
    }

    @Test
    void getBetterPaid_shouldReturnHighestSalaryEmployee () {

        Company company = new Company();
        company.RegisterEmployee(new PermanentEmployee("Camilo", 8_000_000, Department.SYSTEMS));
        company.RegisterEmployee(new PermanentEmployee("Daniela", 4_000_000, Department.SALES));
        company.RegisterEmployee(new PermanentEmployee("Jorge", 7_000_000, Department.HR));

        Employee result = company.getBetterPaid();
        assertEquals("Camilo", result.getName());
    }

    @Test
    void listNames_shouldReturnAllNames () {

        Company company = new Company();
        company.RegisterEmployee(new PermanentEmployee("Camilo", 8_000_000, Department.SYSTEMS));
        company.RegisterEmployee(new PermanentEmployee("Daniela", 4_000_000, Department.SALES));
        company.RegisterEmployee(new PermanentEmployee("Jorge", 7_000_000, Department.HR));

        List<String> expected = List.of("Camilo", "Daniela", "Jorge");
        List<String> result = company.listNames();
        assertEquals( expected ,result);
    }

    @Test
    void findByName_shouldThrowException_whenEmployeeNotFound () {

        Company company = new Company();
        company.RegisterEmployee(new PermanentEmployee("Camilo", 8_000_000, Department.SYSTEMS));

        assertThrows(EmployeeNotFoundException.class, () -> {company.findByName("Julian");});

    }

    @Test
    void getByDepartment_shouldReturnOnlyMatchingEmployees () {

        Company company = new Company();
        company.RegisterEmployee(new PermanentEmployee("Camilo", 8_000_000, Department.SYSTEMS));
        company.RegisterEmployee(new PermanentEmployee("Daniela", 4_000_000, Department.SALES));
        company.RegisterEmployee(new PermanentEmployee("Jorge", 7_000_000, Department.HR));

        List<Employee> result = company.getByDepartment(Department.SYSTEMS);
        assertEquals(1, result.size());
        assertEquals("Camilo", result.getFirst().getName());

    }
}
