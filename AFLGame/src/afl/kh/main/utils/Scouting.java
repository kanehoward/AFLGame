package afl.kh.main.utils;

import afl.kh.main.teams.Team;

import static afl.kh.main.teams.Team.*;

public class Scouting {

    public void scoutTeam(Team team) {
        System.out.println("====================\nTeam Name: " + team.getTeamName());
        System.out.println("Team Overall: " + team.getOverallRating());
        System.out.println("Team List\n==============="); team.getTeamList();
    }

}
