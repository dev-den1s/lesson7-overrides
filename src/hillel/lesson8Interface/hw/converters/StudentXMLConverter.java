package hillel.lesson8Interface.hw.converters;

import hillel.lesson8Interface.Student;
import hillel.lesson8Interface.hw.interfaces.IStudentStringConverter;

import java.lang.reflect.Field;

public class StudentXMLConverter implements IStudentStringConverter {
    @Override
    public String convert(Student student) throws IllegalAccessException {
        //get fields form student class
        Field[] fields = student.getClass().getFields();

        StringBuilder xml = getXMLString(fields, student);

        return xml.toString();
    }

    private StringBuilder getXMLString(Field[] fields, Student student) throws IllegalAccessException {

        StringBuilder xml = new StringBuilder("<student>");

        for (Field field :
                fields) {
            xml.append("\n<" + field.getName() + "> ");
            if (field.get(student).getClass() == String.class)
                xml.append("\"" + field.get(student) + "\"");
            else
                xml.append(field.get(student));
            xml.append(" </" + field.getName() + ">, ");
        }
        xml.deleteCharAt(xml.length() - 2);
        xml.append("\n</student>");

        return xml;
    }
}
