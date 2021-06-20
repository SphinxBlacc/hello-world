
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(2, 10);

    }
    public static void divisibleByThreeInRange(int number1, int number2) {
        while (number1 <= number2) {
            if (number1 % 3 == 0) {
                System.out.println(number1);
            }
            number1++;
        }
    }

}
