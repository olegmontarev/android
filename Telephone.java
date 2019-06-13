import java.util.*;

public class Telephone {
    HashMap<String, HashSet<String>> phone = new HashMap<>();
    String number;

    public Telephone() {
        phone.put("Андрей Иванович", new HashSet<>(Arrays.asList("89101234567", "89205678910")));
        phone.put("Иван Петрович", new HashSet<>(Arrays.asList("89106667788")));
        phone.put("Семен Семенович", new HashSet<>(Arrays.asList("89109876543", "89202223344")));
    }

    public void getPhone(String surname){
        number = phone.get(surname).toString();
        System.out.println(number);
    }

    public void addPhone(String name, HashSet<String> numbers){
        phone.put(name, numbers);
    }

    public static void main(String[] args) {
        Telephone spravochnik = new Telephone();
        spravochnik.addPhone("Олег", new HashSet<>(Arrays.asList("89100000000", "89202222222")));
        spravochnik.getPhone("Андрей Иванович");
        spravochnik.getPhone("Олег");
    }
}
