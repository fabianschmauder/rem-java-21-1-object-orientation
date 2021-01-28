package de.neuefische.objectorientation.model;


public class DancingStudent extends Student {

    private int dancingSkillLevel = 0;

    public DancingStudent(String id, String name, int dancingSkillLevel) {
        super(id, name, "dancing");
        this.dancingSkillLevel = dancingSkillLevel;
    }

    public void setDancingSkillLevel(int dancingSkillLevel) {
        this.dancingSkillLevel = dancingSkillLevel;
    }

    public int getDancingSkillLevel() {
        return dancingSkillLevel;
    }

    @Override
    public String[] determineModuls() {
        return new String[0];
    }
}
