package Lesson_1.Marafon;

public class Main {
    public static void main(String[] args) {
        Course c = new Course();
        Team team = new Team("Команда Один");
        c.doIt(team);
        team.showResults();
    }
}