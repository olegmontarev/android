import java.util.*;

public class Rukzak {


    public int maxPrice(ArrayList<Box> boxes) {
        ArrayList<Box> boxes1 = new ArrayList<>(boxes);
        int maxWeight = 50;
        int maxPrice = 0;
        for (Box box : boxes) {
            maxWeight -= box.getWeight();
            maxPrice += box.getPrice();
            if (maxWeight < box.getWeight()) {
                System.out.println(maxPrice);
                System.out.println(box.getPrice());
            }
            boxes.remove(box);
        }
        return maxPrice(boxes);
    }


    public static void main(String[] args) {
        Box box1 = new Box(10, 100);
        Box box2 = new Box(20, 200);
        Box box3 = new Box(15, 180);
        Box box4 = new Box(21, 310);
        Box box5 = new Box(9, 220);
        ArrayList<Box> boxes = new ArrayList<>();
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
        boxes.add(box4);
        boxes.add(box5);
        Rukzak rukzak = new Rukzak();
        rukzak.maxPrice(boxes);
    }
}