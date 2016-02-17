import java.io.*;

/**
 * Created by doncredas on 17/02/16.
 */
public class Main {
    public static void main(String[] args) {
        File f  = new File("hello.txt");

        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(f), true);
            for (int i = 0; i < 10; i++) {
                out.println(i + ") Hello "+i);
            }
            out.close();
            BufferedReader in = new BufferedReader(new FileReader(f));
            String text = "";

            while ((text = in.readLine()) != null) {
                System.out.println(text);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
