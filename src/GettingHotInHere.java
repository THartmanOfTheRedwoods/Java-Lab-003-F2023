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
        int number = scanner.nextInt(); // gets the input
        float celsius = (number-32)*5/9; //converts to celsius
        int celsiusInt = Math.round(celsius); //converts floating type to integer to drop the unecessary zeros.
        float warmer = celsius+2; //calculates for "If warmer" output
        System.out.println(number+"°F"); //the following outs display all that we've calculated
        System.out.println(celsius+"°C");
        System.out.println(celsiusInt+"°C");
        System.out.println("If it were two degree's warmer it would be: " + warmer +"°C");
    }
}
