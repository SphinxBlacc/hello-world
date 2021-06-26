
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed? ");
        String fileName = scanner.nextLine();
        
        try (Scanner sc = new Scanner(Paths.get(fileName))) {
            while(sc.hasNextLine()) {
                String details = sc.nextLine();
                
                System.out.println(details);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
