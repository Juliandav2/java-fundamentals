package com.julian.fundamentals;

import com.julian.fundamentals.Exceptions.AlreadyEnrolledException;
import com.julian.fundamentals.Exceptions.CourseFullException;
import com.julian.fundamentals.OnlineCoursePlatform.*;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {

    @Test
    void enroll_shouldThrowException_whenAlreadyEnrolled () {

        Student student = new Student("Julian", "julian@gmail.com", 1);
        Course course = new Course("Java Basics", 10,
                new Instructor("Carlos", "carlos@gmail.com", 2, "Java"),
                Category.PROGRAMMING, Level.BEGINNER);

        student.enroll(course);
        assertThrows(AlreadyEnrolledException.class, () -> {student.enroll(course);});
    }

    @Test
    void addStudent_shouldThrowException_whenCourseFull () {

        Course course = new Course("Java Basics",
                1, new Instructor("Carlos", "carlos@mail.com", 1, "Java"),
                Category.PROGRAMMING, Level.BEGINNER);

        Student student1 = new Student("Julian", "julian@mail.com", 2);
        Student student2 = new Student("Sofia", "sofia@mail.com", 3);

        student1.enroll(course);
        assertThrows(CourseFullException.class, () -> {student2.enroll(course);});
    }

    @Test
    void updateProgress_shouldThrowException_whenProgressInvalid () {

        Course course = new Course("Java Basics",
                10,
                new Instructor("Carlos", "carlos@mail.com", 1, "Java"),
                Category.PROGRAMMING, Level.BEGINNER);

        Student student = new Student("Julian", "julian@mail.com", 2);

        student.enroll(course);
        assertThrows(IllegalArgumentException.class, () -> {course.updateProgress(student, -1);});
    }

    @Test
    void getAvailableCourses_shouldReturnOnlyAvailableCourses () {

        Platform platform = new Platform("LearnHub");

        Course course1 = new Course("Java Basics",
                1,
                new Instructor("Carlos", "carlos@mail.com", 1, "Java"),
                Category.PROGRAMMING, Level.BEGINNER);

        Course course2 = new Course("UI Design",
                10,
                new Instructor("Maria", "maria@mail.com", 2, "Design"),
                Category.DESIGN, Level.INTERMEDIATE);

        Student student = new Student("Julian", "julian@mail.com", 3);
        student.enroll(course1);

        platform.addCourse(course1);
        platform.addCourse(course2);

        List<Course> result = platform.getAvailableCourses();

        assertEquals(1, result.size());
    }

    @Test
    void getFeaturedStudents_shouldReturnOnlyAbove80 () {

        Platform platform = new Platform("LearnHub");

        Course course = new Course("Java Basics",
                10,
                new Instructor("Carlos", "carlos@mail.com", 1, "Java"), Category.PROGRAMMING, Level.BEGINNER);

        Student student1 = new Student("Julian", "julian@mail.com", 2);
        Student student2 = new Student("Sofia", "sofia@mail.com", 3);

        student1.enroll(course);
        student2.enroll(course);

        course.updateProgress(student1, 90);
        course.updateProgress(student2, 70);

        platform.registerUser(student1);
        platform.registerUser(student2);
        platform.addCourse(course);

        List<Student> result = platform.getFeaturedStudents();

        assertEquals(1, result.size());
    }
}
