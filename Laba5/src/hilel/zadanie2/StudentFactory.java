package hilel.zadanie2;

public class StudentFactory {

    public Student addStudent(String name, int age) {
        return new Student(name, age);
    }

    public Student[] bubbleSort(Student[] students) {
        Student student;
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i; j < students.length - i - 1; j++) {
                if (students[j].getName().compareTo(students[j + 1].getName()) > 0) {
                    student = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = student;
                }
            }
        }
        return students;
    }

    public Student findStudentByName(String half_name, Student[] students) {
        Student student = null;
        for (Student s :
                students) {
            if (s.getName().contains(half_name)){
                student = s;
                break;
            }
        }
        return student;
    }

    public Student[] findStudentsByName(String half_name, Student[] students) {
        Student[] student = null;
        for (Student s :
                students) {
            if (s.getName().contains(half_name)){
                student = addToArray(student, s);
                //System.arraycopy(students,);
            }
        }
        return student;
    }

    public Student[] addToArray(Student[] students, Student student) {
        if (students == null) {
            students = new Student[0];
        }

        Student[] new_students = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            new_students[i] = students[i];
        }
        new_students[students.length] = student;
        return new_students;
    }

}
