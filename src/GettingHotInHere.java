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
        int fahrenheit = scanner.nextInt();
        System.out.println(fahrenheit+"°F");
        int celsius = (fahrenheit-32) * 5 / 9;
        int newCelsius = celsius + 2;
        System.out.printf("%f°C \n", (double) celsius);
        System.out.printf("%d°C \n", celsius);
        System.out.printf("If it were 2°C warmer it would be: "+"%f°C", (double) newCelsius);

    }
}
