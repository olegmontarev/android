import java.util.Arrays;

public class Massive {

    public int summMass(String a[][]) {
        int summ = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                    try {
                        summ += Integer.parseInt(a[i][j]); }
                    catch (NumberFormatException e) {
                        System.out.println(e);
                    }
                }
            }
            System.out.println("Общая сумма всех элементова массива равна: " + summ);
            return summ;
        }
    }
