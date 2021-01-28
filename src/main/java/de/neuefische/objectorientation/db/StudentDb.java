package de.neuefische.objectorientation.db;

import de.neuefische.objectorientation.model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class StudentDb {

    private final HashMap<String, Student> students = new HashMap<>();

    public StudentDb(Student[] initialStudents) {
        for (Student student : initialStudents) {
            add(student);
        }
    }

    public void add(Student student) {
        this.students.put(student.getId(),student);
    }

    public void remove(String id) {
        this.students.remove(id);
    }

    public boolean contains(String id) {
        return students.containsKey(id);
    }

    public List<Student> list(){
        return List.copyOf(students.values());
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
