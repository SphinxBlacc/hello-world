
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = Integer.valueOf(scanner.nextLine());
        
        for (int j = 0; j < (i + 1); j++) {
            System.out.println(j);
        }
    }
}
