public class Stepen {

    public static void main(String[] args) {
        System.out.println(factorial(3, 5));
    }

    private static int factorial(int n, int x) {
        if (x <= 0) {
            return 1;
        }

            return n * factorial(3, x-1);
    }}


