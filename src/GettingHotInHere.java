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
        System.out.println(number + "°F");

        double y = (number-32.0)*(5.0/9.0);
        System.out.println(y + "°C");
        int newY = (int) y;
        System.out.println(newY + "°C");
        System.out.println("If it were 2°C warmer it would be: " + (2+newY) + "°C");

    }
}
