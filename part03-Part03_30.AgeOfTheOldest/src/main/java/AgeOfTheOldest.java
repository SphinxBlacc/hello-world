
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] pieces = input.split(",");
            
            ages.add(Integer.valueOf(pieces[1]));
        }
        
        int largest = ages.get(0);
        
        for (int i = 0; i < ages.size(); i++) {
            int j = ages.get(i);
            
            if (j >= largest) {
                largest = j;
            }
        }
        
        System.out.println("Age of the oldest: " + largest);
    }
}
