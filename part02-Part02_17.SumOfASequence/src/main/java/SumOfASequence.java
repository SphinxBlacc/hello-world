
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number? ");
        int number = 1;
        int sum = 0;
        
        for (int lastNumber = Integer.valueOf(scanner.nextLine()); number <= lastNumber; number++) {
            sum += number;
        }
        System.out.println("The sum is " + sum);
    }
}
