// Import the Scanner tool used for reading (All external packages/libraries/apis are imported similarly this)
import java.util.Scanner;
import java.util.ArrayList;

public class MrRoboto {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * Edited By Naqibullah Haiwadpal
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);

        // Concatenate the user response to this String.
        String domo = "Domo arigato ";

        System.out.print("My name is Mr. Roboto, are you Kilroy? ");
        // Write your program here
        System.out.println("no, I'm stan\n" + "Domo arigato no, I'm stan");

    }
}
