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
        double temp = (number - 32) * ( 5.0 / 9.0);
        //print the temp user put in as a string
        System.out.println(number + "°F");
        //print the converted temp
        System.out.println(temp);
        //print the converted as a int
        //String temp2 = String.format("%.0f",temp);

        System.out.printf("%.6f°C%n",temp);
        //print the converted If it were 2°C warmer
        double warmer = temp + 2.0;
        System.out.println("If it were 2°C warmer it would be: " + warmer + "°C");

    }
}
