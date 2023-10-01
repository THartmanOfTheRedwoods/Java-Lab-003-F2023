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
        int degf = scanner.nextInt();
        System.out.println(degf + "°F");
        int ftoc = ((degf - 32) * 5/9);
        float ftocf = ftoc;
        System.out.println(ftocf + "°C");
        System.out.println(ftoc + "°C");
        float twowarmer = ftocf + 2;
        System.out.println("If it were 2°C warmer it would be: " + twowarmer + "°C");
    }
}
