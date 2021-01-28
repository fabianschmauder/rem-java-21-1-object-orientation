package de.neuefische.objectorientation;

import de.neuefische.objectorientation.db.StudentDb;
import de.neuefische.objectorientation.model.Student;

import java.util.ArrayList;
import java.util.List;

public class AppMain {


    public static void main(String[] args) {
        StudentDb db = new StudentDb(new Student[0]);
        db.add(new Student("2", "Frank", "sport"));

        try {
            db.remove("3");
        }catch (IllegalArgumentException exception){
            System.out.println(exception);
        }
    }

    private static void printAllStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student.getName() + "Subject: " +student.getSubject());
        }
    }
}
