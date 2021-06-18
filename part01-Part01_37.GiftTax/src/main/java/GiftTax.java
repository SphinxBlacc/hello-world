
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift? ");
        int i = Integer.valueOf(scan.nextLine());
        
        if (i < 5000) {
            System.out.println("No tax!");
        } else if (i >= 5000 && i < 25000) {
            System.out.println("Tax: " + (100 + ((i - 5000) * 0.08)));
        } else if (i >= 25000 && i < 55000) {
            System.out.println("Tax: " + (1700 + ((i - 25000) * 0.1)));
        } else if (i >= 55000 && i < 200000) {
            System.out.println("Tax: " + (4700 + ((i - 55000) * 0.12)));
        } else if (i >= 200000 && i < 1000000) {
            System.out.println("Tax: " + (22100 + ((i - 200000) * 0.15)));
        } else if (i >= 1000000) {
            System.out.println("Tax: " + (142100 + ((i - 1000000) * 0.17)));
        }
    }
}
