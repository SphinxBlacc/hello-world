
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

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
        
        int k = (names.get(0)).length();
        int index = 0;
                
        for (int i = 0; i < names.size(); i++) {
            int j = (names.get(i)).length();
            
            if (j > k) {
                index = i;
            }
        }
        
        String h = names.get(index);
        
        int sum = 0;
        int count = 0;
        
        for (int i : ages) {
            sum += i;
            count++;
        }
        
        double average = (double)sum / count;
        
        System.out.println("Longest name: " + h);
        System.out.println("Average of the birth years: " + average);
    }
}
