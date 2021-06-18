
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]: ");
        int i = Integer.valueOf(scan.nextLine());
        
        if (i < 0) {
            System.out.println("Grade: " + "impossible!");
        } else if (i >= 0 && i <= 49) {
            System.out.println("Grade: " + "failed");
        } else if (i >= 50 && i <= 59) {
            System.out.println("Grade: " + 1);
        } else if (i >= 60 && i <= 69) {
            System.out.println("Grade: " + 2);
        } else if (i >= 70 && i <= 79) {
            System.out.println("Grade: " + 3);
        } else if (i >= 80 && i <= 89) {
            System.out.println("Grade: " + 4);
        } else if (i >= 90 && i <= 100) {
            System.out.println("Grade: " + 5);
        } else if (i > 100) {
            System.out.println("Grade: " + "incredible!");
        }
    }
}
