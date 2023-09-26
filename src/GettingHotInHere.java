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

        System.out.print("Enter temperature in °F: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        int celsiusInt = (int) celsius; // Convert to integer
        double warmerCelsius = celsius + 2;

        System.out.println(fahrenheit + "°F");
        System.out.printf("%.6f°C\n", celsius); // Print as a floating point number with 6 decimal places
        System.out.println(celsiusInt + "°C");
        System.out.println("If it were 2°C warmer it would be: " + warmerCelsius + "°C");

    }
}
