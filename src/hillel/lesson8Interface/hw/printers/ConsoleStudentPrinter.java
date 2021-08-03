package hillel.lesson8Interface.hw.printers;

import hillel.lesson8Interface.Student;
import hillel.lesson8Interface.hw.interfaces.IStudentPrinter;
import hillel.lesson8Interface.hw.interfaces.IStudentStringConverter;

public class ConsoleStudentPrinter implements IStudentPrinter {
    IStudentStringConverter converter;

    public ConsoleStudentPrinter(IStudentStringConverter converter) {
        this.converter = converter;
    }

    @Override
    public void print(Student student) {
        try {
            System.out.println(converter.convert(student));
        } catch (IllegalAccessException illegalAccessException) {
            System.out.println("Error: not allowed access!");
        }
    }
}
