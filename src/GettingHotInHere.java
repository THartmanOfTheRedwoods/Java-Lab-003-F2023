import java.util.Scanner;

public class GettingHotInHere {
    /**
     * @param args Command line arguments [The source file path, The target file path, ...]
     * @author Olivia McKittrick
     * Teaching Mr. Roboto how to listen to us.
     **/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // The instantiation code for a Scanner instance.
        System.out.print("What is the temperature in °F: ");

        int number = scanner.nextInt();

        double celsius = (double) ((number - 32) * 5) / 9;

        System.out.printf("%.0f°F%n", (double) number); // Displays °F without a decimal
        System.out.printf("%.6f°C%n", celsius); // Displays °C with a decimal
        System.out.printf("%.0f°C%n", celsius); // Displays °C without a decimal

        double warmerCelsius = celsius + 2;
        System.out.printf("If it were 2°C warmer it would be: %.6f°C%n", warmerCelsius);
    }
}

