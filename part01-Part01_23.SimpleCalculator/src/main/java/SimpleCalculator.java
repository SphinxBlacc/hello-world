
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        int x = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number: ");
        int y = Integer.valueOf(scanner.nextLine());
        
        int i = x + y;
        System.out.println(x + " + " + y + " = " + i);
        
        int j = x - y;
        System.out.println(x + " - " + y + " = " + j);
        
        int k = x * y;
        System.out.println(x + " * " + y + " = " + k);
        
        double z = (double)x / y;
        System.out.println(x + " / " + y + " = " + z);
    }
}
