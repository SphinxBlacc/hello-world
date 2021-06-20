
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int j = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            int k = Integer.valueOf(scanner.nextLine());
            
            if (k == 0) {
                break;
            } else {
                i = i + 1;
                j = j + k;
            }
        }
        
        System.out.println("Number of numbers: " + i);
        System.out.println("Sum of the numbers: " + j);
    }
}
