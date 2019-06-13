import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> chisla = new ArrayList<>(20);
        ArrayList<String> chislaTwo = new ArrayList<>(20);

        chisla.add("один");
        chisla.add("два");
        chisla.add("три");
        chisla.add("четыре");
        chisla.add("пять");
        chisla.add("один");
        chisla.add("два");
        chisla.add("шесть");
        chisla.add("семь");
        chisla.add("семь");
        chisla.add("восемь");
        chisla.add("девять");

        for (String chislo: chisla){
            if (!chislaTwo.contains(chislo)){
                chislaTwo.add(chislo);
            }
        }
        System.out.println(chislaTwo);


        for (String chislo: chisla){
            int count = Collections.frequency(chisla, chislo);
            System.out.println(chislo + " " + count);
        }
    }
}
