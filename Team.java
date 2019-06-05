package Lesson_1.Marafon;

public class Team {
    Competitor[] competitors = {new Human("Вася"), new Human("Петя"), new Cat("Кошкен"), new Dog("Собакен")};

public Team(String name){}

public Competitor[] getCompetitors(){
        return competitors;
    }

public void showResults(){
for (Competitor c : competitors) {
   c.info();
}
}
}