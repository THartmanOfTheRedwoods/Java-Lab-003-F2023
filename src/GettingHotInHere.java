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

//Declare variables
        String scriptPrompt = "What is the temperature in °F: ";
        String scriptDegreeInt = "%d°%s%n";
        String scriptFaren = "F";
        String scriptCelci = "C";
        String scriptDegreeDouble = "%.6f°F%n";
        String scriptIfWarmer = "If it were 2°C warmer it would be: %.6f°C";


//What is the temperature in °F: 50
        System.out.printf(scriptPrompt);            //User prompt
        int userInt = scanner.nextInt();            //int assignment from user input
        double userDouble = userInt;                //implicit type casting from int to double

//print         50°F
        System.out.printf(scriptDegreeInt, userInt, scriptFaren);

//declare variable for celciusDegree
//°C = (X°F - 32) x (5/9)
        double celciusDegree = (userDouble - 32.0) * (5/9.0);

//print         10.000000°C
        System.out.printf(scriptDegreeDouble, celciusDegree);
//10°C
        System.out.printf(scriptDegreeInt, (int) celciusDegree, scriptCelci);

//print         If it were 2°C warmer it would be: 12.000000°C
        //System.out.printf(scriptIfWarmer, );


    }
}

/*
What is the temperature in °F: 50
50°F
10.000000°C
10°C
If it were 2°C warmer it would be: 12.000000°C
 */
