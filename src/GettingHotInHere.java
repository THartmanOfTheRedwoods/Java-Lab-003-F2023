import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     *
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F: ");

        // fTemp = the temperature in Fahrenheit as an int.
        int fTemp = scanner.nextInt();
        System.out.println(fTemp+"°F");

        //equasion for converting Fahrenheit to Celsius as a floating point number.
        double yCel = (fTemp-32.0)*(5.0/9);

        // print double of Celsius temperature.
        System.out.printf("%.6f°C%n",yCel);

        //print int of Celsius temperature.
        System.out.println((int)yCel+ "°C");

        //print Celsius temperature + 2 degress as a floating point number.
        String plusTwo = "If it were 2°C warmer it would be: ";
        System.out.print(plusTwo);
        System.out.printf("%.6f°C%n",yCel);
    }
}
