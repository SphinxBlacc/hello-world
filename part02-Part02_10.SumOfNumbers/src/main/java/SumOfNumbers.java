
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            int j = Integer.valueOf(scanner.nextLine());
            
            if (j == 0) {
                break;
            } else {
                i = i + j;
            }
        }
        
        System.out.println("Sum of the numbers: " + i);
    }
}
