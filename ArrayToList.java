import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

        public ArrayToList(){}

        public List<String> toList(String[] array){

        List<String> list = new ArrayList<String>();

        list = Arrays.asList(array);

        for (String i : list)
            System.out.print(" " + i);

        return list;

    }
}
