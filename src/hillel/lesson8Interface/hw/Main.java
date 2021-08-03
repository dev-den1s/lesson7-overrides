package hillel.lesson8Interface.hw;

import hillel.lesson8Interface.Student;
import hillel.lesson8Interface.hw.converters.StudentJsonConverter;
import hillel.lesson8Interface.hw.converters.StudentXMLConverter;
import hillel.lesson8Interface.hw.interfaces.IStudentPrinter;
import hillel.lesson8Interface.hw.printers.ConsoleStudentPrinter;
import hillel.lesson8Interface.hw.printers.DelegateStudentPrinter;
import hillel.lesson8Interface.hw.printers.EmptyStudentPrinter;
import sun.font.ScriptRun;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        new Main().run();

    }

    public void run() {
        Student student = new Student("Denis", 20, BigDecimal.valueOf(800.00));

        // first and second exercises
        //converterEx(student);

        //3,4 and 5 exercises
        printerEx(student);

    }

    private void converterEx(Student student) {
        //json converter
        StudentJsonConverter jsonConverter = new StudentJsonConverter();
        try {
            System.out.println(jsonConverter.convert(student));
        } catch (IllegalAccessException illegalAccessException) {
            System.out.println("Error:One of fields has private modificator");
        }
        //xml converter
        StudentXMLConverter xmlConverter = new StudentXMLConverter();
        try {
            System.out.println(xmlConverter.convert(student));
        } catch (IllegalAccessException illegalAccessException) {
            System.out.println("Error:One of fields has private modificator");
        }
    }

    private void printerEx(Student student) {
        StudentJsonConverter jsonConverter = new StudentJsonConverter();
        StudentXMLConverter xmlConverter = new StudentXMLConverter();

        System.out.println("Console printer:");
        ConsoleStudentPrinter consolePrinter = new ConsoleStudentPrinter(jsonConverter);
        consolePrinter.print(student);

        System.out.println("Empty printer:");
        EmptyStudentPrinter emptyStudentPrinter = new EmptyStudentPrinter(xmlConverter);
        emptyStudentPrinter.print(student);

        System.out.println("Delegate printer:");
        DelegateStudentPrinter delegatePrinter = new DelegateStudentPrinter(new IStudentPrinter[]{
                consolePrinter,
                emptyStudentPrinter,
                new ConsoleStudentPrinter(xmlConverter)});
        delegatePrinter.print(student);
    }
}
