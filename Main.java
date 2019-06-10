public class Main {
    public static void main(String args[]) {
        String a[][] = new String[4][4];
        try {
            a[0][1] = "1";
            a[1][0] = "2";
            a[0][0] = "3";
            a[1][1] = "4";
            a[0][2] = "f";
            a[1][2] = "6";
            a[2][2] = "7";
            a[2][1] = "8";
            a[2][0] = "9";
            a[4][4] = "10";
            a[5][5] = "12";
        } catch (ArrayIndexOutOfBoundsException d) {
            System.out.println(d);
        }
        Massive massive = new Massive();
        massive.summMass(a);

    }
}
