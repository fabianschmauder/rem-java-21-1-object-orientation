package de.neuefische.objectorientation;

import de.neuefische.objectorientation.db.StudentDb;
import de.neuefische.objectorientation.model.Student;

import java.util.ArrayList;
import java.util.List;

public class AppMain {


    public static void main(String[] args) {
        StudentDb db = new StudentDb(new Student[0]);
        db.add(new Student("2", "Frank", "sport"));

        List<Student> list = db.list();
        list.add(new Student("3","Jochen","test"));

    }

    private static void printAllStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student.getName() + "Subject: " +student.getSubject());
        }
    }
}
