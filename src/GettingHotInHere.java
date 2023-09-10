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
        float Y = (number - 32) * 5 / 9;
        int X =  (number - 32) * 5 / 9;
        int Z = (number - 32) * 5 / 9 + 2;
        System.out.printf(Y + "°C \n");
        System.out.printf(X + "°C \n");
        System.out.printf("If it were 2°C warmer it would be " + Z + "°C \n");






    }
}
