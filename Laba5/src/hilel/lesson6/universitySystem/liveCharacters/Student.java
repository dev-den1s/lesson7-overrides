package hilel.lesson6.universitySystem.liveCharacters;

import hilel.lesson6.universitySystem.asistantClasses.*;
import hilel.lesson6.universitySystem.unliveCharacters.*;

public class Student {
    private int student_id;
    private String name;
    private DateOfBirth dateOfBirth;
    private Group group;
    private Faculty faculty;
    private Department department;

    public Student(int student_id, String name, DateOfBirth dateOfBirth, Group group, Faculty faculty, Department department) {
        this.name = name;
        this.student_id = student_id;
        this.dateOfBirth = dateOfBirth;
        this.group = group;
        this.faculty = faculty;
        this.department = department;
    }

    public int getStudent_id() {
        return student_id;
    }

    public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public Group getGroup() {
        return group;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public Department getDepartment() {
        return department;
    }
}
