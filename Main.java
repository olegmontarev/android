import java.util.Random;

public class Main {

    public static void main(String[] args) {

        final Random random = new Random();

        for (int i = 0; i < 20; i++){
            Tree<Integer> tree1 = new TreeImpl<>();
            for (int j = 0; j < 12; j++){
                tree1.add(random.nextInt(100));
            }
            tree1.display();
            tree1.isBalanced();
        }



    }
}

