import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     * @author Trevor Hartman
     * @author Atticus Blanco
     *
     * @since Version 1.0
     **/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String scriptPrompt = "What is the temperature in °F: ";
        String scriptDegreeInt = "%d°%s%n";
        String scriptDegreeDouble = "%f°%s%n";
        String scriptFaren = "F";
        String scriptCelci = "C";
        String scriptIfWarmer = "If it were 2°C warmer it would be: %.6f°C";

        System.out.printf(scriptPrompt);
        int userInt = scanner.nextInt();

        System.out.printf(scriptDegreeInt, userInt, scriptFaren);

        double celciusDegree = ( (double) userInt - 32.0) * (5.0/9.0);

        System.out.printf(scriptDegreeInt, (int) celciusDegree, scriptCelci);
        System.out.printf(scriptDegreeDouble, celciusDegree, scriptCelci);
        System.out.printf(scriptIfWarmer, celciusDegree + 2);
    }
}
