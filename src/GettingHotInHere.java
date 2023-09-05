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
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F: ");            //User prompt
        int number = scanner.nextInt();                                 //User input. change var name to fahrenheitDegree

        //declare variable for celciusDegree

        //do float math and assign to celciusDegree

        //
    }
}

/*
The function for conversion is: Y°C = (X°F - 32) x (5/9)

After you've converted the temperature, print out the following:

The X°F the user typed
The Y°C you converted as a floating point number
The Y°C as an integer

The String "If it were 2°C warmer it would be: 2 + Y°C" (Do the calculation and concatenation)

Output should like something like below for 50°F

What is the temperature in °F: 50
50°F
10.000000°C
10°C
If it were 2°C warmer it would be: 12.000000°C
 */
