
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> details = new ArrayList<>();
        
        while(true) {
            String contains = scanner.nextLine();
            
            if(contains.equals("end")) {
                break;
            }
            
            details.add(contains);
        }
        
        System.out.println(details.size());
    }
}
