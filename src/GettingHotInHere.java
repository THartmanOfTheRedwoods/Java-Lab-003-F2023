import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F: ");
        int x = scanner.nextInt();
        float nextx = x - 32;
        System.out.println(nextx);
        float y = nextx * (5 / 9f);
        System.out.println(y);
    }
}
