
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            String[] pieces = input.split(",");
            
            if (input.equals("")) {
                break;
            }
        
            names.add(pieces[0]);
            ages.add(Integer.valueOf(pieces[1]));
        }
        
        int largest = ages.get(0);
        String oldestPerson = names.get(0);
        
        for (int i = 0; i < ages.size(); i++) {
            int j = ages.get(i);
            
            if (j > largest) {
                largest = j;
                oldestPerson = names.get(i);
            }
        }
        
        System.out.println("Name of the oldest: " + oldestPerson);
    }
}
