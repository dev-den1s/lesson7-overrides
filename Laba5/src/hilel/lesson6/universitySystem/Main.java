package hilel.lesson6.universitySystem;

import hilel.lesson6.universitySystem.asistantClasses.DateOfBirth;

public class Main {
    public static void main(String[] args) {

        try {
            DateOfBirth dateOfBirth = new DateOfBirth(1, 2, 5);
        } catch (Exception e) {
            System.out.println("Error: uncorrect date of birth");
        }
    }
}
