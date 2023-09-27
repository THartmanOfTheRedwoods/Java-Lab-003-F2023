import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanboi = new Scanner(System.in);
        System.out.print("What is the temperature in °F: ");
        int number = scanboi.nextInt();
        System.out.println(number+"°F");
        double currentCelsius = (number-32) * (5.0/9.0);
        System.out.printf("%.6f°C", currentCelsius);
        System.out.println( );
        System.out.printf("%.0f°C", currentCelsius);
        System.out.println( );
        double added = (2+currentCelsius);
        System.out.printf("If it were 2°C warmer it would be: %.6f °C", added );
        //Y°C = (X°F - 32) x (5/9)
        /**
         * What is the temperature in °F: 50
         * 50°F
         * 10.000000°C
         * 10°C
         * If it were 2°C warmer it would be: 12.000000°C
         */
    }
}
