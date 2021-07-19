package afl.kh.main.matches;

import afl.kh.main.teams.Team;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import static afl.kh.main.teamplayers.TeamPlayers.*;
import static afl.kh.main.teams.Team.*;

/* TO BE WORKED ON IN FUTURE */
public class Fixture {

    private Team t1, t2, t3;
    private boolean hasPlayedOther;
    private ArrayList<Team> fixtureList = new ArrayList<>();
    private ArrayList<Team> matchList = new ArrayList<>();
    private Array[][][] fixtureOfGames = new Array[25][1][1];
    private int roundNumber = 1;

    public void initFixtureList() {
        fixtureList.add(wce);
        fixtureList.add(fre);
        fixtureList.add(rich);
    }

    public void generateFixture() {

        int chooseTeam1 = 0; // Always centered on the team in index 0
        int chooseTeam2 = (int) ((Math.random() * fixtureList.size()));
        while (chooseTeam2 == chooseTeam1) {
            chooseTeam2 = (int) (Math.random() * fixtureList.size());
            if (chooseTeam2 == chooseTeam1) {
            } else {
                // This means team 1 and team 2 are different
                Team t1 = fixtureList.get(chooseTeam1); // wce e.g
                matchList.add(t1);
                Team t2 = fixtureList.get(chooseTeam2); // fre e.g


            }
        }
    }

    public void setFixture() {
    }

    /*
    Need to create a method that can be called e.g
    Round 1 = wce, fre
    Round 2 = rich, wce
    Round 3 = fre, wce
    Round 4 = wce, rich

    e.g Fixture(1)
    team1 = user.getTeam()
    team2 = fre.getTeam()

    Fixture(2)
    team1 = rich.getTeam()
    team2 = user.getTeam()

    This then passes into the match
     */
}
