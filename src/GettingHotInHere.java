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
        double X;
        X = Double.parseDouble(scanner.nextLine());
        double Y = (X - 32) * (5.0/9.0);
        System.out.println( X + "°F");
        System.out.printf( "%.6f°C%n", Y);
        System.out.println( Y + "°C");
        System.out.println("If it were 2°C warmer it would be: " + (2 + Y) + "00000°C");
    }
}
