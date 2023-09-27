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
        // conversions
        double a = number-32.0;
        double b = a*5.0/9;
        float c = (float) b;
        float d = Math.round(c);
        float e = c+2;
        // outputs
        System.out.println(number+"°F");
        System.out.println(c+"°C");
        System.out.println(d+"°C");
        System.out.printf("If it were 2°C warmer it would be: "+e+"°C");

    }
}
