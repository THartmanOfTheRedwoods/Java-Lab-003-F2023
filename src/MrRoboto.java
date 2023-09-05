// Import the Scanner tool used for reading (All external packages/libraries/apis are imported similarly this)
import java.util.Scanner;

public class MrRoboto {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);

        // Concatenate the user response to this String.
        String domo = "Domo arigato ";

        System.out.print("My name is Mr. Roboto, are you Kilroy? ");
        // Write your program here
    }
}

/*
Modify MrRoboto.java to do the following:

Where the comment // Write your program here exists, use the scanner instance to read standard in and wait for the user to press Enter.

After the enter key is pressed, your program should print the string typed by the user, initially you, concatenated to the String variable domo.

See Oracle's Scanner Javadoc to read all the data types Scanner can read (You want to read a String)

Hint: you're looking for a method -> nextLine

Output should look something like this:

My name is Mr. Roboto, are you Kilroy? no, I'm stan
Domo arigato no, I'm stan
 */
