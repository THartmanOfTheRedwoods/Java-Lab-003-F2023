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
        int fahr = scanner.nextInt(); // Read input Fahrenheit
        double cent = (fahr - 32) * (5.0/9.0); // Calculate centigrade
        int centint = (int) cent + 100; // Int casted centigrade with arbitrary value

        // Formatted and appended outputs
        System.out.printf("The current temperature in Fahrenheit is %d degrees, which is %.2f degrees Celcius. " +
                "Were it 100 degrees hotter, it would be %d degrees Celcius, and you would be dead.\n", fahr, cent, centint);

        System.out.printf("\nFahrenheit int: " + fahr + "\nCentigrade double: " + cent + "\nCentigrade int: " + (int) cent + "\n"); // Required type outputs for assignment
    }
}
