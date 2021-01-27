package de.neuefische.objectorientation.db;

import de.neuefische.objectorientation.model.DancingStudent;
import de.neuefische.objectorientation.model.Student;

public class StudentDb {

    private Student[] students;

    public StudentDb(DancingStudent[] students) {
        this.students = students;
    }


    public void add(Student student) {
        Student[] updatedStudents = new Student[students.length + 1];

        for (int i = 0; i < students.length; i++) {
            updatedStudents[i] = students[i];
        }

        updatedStudents[updatedStudents.length - 1] = student;

        this.students = updatedStudents;
    }


    public void remove(String id) {
        if (!contains(id)) {
            return;
        }

        Student[] updatedData = new Student[students.length - 1];

        boolean removed = false;

        for (int i = 0; i < students.length; i++) {
            if (students[i].getId().equals(id)) {
                removed = true;
            } else {
                int updatedIndex = removed ? i - 1 : i;
                updatedData[updatedIndex] = students[i];
            }
        }

        students = updatedData;
    }

    public boolean contains(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
