import java.util.ArrayList;

public class ArrayReplace {

    public Object[] array;


    public ArrayReplace(){}


    public Object[] change(Object[] array){
        Object a = array[2];
        array[2] = array[4];
        array[4] = a;
        for (Object i: array){
            System.out.println(i);
        }
        return array;
    }


}