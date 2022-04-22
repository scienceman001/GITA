package com.clumsy;

public class Lector extends User {
    enum LectorType {
        DOCENT,
        PROFESSOR,
        ASSISTANCE
    }
    LectorType lectorType;
    Course courses[] = new Course[4];

    public Lector(int id, String firstName, String lastName, String lectorType) {
        super(id, firstName, lastName);
        this.lectorType = LectorType.valueOf(lectorType);
    }

    public Lector(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }
}
