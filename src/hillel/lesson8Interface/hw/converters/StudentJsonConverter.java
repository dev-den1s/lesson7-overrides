package hillel.lesson8Interface.hw.converters;

import hillel.lesson8Interface.Student;
import hillel.lesson8Interface.hw.interfaces.IStudentStringConverter;

import java.lang.reflect.Field;

public class StudentJsonConverter implements IStudentStringConverter {
    @Override
    public String convert(Student student) throws IllegalAccessException {
        //get fields form student class
        Field[] fields = student.getClass().getFields();

        StringBuilder json = getJsonString(fields, student);

        return json.toString();
    }

    private StringBuilder getJsonString(Field[] fields, Student student) throws IllegalAccessException{
        StringBuilder json = new StringBuilder("{");
        for (Field field :
                fields) {
            json.append("\n\"" + field.getName() + "\" : ");
            if (field.get(student).getClass() == String.class)
                json.append("\"" + field.get(student) + "\"");
            else
                json.append(field.get(student));
            json.append(",");
        }
        json.append("\n}");

        json.deleteCharAt(json.length() - 3);
        return json;
    }
}
