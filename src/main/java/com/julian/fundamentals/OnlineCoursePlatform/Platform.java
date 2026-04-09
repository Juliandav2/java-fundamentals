package com.julian.fundamentals.OnlineCoursePlatform;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Platform {

    private final String name;
    private final List<Course> courses;
    private final List<User> users;

    public Platform (String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name cannot be null or blank");
        }

        this.name = name;
        this.courses = new ArrayList<>();
        this.users = new ArrayList<>();

    }

    public void registerUser (User user) {
        users.add(user);
    }

    public void addCourse (Course course) {
        courses.add(course);
    }

    public List<Course> getCoursesByCategory (Category category) {
        return courses.stream().filter(course -> course.getCategory().equals(category)).toList();
    }

    public List<Course> getAvailableCourses () {
        return courses.stream().filter(course -> !course.isFull()).toList();
    }

    public List<Student> getFeaturedStudents () {
        return courses.stream().flatMap(course -> course.getStudents().stream()).distinct()
                .filter(student -> student.getAverageProgress() > 80).collect(Collectors.toList());
    }

    public List<Course> getMostPopularCourses () {
        return courses.stream().sorted(Comparator.comparingInt((Course c) -> c.getStudents().size()).reversed()).toList();
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<User> getUsers() {
        return users;
    }

    public String getStatistics () {

        long available = courses.stream().filter(course -> !course.isFull()).count();

        Student topStudent = users.stream().filter(user -> user instanceof Student).map(user -> (Student) user)
                .max(Comparator.comparingDouble(Student::getAverageProgress)).orElseThrow(() -> new RuntimeException("No students"));

        return String.format("Total courses: %d | Total users: %d | Available courses: %d | Top student: %s", courses.size(), users.size(), available, topStudent.getName());

    }
}
