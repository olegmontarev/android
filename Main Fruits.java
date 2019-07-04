public class Main {
    public static void main (String[] args){
        Fruit one = new Fruit("Apple", 1);
        Fruit two = new Fruit("Apple", 2);
        Fruit three = new Fruit("Apple", 3);
        Fruit four = new Fruit("Apple", 4);
        Fruit five = new Fruit("Apple", 5);
        Fruit six = new Fruit("Orange", 1);
        Fruit seven = new Fruit("Orange", 2);
        Fruit eight = new Fruit("Orange", 3);
        Fruit nine = new Fruit("Orange", 4);
        Fruit ten = new Fruit("Orange", 5);

        Box boxOne = new Box("Один", "Apple", 0);
        Box boxTwo = new Box("Два", "Orange", 0);
        Box boxThree = new Box("Три", "Apple", 0);
        Box boxFour = new Box("Четыре", "Orange", 0);
        boxOne.putFruit(one);
        boxOne.putFruit(two);
        boxOne.putFruit(ten);
        boxTwo.putFruit(three);
        boxTwo.putFruit(nine);
        boxTwo.putFruit(seven);
        boxThree.putFruit(four);
        boxThree.putFruit(five);
        boxFour.putFruit(six);
        boxFour.putFruit(eight);

        System.out.println("Вес коробки один: ");
        boxOne.printWeight();
        System.out.println("Вес коробки два: ");
        boxTwo.printWeight();
        System.out.println("Вес коробки три: ");
        boxThree.printWeight();
        System.out.println("Вес коробки четыре: ");
        boxFour.printWeight();

        boxOne.compare(boxFour);

        boxOne.shift(boxThree, one);
        System.out.println("Теперь вес коробки один: ");
        boxOne.printWeight();
        System.out.println("Теперь вес коробки три: ");
        boxThree.printWeight();
    }
}
