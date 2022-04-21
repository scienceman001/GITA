package com.clumsy;

import java.util.List;

public class Course {
    String name;
    Student[] students = new Student[30];   //Maximum students per course are 30!
    int lastUsedStudentIndex;
    Lector assistance;
    Lector lector;

    Course(String name) {
        this.name = name;
    }

    public Course(String name, Lector lector, Lector assistance) {
        this(name);
        this.name = name;
        this.lector = lector;
        this.assistance = assistance;
    }

    public void addStudent(Student student) {

        if (lastUsedStudentIndex < students.length) {
            this.students[lastUsedStudentIndex] = student;
            lastUsedStudentIndex += lastUsedStudentIndex;
        } else {
            throw new RuntimeException("students number exceeded on course.Can,t add course");
        }
    }

    public void deleteStudent(int studentId) {

    }

    public void setAssistance(Lector assistance) {

    }

    public void setLector(Lector lector) {

    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public Lector getAssistance() {
        return assistance;
    }

    public Lector getLector() {
        return lector;
    }

}



