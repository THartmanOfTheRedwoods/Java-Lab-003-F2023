/**
 *
 * @author Trevor Hartman
 * @author Cameron Meng
 *
 * @since Version 1.0
 *
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
        double Fahrenheit = scanner.nextInt();
        double Celsius = (Fahrenheit - 32.0) * 5.0 / 9.0;
        System.out.printf(Fahrenheit+" would be "+Celsius+" degrees in celsius.");
    }
}
