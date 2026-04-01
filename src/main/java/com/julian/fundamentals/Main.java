package com.julian.fundamentals;

import com.julian.fundamentals.Exceptions.EmployeeNotFoundException;
import com.julian.fundamentals.Exceptions.EmptyCartException;
import com.julian.fundamentals.Exceptions.EmptyDepartmentException;
import com.julian.fundamentals.Exceptions.InsufficientStockException;
import com.julian.fundamentals.Excercise5.Student;
import com.julian.fundamentals.Excercise5.Teacher;
import com.julian.fundamentals.Excercise5.University;
import com.julian.fundamentals.Excercise6.*;
import com.julian.fundamentals.Excercises3.*;
import com.julian.fundamentals.Excercises4.Doctor;
import com.julian.fundamentals.Excercises4.Hospital;
import com.julian.fundamentals.Excercises4.Patient;
import com.julian.fundamentals.Excercises7.*;
import com.julian.fundamentals.Excercises8.Bus;
import com.julian.fundamentals.Excercises8.Taxi;
import com.julian.fundamentals.Excercises8.TransportTerminal;
import com.julian.fundamentals.Excercises8.Vehicle;
import com.julian.fundamentals.Exercises9.*;
import com.julian.fundamentals.Logic.Exercise1;
import com.julian.fundamentals.RestaurantSystem.*;

import java.util.List;

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

//        Doctor doctor1 = new Doctor("Jaime", "12345", "Pediatrician", 4);
//        Doctor doctor2 = new Doctor("Camilo", "54321", "Geriatrician", 6);
//        Doctor doctor3 = new Doctor("Jaime", "15432", "Cardiologist", 7);
//
//        Patient patient1 = new Patient("Natalia", "3333", 19, "Chronic", 10);
//        Patient patient2 = new Patient("Andrea", "7564", 22, "Acute", 4);
//        Patient patient3 = new Patient("Nicole", "8556", 22, "Stable", 1);
//        Patient patient4 = new Patient("Carolina", "2423", 21, "In remission", 6);
//        Patient patient5 = new Patient("Kelly", "85432", 23, "Chronic", 3);
//        Patient patient6 = new Patient("Sandra", "66422", 23, "Malignant", 8);
//
//        Hospital hospital = new Hospital("San Jose");
//
//        hospital.registerDoctor(doctor1);
//        hospital.registerDoctor(doctor2);
//        hospital.registerDoctor(doctor3);
//
//        hospital.admitPatient(patient1);
//        hospital.admitPatient(patient2);
//        hospital.admitPatient(patient3);
//        hospital.admitPatient(patient4);
//        hospital.admitPatient(patient5);
//        hospital.admitPatient(patient6);
//
//        System.out.println("----- SERVING -----");
//        hospital.getStatistics();
//
//        System.out.println("----- SERVING -----");
//        Patient served1 = hospital.careForPatient();
//        hospital.getDoctorForSpeciality("Pediatrician").attendPatient();
//
//        Patient served2 = hospital.careForPatient();
//        hospital.getDoctorForSpeciality("Geriatrician").attendPatient();
//
//        Patient served3 = hospital.careForPatient();
//        hospital.getDoctorForSpeciality("Cardiologist").attendPatient();
//
//        System.out.println("=== DOCTORS ===");
//        System.out.println(doctor1.getName() + " | Served: " + doctor1.getPatientsServed());
//        System.out.println(doctor2.getName() + " | Served: " + doctor2.getPatientsServed());
//        System.out.println(doctor3.getName() + " | Served: " + doctor3.getPatientsServed());
//
//
//        System.out.println("\n=== STATISTICS AFTER ===");
//        hospital.getStatistics();
//    }

