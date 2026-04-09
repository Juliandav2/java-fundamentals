package com.julian.fundamentals.OnlineCoursePlatform;

import com.julian.fundamentals.Exceptions.AlreadyEnrolledException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student extends User {

    private final List<Course> coursesEnrolled;

    public Student (String name, String email, int id) {
        super(name, email, id);

        this.coursesEnrolled = new ArrayList<>();
    }

    @Override
    public String getRol() {
        return "Student";
    }

    public void enroll (Course course) {

        if (coursesEnrolled.contains(course)) {
            throw new AlreadyEnrolledException("You are already enrolled in this course");
        }

        coursesEnrolled.add(course);
        course.addStudent(this);
    }

    public List<Course> getCompletedCourses () {
        return coursesEnrolled.stream().filter(course -> course.getProgress(this) == 100).collect(Collectors.toList());
    }

    public double getAverageProgress () {
        return coursesEnrolled.stream().mapToInt(course -> course.getProgress(this)).average().orElse(0.0);
    }

    public List<Course> getCoursesEnrolled() {
        return coursesEnrolled;
    }

}
