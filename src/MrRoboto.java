// Import the Scanner tool used for reading (All external packages/libraries/apis are imported similarly this)
import java.util.Scanner;

public class MrRoboto {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     *      * @author Trevor Hartman
     *      * @author Atticus Blanco
     *      *
     *      * @since Version 1.0
     **/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = scanner.nextLine();

        String domo = "Domo arigato ";
        String nameMrRoboto = "My name is Mr. Roboto, are you Kilroy? ";
        String stan = "no, I'm %s";

        System.out.println(nameMrRoboto + String.format(stan, userName));
        System.out.println(domo + String.format(stan, userName));
    }
}