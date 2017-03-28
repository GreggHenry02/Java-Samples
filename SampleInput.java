import java.io.Console;
import java.util.Arrays;
import java.io.IOException;

public class SampleInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter code\n");
        //String input_string = (String) System.in.read();
        //System.out.println("Data entered:[" + input_string + "]\n");
        Console c = System.console();
        if (c == null) {
            System.err.println("No console.");
            System.exit(1);
        }

        String line1 = c.readLine("Enter line 1 :");
        System.out.println("Data entered [" + line1 + "]\n");
    }
}
