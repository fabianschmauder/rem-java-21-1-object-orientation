package de.neuefische.objectorientation.db;

import de.neuefische.objectorientation.model.Student;

import java.util.ArrayList;
import java.util.Objects;

public class StudentDb {

    private final ArrayList<Student> students = new ArrayList<>();

    public StudentDb(Student[] initialStudents) {
        for (Student student : initialStudents) {
            students.add(student);
        }
    }


    public void add(Student student) {
        this.students.add(student);
    }


    public void remove(String id) {
        Student student = findById(id);
        if(student != null){
            this.students.remove(student);
        }
    }

    private Student findById(String id){
        for (Student student : this.students) {
            if(student.getId().equals(id)){
               return  student;
            }
        }
        return null;
    }


    public boolean contains(String id) {
        Student student = findById(id);
        return student != null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDb studentDb = (StudentDb) o;
        return Objects.equals(students, studentDb.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students);
    }

    @Override
    public String toString() {
        return "StudentDb{" +
                "students=" + students +
                '}';
    }
}
