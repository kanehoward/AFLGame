package afl.kh.main.teams;


import afl.kh.main.teamplayers.TeamPlayers;
import afl.kh.main.venues.Venues;

import java.util.ArrayList;

import static afl.kh.main.teamplayers.TeamPlayers.*;
import static afl.kh.main.venues.Venues.*;

// Each team has 3 players
// Each team has an overall stat which is calculated by averaging the 3 players overall stats
public class Team {

    private Venues homeVenue;
    private String teamName;
    private ArrayList<TeamPlayers> teamList;
    private int wins;
    private int losses;
    private int draws;
    private int pointsOnLadder;
    private int overallRating;

    public static ArrayList<TeamPlayers> wceList = new ArrayList<>();
    public static ArrayList<TeamPlayers> freList = new ArrayList<>();
    public static ArrayList<TeamPlayers> richList = new ArrayList<>();

    public static void initTeamLists() {
        freList.add(nFyfe);
        freList.add(mWalters);
        freList.add(sDarcy);
        freList.add(aPearce);
        wceList.add(lShuey);
        wceList.add(nNaitanui);
        wceList.add(jKennedy);
        wceList.add(jMcgovern);
        richList.add(dMartin);
        richList.add(dRioli);
        richList.add(jRiewoldt);
        richList.add(mChol);
    }

    public static Team wce = new Team("West Coast Eagles", wceList, optus);
    public static Team fre = new Team("Fremantle Dockers", freList, optus);
    public static Team rich = new Team("Richmond Tigers", richList, mcg);

    public Team(String teamName, ArrayList<TeamPlayers> teamList, Venues homeVenue) {
        this.teamName = teamName;
        this.homeVenue = homeVenue;
        this.wins = 0;
        this.losses = 0;
        this.pointsOnLadder = 0;
        if (this.teamName == "West Coast Eagles") {
            this.teamList = wceList;
        } else if (this.teamName == "Richmond Tigers") {
            this.teamList = richList;
        } else if (this.teamName == "Fremantle Dockers") {
            this.teamList = freList;
        }
        this.overallRating = 0;
    }

    public int generateOverallRating() {
        int teamSize = 0;
        if (overallRating == 0) {
            for (TeamPlayers teamPlayers : teamList) {
                overallRating += teamPlayers.getOverallStat();
            }
        } else {
            return overallRating;
        }
        teamSize = teamList.size();
        overallRating = overallRating / teamSize;
        return overallRating;
    }

    // Getters & Setter
    public void getTeamList() {
        for (TeamPlayers teamPlayers : teamList) {
            System.out.println(teamPlayers.getFirstName() + " " + teamPlayers.getLastName() +
                    " " + teamPlayers.getOverallStat());
        }
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins += wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses += losses;
    }

    public int getPointsOnLadder() {
        return pointsOnLadder;
    }

    public void setPointsOnLadder(int pointsOnLadder) {
        this.pointsOnLadder += pointsOnLadder;
    }

    public int getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(int overallRating) {
        this.overallRating = overallRating;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws += draws;
    }

    public Venues getHomeVenue() {
        return homeVenue;
    }

    public void setHomeVenue(Venues homeVenue) {
        this.homeVenue = homeVenue;
    }
}