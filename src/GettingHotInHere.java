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
        // Assign user input to numberF
        int numberF = scanner.nextInt();
        System.out.println(numberF + "°F");
        // Convert user input to Celcius and assign it to numberC
        double numberC = (numberF - 32) * (5.0/9.0);
        System.out.println(numberC + "°C");
        // Print numberC as an integer rather than a floating point
        System.out.println((int)numberC + "°C");
        System.out.println("If it were 2°C warmer it would be: " + (numberC + 2.0) + "°C");
    }
}
