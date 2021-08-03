package hillel.lesson8Interface.hw.printers;

import hillel.lesson8Interface.Student;
import hillel.lesson8Interface.hw.interfaces.IStudentPrinter;

public class DelegateStudentPrinter implements IStudentPrinter {
    IStudentPrinter[] printers;

    public DelegateStudentPrinter(IStudentPrinter[] printers) {
        this.printers = printers;
    }

    @Override
    public void print(Student student) {
        for (IStudentPrinter printer :
                printers) {
            printer.print(student);
        }
    }
}
