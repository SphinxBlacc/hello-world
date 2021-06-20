
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int j = 0;
        
        while (true) {
            int k = Integer.valueOf(scanner.nextLine());
            
            if (k == 0) {
                break;
            } else if (k < 0) {
                continue;
            } else {
                i = i + 1;
                j = j + k;
            }
        }
        
        if (j <= 0) {
            System.out.println("Cannot calculate the average");
        } else if (j > 0) {
            double z = (double)j / i;
            System.out.println(z);
        }
    }
}
