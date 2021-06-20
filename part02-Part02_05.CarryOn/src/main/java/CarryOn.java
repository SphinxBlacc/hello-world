
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Shall we carry on? ");
            String i = scanner.nextLine();
             
            if (i.equals("no")) {
                break;
            }
        }
       
        
    }
}
