
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String details = scanner.nextLine();
            
            if(details.equals("end")) {
                break;
            }
            
            int number = Integer.valueOf(details);
            
            int cube = number * number * number;
            
            System.out.println(cube);
        }
    }
}
