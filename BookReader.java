import java.io.*;

public class BookReader {
    public BookReader() {
    }

    public void read(File file, int page) {
        int position = page * 1800;
        try (RandomAccessFile raf = new RandomAccessFile(file, "r")) {
            String res = "";
            for (int i = 0; i < 1800; i++) {
                raf.seek(position);
                res = res + (char) raf.read();
                position = position + 1;
            }
            System.out.println(res);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}