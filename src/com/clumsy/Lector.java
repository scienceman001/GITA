package com.clumsy;

public class Lector extends User {
    enum lectorType {
        DOCENT,
        PROFESSOR,
        ASSISTANCE
    }
    Course courses[] = new Course[4];

    public Lector(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }
}
