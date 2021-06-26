import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Books> details = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.print("Title: ");
            String name = scanner.nextLine();
            
            if(name.isEmpty()) {
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.print("Publication Year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            details.add(new Books(name, pages, year));
        }
        
        System.out.println("");
        System.out.print("What information to be printed? ");
        String answer = scanner.nextLine();
        
        for(Books e : details) {
            if(answer.equals("everything")) {
                System.out.println(e);
            } else {
                System.out.println(e.getBookTitle());
            }
        }
    }
}
