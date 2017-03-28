import java.io.*;

public class SampleReader {
    public static void main(String[] args) {        
        String str = new String("blank");
        System.out.println("lineout");
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(in);
            str = input.readLine();

        } catch (IOException io) {
            io.printStackTrace();
        }
        System.out.println("[" + str + "]\n");
    }
}
