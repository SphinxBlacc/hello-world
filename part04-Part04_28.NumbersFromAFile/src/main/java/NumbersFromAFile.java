
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
        //System.out.println("");
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        //System.out.println("");
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        //System.out.println("");

        try (Scanner sc = new Scanner(Paths.get(file))) {
            while(sc.hasNextLine()) {
                int number = Integer.valueOf(sc.nextLine());
                
                list.add(number);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        int i = 0;
        for(int digit : list) {
            if(digit >= lowerBound && digit <= upperBound) {
                i++;
            }
        }
        
        System.out.println("Numbers: " + i);
    }

}
