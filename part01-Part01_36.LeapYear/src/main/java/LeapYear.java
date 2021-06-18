
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year: ");
        int i = Integer.valueOf(scan.nextLine());
        
        if ((i % 100 == 0) && (i % 400 == 0)) {
            System.out.println("The year is a leap year.");
        } else if ((i % 100 == 0) && (i % 400 != 0)) {
            System.out.println("The year is not a leap year.");
        } else if (i % 4 == 0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
