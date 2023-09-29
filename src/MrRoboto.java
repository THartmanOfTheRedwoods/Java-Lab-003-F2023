// Import the Scanner tool used for reading (All external packages/libraries/apis are imported similarly this)
import java.util.Scanner;

public class MrRoboto {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
       Scanner  sc = new Scanner(System.in);
       String sc1 = "My name is Mr. Roboto, are you Kilroy?";
        System.out.println(sc1);
       System.out.println (sc.nextLine());
       String value = "Domo Arigato";
        System.out.println(sc1 + value);
        
        

        // It worked better in class, Im not sure what else I can do here.
    }
}
