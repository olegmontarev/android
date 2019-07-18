import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.*;

public class Main {
    public static void main (String[] args){

        File file = new File("src/some_text_file.txt");

    byte[] b = new byte[(int) file.length()];
         try {
        FileInputStream fileInputStream = new FileInputStream(file);
        fileInputStream.read(b);
        for (int i = 0; i < b.length; i++) {
            System.out.print((char)b[i]);
        }
    } catch (FileNotFoundException e) {
        System.out.println("File Not Found.");
        e.printStackTrace();
    }
          catch (IOException e1) {
        System.out.println("Error Reading The File.");
        e1.printStackTrace();
    }


        ArrayList<InputStream> files = new ArrayList<>();
         try {
             files.add(new FileInputStream("src/text 1.txt"));
             files.add(new FileInputStream("src/text 2.txt"));
             files.add(new FileInputStream("src/text 3.txt"));
             files.add(new FileInputStream("src/text 4.txt"));
             files.add(new FileInputStream("src/text 5.txt"));
             SequenceInputStream in = new SequenceInputStream(Collections.enumeration(files));
             int x;
             while ((x = in.read()) != -1){
                 System.out.print((char)x);
             }
         } catch (Exception e) {e.printStackTrace();}


         BookReader bookReader = new BookReader();
         File book = new File("src/book.txt");
         System.out.println("\n");
         System.out.println("Trying to read the book");
         Scanner in = new Scanner(System.in);
         System.out.println("Введите номер страницы: ");
         int input = in.nextInt();
         System.out.println(System.currentTimeMillis());
         bookReader.read(book, input);
         System.out.println(System.currentTimeMillis());
}

}
