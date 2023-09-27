import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F:  ");
        int number = scanner.nextInt();
        System.out.println(number + "°F" );

        double celsius = (number - 32) * (5.0/9);
        System.out.printf("%.3f°C\n", celsius );
        int ci = (int) celsius;
        System.out.println(ci + "°C");
        double celsius2 = celsius + 2;
        String A = "If it were 2°C warmer it would be";
        System.out.printf("%s %.3f°C\n", A, celsius2);











    }
}
