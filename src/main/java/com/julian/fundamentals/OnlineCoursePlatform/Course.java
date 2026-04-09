package com.julian.fundamentals.OnlineCoursePlatform;

import com.julian.fundamentals.Exceptions.CourseFullException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Course {

    private final String title;
    private final Instructor instructor;
    private final Category category;
    private final Level level;
    private final int maximumQuota;
    private final List<Student> students;
    private final Map<Student, Integer> progressByStudent;

    public Course (String title, int maximumQuota, Instructor instructor, Category category, Level level) {

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("The title cannot be null or blank");
        }

        this.title = title;

        if (maximumQuota <= 0) {
            throw new IllegalArgumentException("The maximum quota must be greater than 0");
        }

        this.maximumQuota = maximumQuota;
        this.students = new ArrayList<>();
        this.progressByStudent = new HashMap<>();
        this.instructor = instructor;
        this.category = category;
        this.level = level;

    }

    public void addStudent (Student student) {

        if (students.size() >= maximumQuota) {
            throw new CourseFullException("The course is full");
        }

        students.add(student);
        progressByStudent.put(student, 0);
    }

    public void updateProgress (Student student, int progress) {

        if (progress < 0 || progress > 100) {
            throw new IllegalArgumentException("Progress must be between 0 and 100");
        }

        progressByStudent.put(student, progress);
    }

    public int getProgress (Student student) {
        return progressByStudent.getOrDefault(student, 0);
    }

    public boolean isFull () {
        return students.size() >= maximumQuota;
    }

    @Override
    public String toString() {
        return "Title: " + title + " | Instructor: " + instructor + " | Category: " + category + " | Level: " + level + " | Quota: " + students.size() + "/" + maximumQuota;
    }

    public String getTitle() {
        return title;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public Category getCategory() {
        return category;
    }

    public Level getLevel() {
        return level;
    }

    public int getMaximumQuota() {
        return maximumQuota;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Map<Student, Integer> getProgressByStudent() {
        return progressByStudent;
    }
}
