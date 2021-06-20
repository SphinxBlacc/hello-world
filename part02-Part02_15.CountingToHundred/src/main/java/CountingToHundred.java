
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = Integer.valueOf(scanner.nextLine()); i < 101; i++) {
            System.out.println(i);
        }
    }
}
