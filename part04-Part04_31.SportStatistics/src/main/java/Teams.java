/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sudha_000
 */
public class Teams {
    
    private String homeTeam;
    private String visitingTeam;
    private int homeScore;
    private int visitingScore;
    private int games;
    private int wins;
    private int losses;
    
    public Teams(String homeTeam, String visitingTeam, int homeScore, int visitingScore) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeScore = homeScore;
        this.visitingScore = visitingScore;
    }
    
    public String getHomeTeam() {
        return this.homeTeam;
    }
    
    public String getVisitingTeam() {
        return this.visitingTeam;
    }
    
    public int playGame() {
        return this.games += 1;
    }
    
    public int getHomeScore() {
        return this.homeScore;
    }
    
    public int getVisitingScore() {
        return this.visitingScore;
    }
    
    public int getWins() {
        return this.wins;
    }
    
    public int getLosses() {
        return this.losses;
    }
    
    public int setWins() {
        return this.wins += 1;
    }
    
    public int setLosses() {
        return this.losses -= 1;
    }
}
