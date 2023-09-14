// Import the Scanner tool used for reading (All external packages/libraries/apis are imported similarly this)
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class MrRoboto {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.


        // Concatenate the user response to this String.
        String domo = "Domo arigato ";


        // Write your program here
        Scanner scanner = new Scanner(in);
        System.out.print("My name is Mr. Roboto, are you Kilroy? ");
        String line = "No, I'm Stan";

        String input = scanner.nextLine();
        System.out.println(domo + line);

    }

}
