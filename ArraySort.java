import java.util.Arrays;

public class ArraySort {

    public ArraySort() {
    }

    public static void main(String[] args) {
        int[] array;
        array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 10000));
        }

        System.out.println(System.currentTimeMillis());

        ArraySort arraySort = new ArraySort();
        arraySort.sortBubble(array);
        arraySort.sortSelect(array);
        arraySort.sortSelect(array);

        System.out.println(System.currentTimeMillis());




    }

    public void sortBubble(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > (array[j + 1])) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


    public void sortSelect(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < (array[minIndex])) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public void sortInsert(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int in = i;
            while (in > 0 && array[in - 1] >= (temp)) {
                array[in] = array[in - 1];
                in--;
            }
            array[in] = temp;
        }
    }

}


