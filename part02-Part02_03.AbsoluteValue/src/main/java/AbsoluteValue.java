
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = Integer.valueOf(scanner.nextLine());
                
        if (i < 0) {
            int j = i * (-1);
            System.out.println(j);
        } else {
            System.out.println(i);
        }
    }
}
