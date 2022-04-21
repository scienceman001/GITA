package com.clumsy;

public class Student extends User {
    int fucNumber;
    Course[] courses = new Course[10];
    int lastUsedCourseIndex;

    public Student(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    public void addCourse(Course course) {

        if (lastUsedCourseIndex < courses.length) {
            courses[lastUsedCourseIndex] = course;
            lastUsedCourseIndex += lastUsedCourseIndex;
        } else {
            throw new RuntimeException("Courses number exceeded can,t add course");
        }
    }

    public void deleteCourse(int courseId) {

    }

    public int getFucNumber() {
        return fucNumber;
    }

    public Course[] getCourses() {
        return courses;
    }

}
