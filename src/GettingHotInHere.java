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
        int i = 50;
        int x = scanner.nextInt();
        double y = (x - 32) * (5.0/9);
        System.out.printf("%d%n", x);
        System.out.printf("%f%n", y);
        System.out.printf("%.0f%n", y);
        System.out.printf("If it were 2°C warmer it would be: %.6f%n", 2 + y);

    }
}
