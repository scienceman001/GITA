package com.clumsy;

import java.util.List;

public class Course {
    String name;
    List students;
    Lector assistance;

    Course(String name) {
        this.name = name;
    }

    public Course(String name, List students, Lector assistance) {
        this(name);
        this.name = name;
        this.students = students;
        this.assistance = assistance;
    }
}


//- one method for adding of a Student
//        - one method for delete of a student
//        - one method for setting the assistance
//        - one method for setting the lector
