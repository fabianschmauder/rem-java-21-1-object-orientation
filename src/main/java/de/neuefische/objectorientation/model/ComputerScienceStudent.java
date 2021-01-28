package de.neuefische.objectorientation.model;

import java.util.Objects;

public class ComputerScienceStudent extends Student implements Nerd {

    private String name;
    private String firstProgrammingLanguage;
    private String id;

    public ComputerScienceStudent(String name, String firstProgrammingLanguage, String id) {
        super(id,name, "it");
        this.name = name;
        this.firstProgrammingLanguage = firstProgrammingLanguage;
        this.id = id;
    }

    public void setFirstProgrammingLanguage(String firstProgrammingLanguage) {
        this.firstProgrammingLanguage = firstProgrammingLanguage;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String[] determineModuls() {
        return new String[0];
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String getFirstProgrammingLanguage() {
        return firstProgrammingLanguage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerScienceStudent that = (ComputerScienceStudent) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(firstProgrammingLanguage, that.firstProgrammingLanguage) &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, firstProgrammingLanguage, id);
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "name='" + name + '\'' +
                ", firstProgrammingLanguage='" + firstProgrammingLanguage + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
