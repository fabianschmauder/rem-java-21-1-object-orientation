package de.neuefische.objectorientation.db;

import de.neuefische.objectorientation.model.Student;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDbTest {

    @Test
    @DisplayName("Add to empty list should insert Student")
    public void addToEmptyList() {
        //GIVEN
        StudentDb studentDb = new StudentDb(new Student[0]);

        //WHEN
        studentDb.add(new Student("some-id", "some-name", "some-subject"));

        //THEN
        Student[] expectedStudents = {
                new Student("some-id", "some-name", "some-subject")
        };
        assertEquals(new StudentDb(expectedStudents), studentDb);

    }

    @Test
    @DisplayName("Add to not empty list should insert Student at the end")
    public void addToNotEmptyList() {
        //GIVEN
        Student[] givenStudents = {
                new Student("some-existing-id", "some-existing", "some-existing"),
                new Student("some-other-existing-id", "some-other-existing", "some-other-existing"),
        };
        StudentDb studentDb = new StudentDb(givenStudents);

        //WHEN
        studentDb.add(new Student("some-id", "some-name", "some-subject"));

        //THEN
        Student[] expectedStudents = {
                new Student("some-existing-id", "some-existing", "some-existing"),
                new Student("some-other-existing-id", "some-other-existing", "some-other-existing"),
                new Student("some-id", "some-name", "some-subject")
        };
        assertEquals(new StudentDb(expectedStudents), studentDb);
    }

    @Test
    @DisplayName("contains should return true when student in list")
    public void containsReturnTrue() {
        //GIVEN
        Student[] givenStudents = {
                new Student("some-existing-id", "some-existing", "some-existing"),
                new Student("some-other-existing-id", "some-other-existing", "some-other-existing"),
                new Student("some-id", "some-name", "some-subject")
        };
        StudentDb studentDb = new StudentDb(givenStudents);

        //WHEN
        boolean contains = studentDb.contains("some-other-existing-id");

        //THEN
        assertTrue(contains);
    }

    @Test
    @DisplayName("contains should return false when student not in list")
    public void containsReturnFalse() {
        //GIVEN
        Student[] givenStudents = {
                new Student("some-existing-id", "some-existing", "some-existing"),
                new Student("some-other-existing-id", "some-other-existing", "some-other-existing"),
                new Student("some-id", "some-name", "some-subject")
        };
        StudentDb studentDb = new StudentDb(givenStudents);

        //WHEN
        boolean contains = studentDb.contains("not-existing");

        //THEN
        assertFalse(contains);
    }


    @Test
    @DisplayName("remove should remove student from list")
    public void removeStudent() {
        //GIVEN
        Student[] givenStudents = {
                new Student("some-existing-id", "some-existing", "some-existing"),
                new Student("some-other-existing-id", "some-other-existing", "some-other-existing"),
                new Student("some-id", "some-name", "some-subject")
        };
        StudentDb studentDb = new StudentDb(givenStudents);

        //WHEN
        studentDb.remove("some-other-existing-id");

        //THEN
        Student[] expectedStudents = {
                new Student("some-existing-id", "some-existing", "some-existing"),
                new Student("some-id", "some-name", "some-subject")
        };
        assertEquals(new StudentDb(expectedStudents), studentDb);
    }


    @Test
    @DisplayName("remove should remove no student from list when id not match")
    public void removeStudentNotMatch() {
        //GIVEN
        Student[] givenStudents = {
                new Student("some-existing-id", "some-existing", "some-existing"),
                new Student("some-other-existing-id", "some-other-existing", "some-other-existing"),
                new Student("some-id", "some-name", "some-subject")
        };
        StudentDb studentDb = new StudentDb(givenStudents);

        //WHEN
        studentDb.remove("unknownId");

        //THEN
        Student[] expectedStudents = {
                new Student("some-existing-id", "some-existing", "some-existing"),
                new Student("some-other-existing-id", "some-other-existing", "some-other-existing"),
                new Student("some-id", "some-name", "some-subject")
        };
        assertEquals(new StudentDb(expectedStudents), studentDb);
    }
}
