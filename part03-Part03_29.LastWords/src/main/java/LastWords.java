
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] pieces = input.split(" ");
            
            int i = pieces.length - 1;
            
            if (input.equals("")) {
                break;
            }
            
            System.out.println(pieces[i]);
        }
    }
}