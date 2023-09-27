/**
 *
 * @author Trevor Hartman
 * @author Cassandra Portlock
 *
 * @since Version 1.0
 *
 */
import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     *
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F: ");
        int n = scanner.nextInt();
        double c = ((n - 32.0) * (5.0 / 9.0));
        int C = (int) c;

        System.out.println(n + "°F");
        System.out.println(c + "°C");
        System.out.println(C + "°C");
        System.out.println("If it were 2°C warmer it would be: " + (2 + c) + "°C");

    }
}

