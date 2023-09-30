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
        int n = number-32;
        double u = 5.0 / 9.0;
        int p = (int) (n*u);
        float l = (float) (p);
        System.out.println(number + "°F");
        System.out.println(l + "°C");
        System.out.println(p + "°C");
        System.out.println("If it were 2°C warmer it would be: " + (2+l) + "°C");
    }
}
