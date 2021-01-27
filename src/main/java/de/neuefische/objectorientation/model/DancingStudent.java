package de.neuefische.objectorientation.model;

import java.util.Objects;

public class DancingStudent implements Student {

    private String name;
    private String id;

    public DancingStudent(String name, String id) {
        this.name = name;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public String getSubject() {
        return "dancing";
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DancingStudent that = (DancingStudent) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "DancingStudent{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
