package hilel.lesson6.universitySystem.asistantClasses;

public enum ScheduleTime {
    First("8:00"),
    Second("10:00"),
    Third("12:00"),
    Forth("14:00");

    private String time;

    ScheduleTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }
}
