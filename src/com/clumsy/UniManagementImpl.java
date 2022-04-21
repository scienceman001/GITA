package com.clumsy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniManagementImpl implements UniManagement {
    Student[] students = new Student[1000];
    Course[] courses = new Course[10];
    Lector[] assistants = new Lector[20];
    Lector[] docentsAndProfessors = new Lector[20];
    private int lastUsedStudentIndex;
    private int lastUsedCourseIndex;
    private int lastUsedAssistanceIndex;
    private int lastUsedDocentsAndProfessorsIndex;


//    <T> boolean checkIfExists(T[] targetArray, String name) {
//        if (targetArray.length > 0) {
//            for (T target : targetArray) {
//                if (target.getName())
//            }
//            return true;
//        } else {
//            return false;
//        }
//    }

//    /**
//     * convert Array to list remove alement and than convert to array again.
//     * @param arr
//     * @param index
//     * @return
//     */
//     <T>[] removeElementUsingCollection( T[] arr, int index ){
//        List<Integer> tempList = new ArrayList<Integer>(Arrays.asList(arr));
//        tempList.remove(index);
//        return tempList.toArray(new Integer[0]);
//    }

    @Override
    public Course createCourse(String courseName) throws RuntimeException {

        for (Course course : this.courses) {
            if (course != null && course.getName().equals(courseName)) {
                throw new RuntimeException("course with this name already exists");
            }
        }


        Course course = new Course(courseName);
        lastUsedCourseIndex += lastUsedCourseIndex;
        this.courses[lastUsedCourseIndex] = course;
        return course;
    }

    @Override
    public boolean deleteCourse(String courseName) {


        for (int i = 0; i < this.courses.length; i++) {
            Course course = this.courses[i];
            if (course != null && course.getName().equals(courseName)) {
                //found course and its ready to delete
                List<Course> tempList = new ArrayList<>(Arrays.asList(this.courses));
                tempList.remove(i);
                this.courses = (Course[]) tempList.toArray();
                break;
            }
        }

        return false;
    }

    @Override
    public Student createStudent(int id, String firstName, String lastName, String facNumber) {
        Student student = new Student(1, "Revazi", "Kobaidze");
        students[lastUsedStudentIndex] = student;
        lastUsedStudentIndex += lastUsedStudentIndex;
        return student;
    }

    @Override
    public boolean deleteStudent(int id) {

        for (int i = 0; i < this.students.length; i++) {
            Student student = this.students[i];
            if (student != null && student.getId() == id) {
                //found course and its ready to delete
                List<Student> tempList = new ArrayList<>(Arrays.asList(this.students));
                tempList.remove(i);
                this.students = (Student[]) tempList.toArray();
                break;
            }
        }

        return false;
    }

    @Override
    public Lector createAssistance(int id, String firstName, String lastName) {
        Lector assistant = new Lector(1, "Levan", "Lebanidze");

        this.assistants[lastUsedAssistanceIndex] = assistant;
        lastUsedAssistanceIndex += lastUsedAssistanceIndex;
        return assistant;
    }

    @Override
    public boolean deleteAssistance(int id) {
        return false;
    }

    @Override
    public boolean asighAssistanceToCourse(Lector assistance, Course course) {
        course.setAssistance(assistance);
        return true;
    }

    @Override
    public boolean asighProfessorToCourse(Lector professor, Course course) {
        course.setLector(professor);
        return true;
    }

    @Override
    public boolean addStudentToCourse(Student student, Course course) {
        course.addStudent(student);
        student.addCourse(course);
        return true;
    }

    @Override
    public boolean addStudentsToCourse(Student[] students, Course course) {
        for (Student student : students) {
            if (student != null) {
                course.addStudent(student);
                student.addCourse(course);
            }
        }
        return true;
    }

    @Override
    public boolean removeStudentFromCourse(Student student, Course course) {
        return false;
    }
}
