
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Statistics sum = new Statistics();
        Statistics sumOfEvenNumbers = new Statistics();
        Statistics sumOfOddNumbers = new Statistics();
        
        System.out.println("Enter numbers: ");
        
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input == -1) {
                break;
            }
            
            sum.addNumber(input);
            
            if(input % 2 == 0) {
                sumOfEvenNumbers.addNumber(input);
            } else {
                sumOfOddNumbers.addNumber(input);
            }
        }
        
        System.out.println("Sum: " + sum.sum());
        System.out.println("Sum of even numbers: " + sumOfEvenNumbers.sum());
        System.out.println("Sum of odd numbers: " + sumOfOddNumbers.sum());
    }
}
