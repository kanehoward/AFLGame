package afl.kh.main.teamplayers;

import afl.kh.main.teams.Team;

import java.util.ArrayList;

import static afl.kh.main.teams.Team.*;

public class TeamPlayers {

    private String firstName;
    private String lastName;
    private int overallStat;
    private Team playsFor;

    public static TeamPlayers lShuey = new TeamPlayers("Luke", "Shuey", 88, wce);
    public static TeamPlayers nNaitanui = new TeamPlayers("Nicholas", "Naitanui", 92, wce);
    public static TeamPlayers jKennedy = new TeamPlayers("Josh", "Kennedy", 84, wce);
    public static TeamPlayers jMcgovern = new TeamPlayers("Jeremy", "McGovern", 88, wce);

    public static TeamPlayers nFyfe = new TeamPlayers("Nathan", "Fyfe", 95, fre);
    public static TeamPlayers aPearce = new TeamPlayers("Alex", "Pearce", 80, fre);
    public static TeamPlayers mWalters = new TeamPlayers("Michael", "Walters", 88, fre);
    public static TeamPlayers sDarcy = new TeamPlayers("Sean", "Darcy", 75, fre);

    public static TeamPlayers dMartin = new TeamPlayers("Dustin", "Martin", 98, rich);
    public static TeamPlayers jRiewoldt = new TeamPlayers("Jack", "Riewoldt", 86, rich);
    public static TeamPlayers dRioli = new TeamPlayers("Daniel", "Rioli", 80, rich);
    public static TeamPlayers mChol = new TeamPlayers("Mabior", "Chol", 80, rich);

    public TeamPlayers(String firstName, String lastName, int overallStat, Team playsFor) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.overallStat = overallStat;
        this.playsFor = playsFor;

    }

    // Getters & Setters


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getOverallStat() {
        return overallStat;
    }

    public void setOverallStat(int overallStat) {
        this.overallStat = overallStat;
    }

    public Team getPlaysFor() {
        return playsFor;
    }

    public void setPlaysFor(Team playsFor) {
        this.playsFor = playsFor;
    }

}
