
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        System.out.println("Where to? ");
        int k = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from? ");
        int z = Integer.valueOf(scanner.nextLine());
        
        while (z <= k) {
            System.out.println(z);
            z++;
        }
    }
}
