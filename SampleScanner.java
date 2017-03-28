import java.util.Scanner;

public class SampleScanner {
    public static void main(String[] args) {
        System.out.println("Enter an String : ");
        //Scanner sc = new Scanner(System.in);
        //int i = sc.nextInt();
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in).useDelimiter("\r\n");
        String s = sc.next();

        System.out.println(">>  [ " + s + " ] \n");
    }
}
