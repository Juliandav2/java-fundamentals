package com.julian.fundamentals.Excercise5;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

    private String subject;
    private List<Student1> students;

    public Teacher (String name, String id, String subject) {
        super(name, id);

        if (subject == null || subject.isBlank()) {
            throw new IllegalArgumentException("The subject cannot be null or blank");
        }

        this.subject = subject;
        students = new ArrayList<>();
    }

    public void AssignStudent (Student1 student) {
        students.add(student);
    }

    @Override
    public String getRol() {
        return "Teacher";
    }

    public List<Student1> getApproveStudents () {
        List<Student1> approved = new ArrayList<>();
        for (Student1 student : students) {
              if (student.approve()) {
                  approved.add(student);
              }
        }

        return approved;
    }

    public Student1 getBestStudent () {
        Student1 studentWinner = null;
        double bestAverage = 0.0;

        for (Student1 student : students) {
            if (student.getAverage() > bestAverage) {
                bestAverage = student.getAverage();
                studentWinner = student;
            }
        }

        return studentWinner;
    }

    public String getSubject() {
        return subject;
    }
}
