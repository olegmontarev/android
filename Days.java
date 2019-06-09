public enum Days {
    SUNDAY ("Воскресенье", 40), MONDAY ("Понедельник", 40),
    TUESDAY ("Вторник", 32), WEDNESDAY ("Среда", 24),
    THURSDAY ("Четверг", 16), FRIDAY ("Пятница", 8),
    SATURDAY ("Суббота", 0);

    private String rus;
    private int workingHours;

    Days(String rus, int workingHours) {
        this.rus = rus;
        this.workingHours = workingHours;
    }

    public int getWorkingHours(){
        return workingHours;
    }
}
