package hillel.lesson8Interface.hw.interfaces;
import hillel.lesson8Interface.Student;

public interface IStudentStringConverter {
    /**
     * Interface means that the implementations
     * allows converting to different formats
     */
     String convert(Student student) throws IllegalAccessException;
}