//        Teacher teacher1 = new Teacher("German Andres", "4343", "Programming I");
//        Teacher teacher2 = new Teacher("Gustavo Adolfo", "6565", "Data Bases II");
//
//        Student student1 = new Student("Julian David", "3232", "Systems Engineering");
//        Student student2 = new Student("Juan Esteban", "5454", "Systems Engineering");
//        Student student3 = new Student("Edward Jonny","9090", "Systems Engineering" );
//        Student student4 = new Student("Diego Andres", "5757", "Systems Engineering");
//        Student student5 = new Student("Jonn Viera", "4242", "Systems Engineering");
//
//        student1.addNote(9.0);
//        student1.addNote(9.0);
//        student1.addNote(8.8);
//        student1.addNote(9.7);
//        student2.addNote(2.8);
//        student2.addNote(2.7);
//        student2.addNote(7.8);
//        student2.addNote(3.2);
//        student3.addNote(2.2);
//        student3.addNote(2.9);
//        student3.addNote(2.1);
//        student3.addNote(5.6);
//        student4.addNote(7.7);
//        student4.addNote(4.4);
//        student4.addNote(3.4);
//        student4.addNote(9.6);
//        student5.addNote(3.3);
//        student5.addNote(2.1);
//        student5.addNote(7.6);
//        student5.addNote(10.0);
//
//        University university = new University("Unremitting");
//
//        university.addStudent(student1);
//        university.addStudent(student2);
//        university.addStudent(student3);
//        university.addStudent(student4);
//        university.addStudent(student5);
//
//        university.addTeacher(teacher1);
//        university.addTeacher(teacher2);
//
//        university.assignStudentToSubject("Programming I", student1);
//        university.assignStudentToSubject("Programming I", student2);
//        university.assignStudentToSubject("Programming I", student3);
//        university.assignStudentToSubject("Data Bases II", student3);
//        university.assignStudentToSubject("Data Bases II", student3);
//
//        System.out.println("=== STATISTICS ===");
//        university.getStatistics();
//
//
//        System.out.println("\n=== RANKING ===");
//        List<Student> ranking = university.getRankingStudents();
//        for (Student student : ranking) {
//            System.out.println(student.getName() + " | Average: " + student.getAverage());
//        }
//
//
//        System.out.println("\n=== BEST STUDENT PER TEACHER ===");
//        Student best1 = teacher1.getBestStudent();
//        Student best2 = teacher2.getBestStudent();
//        System.out.println(teacher1.getName() + " → " + best1.getName() + " | Average: " + best1.getAverage());
//        System.out.println(teacher2.getName() + " → " + best2.getName() + " | Average: " + best2.getAverage());
//
//        User user1 = new User("Julian", "mezka28@gmail.com");
//        User user2 = new User("Juan", "pancoco@gmail.com");
//        User user3 = new User("Luis", "pretty@gmail.com");
//
//        Book book1 = new Book("Clean Code", "B001", 2008, "Robert C. Martin", 431);
//        Book book2 = new Book("Effective Java", "B002", 2018, "Joshua Bloch", 412);
//        Book book3 = new Book("The Pragmatic Programmer", "B003", 1999, "Andrew Hunt", 352);
//        Book book4 = new Book("Spring in Action", "B004", 2022, "Craig Walls", 520);
//
//        Magazine mag1 = new Magazine("National Geographic", "M001", 2023, 1);
//        Magazine mag2 = new Magazine("Forbes", "M002", 2024, 2);
//        Magazine mag3 = new Magazine("Time", "M003", 2022, 3);
//
//        Library library = new Library("Library of Congress");
//
//        library.userRegister(user1);
//        library.userRegister(user2);
//        library.userRegister(user3);
//
//        library.addMaterial(book1);
//        library.addMaterial(book2);
//        library.addMaterial(book3);
//        library.addMaterial(book4);
//        library.addMaterial(mag1);
//        library.addMaterial(mag2);
//        library.addMaterial(mag3);
//
//        System.out.println("=== BEFORE ===");
//        library.getStatistics();
//
//        user1.borrow(book1);
//        user1.borrow(book2);
//        user2.borrow(book3);
//        user3.borrow(mag1);
//
//        System.out.println("\n=== AFTER BORROWING ===");
//        library.getStatistics();
//
//        user1.returnMaterial(book1);
//
//        System.out.println("\n=== AFTER RETURNING ===");
//        library.getStatistics();
//
//        System.out.println("\n=== AVAILABLE ===");
//        for (Material m : library.getMaterialsAvailable()) {
//            m.showInfo();
//        }
//
//        Product product1 = new PhysicalProduct("T-Shirt", "TSH-001", "Clothing", 29.99, 50, 0.3);
//        Product product2 = new PhysicalProduct("Laptop", "LAP-001", "Electronics", 999.99, 10, 2.5);
//        Product product3 = new PhysicalProduct("Headphones", "HEAD-001", "Electronics", 79.99, 30, 0.5);
//
//        Product product4 = new DigitalProduct("Microsoft Office", "MS-OFF-001", "Software", 149.99, 100);
//        Product product5 = new DigitalProduct("Photoshop", "PS-001", "Software", 54.99, 50);
//
//        Store store = new Store("Amazon");
//        store.addProduct(product1);
//        store.addProduct(product2);
//        store.addProduct(product3);
//        store.addProduct(product4);
//        store.addProduct(product5);
//
//        store.createCart("Julian");
//        store.createCart("Juan");
//
//        ShoppingCart shoppingCart1 = store.getShoppingCart("Julian");
//        ShoppingCart shoppingCart2 = store.getShoppingCart("Juan");
//
//        shoppingCart1.addItem((Salable) product1, 4);
//        shoppingCart1.addItem((Salable) product5, 2);
//        shoppingCart2.addItem((Salable) product4, 7);
//        shoppingCart2.addItem((Salable) product2, 6);
//
//        System.out.println("=== CART JULIAN ===");
//        shoppingCart1.showShoppingCart();
//
//        System.out.println("\n=== CART JUAN ===");
//        shoppingCart2.showShoppingCart();
//
//        System.out.println("\n=== BEFORE PURCHASE ===");
//        store.getStatistics();
//
//        System.out.println("\n=== PURCHASING ===");
//        shoppingCart1.makePurchase();
//        shoppingCart2.makePurchase();
//
//        System.out.println("\n=== AFTER PURCHASE ===");
//        store.getStatistics();
//        Bus bus1 = new Bus("ABC123", "Mercedes", 2020, 40);
//        Bus bus2 = new Bus("XYZ789", "Volvo", 2018, 30);
//        Taxi taxi1 = new Taxi("TAX001", "Toyota", 2022, 4);
//        Taxi taxi2 = new Taxi("TAX002", "Kia", 2021, 4);
//
//        TransportTerminal terminal = new TransportTerminal();
//        terminal.registerVehicle(bus1);
//        terminal.registerVehicle(bus2);
//        terminal.registerVehicle(taxi1);
//        terminal.registerVehicle(taxi2);
//
//        bus1.board(25);
//        bus2.board(30);
//        taxi1.board(3);
//        taxi2.board(2);
//
//        System.out.println("=== STATISTICS ===");
//        terminal.getStatics();
//
//        System.out.println("\n=== SEARCH ===");
//        Vehicle v = terminal.searchForPlate("ABC123");
//        v.showInfo();
//
//        System.out.println("\n=== AVAILABLE ===");
//        for (Vehicle vehicle : terminal.getVehiclesAvailable()) {
//            vehicle.showInfo();
//        }
//        System.out.println("\n=== TEST INSUFFICIENT STOCK ===");
//        try {
//            PhysicalProduct test = new PhysicalProduct("Test", "T001", "Test", 10.0, 3, 0.5);
//            test.sell(10);
//        } catch (InsufficientStockException e) {
//            System.out.println("Available: " + e.getAvailableStock());
//            System.out.println("Requested: " + e.getSolicitedStock());
//        }
//
//
//        System.out.println("\n=== TEST EMPTY CART ===");
//        try {
//            ShoppingCart emptyCart = new ShoppingCart("Test");
//            emptyCart.makePurchase();
//        } catch (EmptyCartException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//
//        Company company = new Company();
//
//        ContractorEmployee contractorEmployee1 = new ContractorEmployee("Julian", 3_000_000, Department.SYSTEMS, "Hasbro");
//        ContractorEmployee contractorEmployee2 = new ContractorEmployee("Camila", 2_000_000, Department.SALES, "Mazda");
//        ContractorEmployee contractorEmployee3 = new ContractorEmployee("Juan", 7_000_000, Department.ACCOUNTING, "Mazda");
//
//        PermanentEmployee permanentEmployee4 = new PermanentEmployee("Andres", 9_000_000, Department.ACCOUNTING);
//        PermanentEmployee permanentEmployee5 = new PermanentEmployee("kevin", 10_000_000, Department.SALES);
//        PermanentEmployee permanentEmployee6 = new PermanentEmployee("Sol", 23_000_000, Department.SYSTEMS);
//
//        company.RegisterEmployee(contractorEmployee1);
//        company.RegisterEmployee(contractorEmployee2);
//        company.RegisterEmployee(contractorEmployee3);
//        company.RegisterEmployee(permanentEmployee4);
//        company.RegisterEmployee(permanentEmployee5);
//        company.RegisterEmployee(permanentEmployee6);
//
//        System.out.printf("Nómina total: $%,.0f%n", company.calculateTotalPayroll());
//        System.out.println("Best paid: " + company.getBetterPaid());
//        System.out.println("Names: " + company.listNames());
//
//        System.out.println("Dept SYSTEMS: " + company.getByDepartment(Department.SYSTEMS));
//
//        try {
//            company.findByName("Chanty");
//        } catch (EmployeeNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            company.getByDepartmentOrThrow(Department.HR);
//        } catch (EmptyDepartmentException e) {
//            System.out.println(e.getMessage());
//        }

        Restaurant restaurant = new Restaurant("Holy Bar");

        Plate p1 = new Plate("Pizza", 25_000, DishCategory.STRONG_PLATE);
        Plate p2 = new Plate("Ensalada César", 15_000, DishCategory.ENTRANCE);
        Plate p3 = new Plate("Tiramisú", 12_000, DishCategory.DESSERT);
        Plate p4 = new Plate("Limonade", 8_000, DishCategory.DRINK);
        Plate p5 = new Plate("Pasta Alfredo", 22_000, DishCategory.STRONG_PLATE);
        Plate p6 = new Plate("Soup del día", 10_000, DishCategory.ENTRANCE);
        Plate p7 = new Plate("Brownie", 9_000, DishCategory.DESSERT);
        Plate p8 = new Plate("Juice Natural", 7_000, DishCategory.DRINK);

        restaurant.addToMenu(p1);
        restaurant.addToMenu(p2);
        restaurant.addToMenu(p3);
        restaurant.addToMenu(p4);
        restaurant.addToMenu(p5);
        restaurant.addToMenu(p6);
        restaurant.addToMenu(p7);
        restaurant.addToMenu(p8);

        Table table1 = new Table(1, 5, TableState.AVAILABLE);
        Table table2 = new Table(2, 6, TableState.AVAILABLE);
        Table table3 = new Table(3, 8, TableState.AVAILABLE);
        Table table4 = new Table(4, 3, TableState.AVAILABLE);
        Table table5 = new Table(5, 2, TableState.AVAILABLE);

        Waiter waiter1 = new Waiter("Jaime", 1);
        Waiter waiter2 = new Waiter("Andres", 2);
        Waiter waiter3 = new Waiter("Jorge", 3);

        restaurant.addTable(table1);
        restaurant.addTable(table2);
        restaurant.addTable(table3);
        restaurant.addTable(table4);
        restaurant.addTable(table5);

        restaurant.addWaiter(waiter1);
        restaurant.addWaiter(waiter2);
        restaurant.addWaiter(waiter3);

        Order order1 = restaurant.createOrder(1, waiter1);
        order1.addPlate(p1);
        order1.addPlate(p2);
        order1.addPlate(p5);
        restaurant.closeOrder(order1);

        Order order2 = restaurant.createOrder(2, waiter2);
        order2.addPlate(p3);
        order2.addPlate(p4);
        order2.addPlate(p7);
        restaurant.closeOrder(order2);

        Order order3 = restaurant.createOrder(3, waiter1);
        order3.addPlate(p1);
        order3.addPlate(p6);
        order3.addPlate(p8);
        restaurant.closeOrder(order3);

        System.out.println("=== Mesas disponibles ===");
        restaurant.getTablesAvailable().forEach(System.out::println);

        System.out.println("\n=== Total con propina 15% ===");
        System.out.printf("Order 1: $%,.0f%n", order1.calculateTotalWithTip(15));
        System.out.printf("Order 2: $%,.0f%n", order2.calculateTotalWithTip(15));
        System.out.printf("Order 3: $%,.0f%n", order3.calculateTotalWithTip(15));

        System.out.println("\n=== Platos más vendidos ===");
        restaurant.getMostSoldDishes().forEach(System.out::println);

        System.out.println("\n=== Mesero del día ===");
        System.out.println(restaurant.getWaiterOfTheDay());

        System.out.println("\n=== Reporte por categoría ===");
        restaurant.getReportByCategory().forEach((category, count) ->
                System.out.println(category + ": " + count));

    }



}