package afl.kh.main.matches;

import afl.kh.main.Main;
import afl.kh.main.player.Player;
import afl.kh.main.teams.Team;
import afl.kh.main.venues.Venues;

import static afl.kh.main.teams.Team.*;

public class Match {

    private int goals1;
    private int goals2;
    private int behinds1;
    private int behinds2;
    private int score1;
    private int score2;
    private Team team1;
    private Team team2;
    private int roundNumber;
    private Venues venue;

    /* Simulate scoring and who wins based off team overall stat
    Generate a "Home Court advantage" hedge
    Generate a "Venues your team is shit at" hedge
    Generate a weather hedge
     */
    public void simulateGame(Player p, Team homeTeam, Team awayTeam) {
        this.venue = homeTeam.getHomeVenue(); // Sets the venue

        this.team1 = homeTeam;
        this.team2 = awayTeam;

        int userRating = homeTeam.getOverallRating(); // 92 e.g
        int oppoRating = awayTeam.getOverallRating(); // 91 e.g

        int homeScore = (int) (Math.random() * userRating); // Math.random = 0 - 1 float
        int awayScore = (int) (Math.random() * oppoRating);
        if (homeScore <= 40) {
            homeScore = 40;
        }
        if (awayScore <= 40) {
            awayScore = 40;
        }

        System.out.println("Welcome to match day");
        System.out.println("=====================");
        System.out.println(homeTeam.getTeamName() + ": " + homeScore +
                " " + awayTeam.getTeamName() + ": " + awayScore);

        if (homeScore > awayScore) {
            System.out.println("You win!");
            homeTeam.setWins(1);
            homeTeam.setPointsOnLadder(4);
            System.out.println(homeTeam.getWins());
        } else if (homeScore < awayScore) {
            System.out.println("You lose!");
            homeTeam.setLosses(1);
            System.out.println(homeTeam.getLosses());
        } else {
            System.out.println("Draw!");
            homeTeam.setDraws(1);
            homeTeam.setPointsOnLadder(2);
        }
        Main.commandCentre(p);
    }


}
