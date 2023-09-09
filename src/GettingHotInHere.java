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
        /// Conversion to °F to °C
        float conversion = (number - 32) * 5.0f / 9.0f ;
        System.out.println(number + "°F");
        System.out.println(conversion + "°C");
        /// Conversion from a floating to a int
        int nonFloat = (int) conversion;
        System.out.println(nonFloat+ "°C");
        System.out.println("if it were 5°C warner it would be : " +  (conversion + 5) + "°C");









    }
}
