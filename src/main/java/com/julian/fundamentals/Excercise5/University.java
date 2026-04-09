package com.julian.fundamentals.Excercise5;

import java.util.*;

public class University {

    private String name;
    private List<Student1> students;
    private Map<String, Teacher> teachers;

    public University (String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name of university cannot be null or blank");
        }

        this.name = name;
        students = new ArrayList<>();
        teachers = new HashMap<>();
    }

    public void addTeacher (Teacher teacher) {
        teachers.put(teacher.getSubject(), teacher);
    }

    public void addStudent (Student1 student) {
        students.add(student);
    }

    public void assignStudentToSubject (String subject, Student1 student) {

        Teacher teacher = teachers.get(subject);
        if (teacher == null) {
            throw new IllegalArgumentException("No teacher for subject: " + subject);
        }

        teacher.AssignStudent(student);
    }

    public void getStatistics () {

        Student1 bestStudent = null;
        double bestAverage = 0.0;
        double totalAverage = 0.0;
        int enrolled = students.size();
        int approved = 0;
        int reproved = 0;

        for (Student1 student : students) {
            if (student.approve()) {
                approved ++;
            }
            if (student.getAverage() < 6.0) {
                reproved ++;
                totalAverage += student.getAverage();
            }

        }

        double generalAverage = students.isEmpty() ? 0.0 : totalAverage / students.size();

        for (Student1 student : students) {
            if (student.getAverage() > bestAverage) {
                bestAverage = student.getAverage();
                bestStudent = student;
            }
        }

        System.out.println("Total enrolled: " + enrolled);
        System.out.println("Approved: " + approved);
        System.out.println("Reproved: " + reproved);
        System.out.println("General average: " + generalAverage);
        System.out.println("Best student: " + bestStudent.getName() + " | Average: " + bestStudent.getAverage());

    }

    public List<Student1> getRankingStudents () {
        List<Student1> ranking = new ArrayList<>(students);
        Collections.sort(ranking, (a, b) -> Double.compare(b.getAverage(), a.getAverage()));
        return ranking;
    }
}

