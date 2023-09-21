/**
 *
 * @author Trevor Hartman
 * @author Angelina Perez
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
        int number = scanner.nextInt();

        // Performing the temperature conversion
        double celsius = (number - 32) * 5.0 / 9.0;

        // the results from the conversion
        System.out.println(number + "°F");
        System.out.printf("%.6f°C%n", celsius);
        System.out.println((int) celsius + "°C");

        //results if the temperature were 2°C warmer
        double warmerCelsius = celsius + 2;
        System.out.println("If it were 2°C warmer it would be: " + String.format("%.6f°C", warmerCelsius));
    }
}
