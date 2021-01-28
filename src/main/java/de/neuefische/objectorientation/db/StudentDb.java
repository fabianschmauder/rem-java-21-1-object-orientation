package de.neuefische.objectorientation.db;

import de.neuefische.objectorientation.model.Student;

import java.util.Arrays;

public class StudentDb {

    private Student[] students;

    public StudentDb(Student[] students) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDb studentDb = (StudentDb) o;
        return Arrays.equals(students, studentDb.students);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(students);
    }

    @Override
    public String toString() {
        return "StudentDb{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}
