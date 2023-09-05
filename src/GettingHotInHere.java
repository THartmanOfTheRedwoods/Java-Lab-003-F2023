import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     *
     * Finn Clark
     * 9/5/2023
     * CIS - 12
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F: ");
        int number = scanner.nextInt();
        System.out.println(number + "°F");
        double celsius = ((number - 32)*(5.0/9.0));
        System.out.println(celsius + "°C");
        double c = (int) celsius;
        System.out.println((int) celsius + "°C");
        String string = "If it were 2°C warmer it would be: ";
        System.out.print(string + (2 + celsius) + "°C");

    }
}
