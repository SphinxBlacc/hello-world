
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string: ");
        String i = scan.nextLine();
        System.out.println("Give an integer: ");
        int j = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double: ");
        double k = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean: ");
        boolean z = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + i);
        System.out.println("You gave the integer " + j);
        System.out.println("You gave the double " + k);
        System.out.println("You gave the boolean " + z);
    }
}