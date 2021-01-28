package de.neuefische.objectorientation;

import de.neuefische.objectorientation.db.StudentDb;
import de.neuefische.objectorientation.model.Student;

public class AppMain {


    public static void main(String[] args) {

        StudentDb studentDb = new StudentDb(new Student[0]);

        Student student = new Student("1", "Frank", "Sport");
        studentDb.add(student);

        Student[] students = {student};
        printAllStudents(students);

    }

    private static void printAllStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student.getName() + "Subject: " +student.getSubject());
        }
    }
}
