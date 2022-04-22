package com.clumsy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArgumentParser {
    public static final String CREATE_STUDENT = "createStudent";
    public static final String CREATE_COURSE = "createCourse";
    public static final String CREATE_ASSISTANCE = "createAssistance";
    public static final String CREATE_PROFESSOR = "createProfessor";
    public static final String ASSIGN_STUDENT_TO_COURSE = "assignStudentToCourse";
    public static final String ASSIGN_ASSISTANCE_TO_COURSE = "assignAssistanceToCourse";
    public static final String ASSIGN_PROFESSOR_TO_COURSE = "assignProfessorToCourse";

    Map commands = new HashMap();

    ArgumentParser() {


//        maby latter ill make syntax like help -command name
        commands.put("createStudent", "createStudent <user_id> <userFirstName> <userLastName> <facNumber>");
        commands.put("createCourse", "createCourse <courseName>");
        commands.put("assignStudentToCourse", "assignStudentToCourse <student_id> <courseName>");
        commands.put("createAssistance", "createAssistance <user_id> <userFirstName> <userLastName>");
        commands.put("createProfessor", "createProfessor <user_id> <userFirstName> <userLastname> <lectorType>");
        commands.put("assignProfessorToCourse", "assignProfessorToCourse <lectort_id> <courseName>");


        Scanner in = new Scanner(System.in);
        UniManagementImpl uniManagement = new UniManagementImpl();
        while (true) {
            String command = in.nextLine();
            String[] s = command.split(" ");
            switch (s[0]) {
                case CREATE_STUDENT:
                    uniManagement.createStudent(Integer.parseInt(s[1]), s[2], s[3], s[4]);
                    break;
                case CREATE_COURSE:
                    uniManagement.createCourse(s[1]);
                    break;
                case CREATE_ASSISTANCE:
                    uniManagement.createAssistance(Integer.parseInt(s[1]), s[2], s[3]);
                    break;
                case CREATE_PROFESSOR:
                    uniManagement.createProfessor(Integer.parseInt(s[1]), s[2], s[3], s[4]);
                    break;
                case ASSIGN_STUDENT_TO_COURSE:
                    uniManagement.addStudentToCourse(Integer.parseInt(s[1]), s[2]);
                    break;
                case ASSIGN_ASSISTANCE_TO_COURSE:
                    uniManagement.addAssistanceToCourse(Integer.parseInt(s[1]), s[2]);
                    break;
                case ASSIGN_PROFESSOR_TO_COURSE:
                    uniManagement.addProfessorToCourse(Integer.parseInt(s[1]), s[2]);
                    break;
                case "help":
                    this.commands.values().forEach(v->{
                        System.out.println(v);
                    });
                    break;
                default:
                    System.out.println("wrong command provided");
                    break;
            }
        }

    }
}
