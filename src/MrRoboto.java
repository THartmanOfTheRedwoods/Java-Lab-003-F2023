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

        Scanner userString = new Scanner(System.in);                            //UserString prompt in

        System.out.println("What is your name?");
        String userName = userString.nextLine();

        String domo = "Domo arigato ";                                          //String scripts
        String nameMrRoboto = "My name is Mr. Roboto, are you Kilroy? ";
        String stan = "no, I'm %s";

        System.out.println(nameMrRoboto + String.format(stan, userName));
        System.out.println(domo + String.format(stan, userName));

        /*
        My name is Mr. Roboto, are you Kilroy? no, I'm stan
        Domo arigato no, I'm stan
         */

    }
}

/*

After the enter key is pressed, your program should print the string typed by the user, initially you, concatenated to the String variable domo.

See Oracle's Scanner Javadoc to read all the data types Scanner can read (You want to read a String)

Hint: you're looking for a method -> nextLine
 */
