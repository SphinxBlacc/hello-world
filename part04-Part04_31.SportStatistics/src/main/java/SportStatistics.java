
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String file = scan.nextLine();
        
        System.out.println("Team: ");
        String teamName = scan.nextLine();
        
        ArrayList<Teams> records = readRecordsFromFile(file);
        
        int count = 0;
        int wins = 0;
        int losses = 0;
        
        for(Teams teams : records) {
            if(teams.getHomeTeam().equals(teamName)) {
                count += 1;
                
                if(teams.getHomeScore() > teams.getVisitingScore()) {
                    wins += 1;
                } else {
                    losses += 1;
                }
            }
            
            if(teams.getVisitingTeam().equals(teamName)) {
                count += 1;
                
                if(teams.getVisitingScore() > teams.getHomeScore()) {
                    wins += 1;
                } else {
                    losses += 1;
                }
            }
        }
        
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    public static ArrayList<Teams> readRecordsFromFile(String file) {
            ArrayList<Teams> teams = new ArrayList<>();
            
            try (Scanner scanner = new Scanner(Paths.get(file))) {
                while(scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    
                    String[] parts = line.split(",");
                    
                    String homeTeam = parts[0];
                    String visitingTeam = parts[1];
                    int homeScore = Integer.valueOf(parts[2]);
                    int visitingScore = Integer.valueOf(parts[3]);
                    
                    teams.add(new Teams(homeTeam, visitingTeam, homeScore, visitingScore));
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            
            return teams;
        }
}
