package hilel.zadanie2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        String names[] = {"Denis", "Yurii", "Vadik", "Sergei"};

        Student[] students = new Student[4];
        StudentFactory studentFactory = new StudentFactory();

        for (int i = 0; i < students.length; i++)
            students[i] = studentFactory.addStudent(names[r.nextInt(4)], (int) (18 + Math.random() * 42));

        for (Student s :
                students) {
            System.out.println(s);
        }
        System.out.println("Find students by piece of name \"is\"");
        Student[] students_new = studentFactory.findStudentsByName("iss", students);
        try {
            for (Student s :
                    students_new) {
                System.out.println(s);
            }
        } catch (NullPointerException npe) {
            System.out.println(students_new);
        }


    }
}
