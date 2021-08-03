package hillel.lesson8Interface.hw.printers;

import hillel.lesson8Interface.Student;
import hillel.lesson8Interface.hw.interfaces.IStudentPrinter;
import hillel.lesson8Interface.hw.interfaces.IStudentStringConverter;

public class EmptyStudentPrinter implements IStudentPrinter {
    IStudentStringConverter converter;

    public EmptyStudentPrinter(IStudentStringConverter converter) {
        this.converter = converter;
    }

    @Override
    public void print(Student student) {

    }
}
