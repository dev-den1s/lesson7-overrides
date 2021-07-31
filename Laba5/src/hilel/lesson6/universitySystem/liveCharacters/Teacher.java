package hilel.lesson6.universitySystem.liveCharacters;

import hilel.lesson6.universitySystem.asistantClasses.DateOfBirth;
import hilel.lesson6.universitySystem.unliveCharacters.Faculty;

public class Teacher {
    private int teacher_id;
    private String name;
    private DateOfBirth dateOfBirth;
    private Faculty faculty;

    public Teacher(int teacher_id, String name, DateOfBirth dateOfBirth, Faculty faculty) {
        this.teacher_id = teacher_id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.faculty = faculty;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public String getName() {
        return name;
    }

    public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    public Faculty getFaculty() {
        return faculty;
    }

}
