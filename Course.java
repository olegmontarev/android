package Lesson_1.Marafon;

public class Course {

    Obstacle[] course = {new Cross(80), new Wall(2), new Wall(1), new Cross(120)};

    public void doIt(Team team){
        for (Competitor c : team.getCompetitors()) {
        for (Obstacle o : course) {
            o.doIt(c);
            if (!c.isOnDistance()) break;
        }
    }
} }