package de.neuefische.objectorientation;

import de.neuefische.objectorientation.db.StudentDb;
import de.neuefische.objectorientation.model.ComputerScienceStudent;
import de.neuefische.objectorientation.model.DancingStudent;
import de.neuefische.objectorientation.model.Student;

public class AppMain {


    public static void main(String[] args) {

        DancingStudent dancingStudent = new DancingStudent("Frank", "1");
        System.out.println(dancingStudent.getName());

        ComputerScienceStudent computerScienceStudent = new ComputerScienceStudent("Jochen", "c#", "2");
        System.out.println(computerScienceStudent.getName());

        StudentDb studentDb = new StudentDb(new DancingStudent[0]);
        studentDb.add(dancingStudent);

        Student[] students = {computerScienceStudent, dancingStudent};
        printAllStudents(students);

    }

    private static void printAllStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student.getName() + "Subject: " +student.getSubject());
        }
    }
}
