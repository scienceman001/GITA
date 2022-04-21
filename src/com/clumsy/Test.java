package com.clumsy;

public class Test {
    Test(){
        Student[] students=new Student[3];
        UniManagementImpl uniManagement=new UniManagementImpl();

        Student student1=uniManagement.createStudent(1,"Rezo","Kobaidze","10");
        Student student2=uniManagement.createStudent(2,"Giorgi","Berikashvili","10");
        Student student3=uniManagement.createStudent(3,"Nana","Shubitidze","10");
        students[0]=student1;
        students[1]=student2;

        Course course=uniManagement.createCourse("Physics");

        Lector assistant=uniManagement.createAssistance(1,"Levan","Lebanidze");
        uniManagement.asighAssistanceToCourse(assistant,course);
        uniManagement.addStudentToCourse(student3,course);
        uniManagement.addStudentsToCourse(students,course);


    }
}
