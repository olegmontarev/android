import java.util.ArrayList;
import java.util.List;

public class Box {
    public List<Object> box = new ArrayList<>();
    public String name;
    public String type;
    public int weight;

    public Box (String name, String type, int weight){
        this.type = type;
        this.weight = weight;
    }

    public void putFruit(Fruit fruit) {
        if (type.equals(fruit.getType())) {
            box.add(fruit);
            weight += fruit.getWeight();
        } else {
            System.out.println("В эту коробку можно класть только " + type);
        }
    }

    public void getFruit(Fruit fruit) {
        if (box.contains(fruit)) {
            box.remove(fruit);
            weight -= fruit.getWeight();
        } else {System.out.println("Фрукта " + fruit + " нет в коробке");}
    }

    public int getWeight(){
        return weight;
    }


    public void printWeight(){
        System.out.println(weight);
    }

    public void compare(Box box){
        if (box.getWeight() == this.getWeight()){
            System.out.println("Вес равен");
        } else {
            System.out.println("Вес не равен");
        }
    }

    public void shift(Box to, Fruit fruit){
            this.getFruit(fruit);
            to.putFruit(fruit);
            System.out.println("Фрукты переложены");
    }

}
