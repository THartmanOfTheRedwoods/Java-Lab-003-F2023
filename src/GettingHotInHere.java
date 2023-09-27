/**
 * @author Trevor Hartman
 * @author MJ Fracess
 *
 * @since Version 1.0
 */
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
        int number = scanner.nextInt();
        System.out.println(number +"°F");
        double c = (number - 32) * (5.0/9.0);
        System.out.printf("or %.3f°C\n", c);
        int ci = (int) c;
        System.out.printf("and also %d°C\n", ci);
        String Y = "If it were 2°C warmer it would be: ";
        System.out.printf("%s %.1f°C", Y, c+2);
    }
}
