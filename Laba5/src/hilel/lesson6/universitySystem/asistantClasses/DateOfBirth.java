package hilel.lesson6.universitySystem.asistantClasses;

public class DateOfBirth {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public DateOfBirth(int day, int month, int year) throws Exception {
        if (day <= 0 || day > 12) {
            throw new Exception();
        } else this.day = day;

        if (month <= 0 || month > 12) {
            throw new Exception();
        } else this.month = month;

        if (year <= 0) {
            throw new Exception();
        } else this.year = year;
    }

    public String getDateOfBirth() {
        return "Date of Birth: " + this.day + "." + this.month
                + "." + this.year + ";";
    }
}
