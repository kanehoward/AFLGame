package afl.kh.main.player;

import afl.kh.main.teamplayers.TeamPlayers;
import afl.kh.main.teams.Team;

import java.util.ArrayList;
import static afl.kh.main.teams.Team.*;

public class Player {

    private String name;
    private Team team;
    private int money;


    public Player(String name, int teamName) {
        this.name = name;
        if (teamName == 1) {
            this.team = wce;
        } else if (teamName == 2){
            this.team = fre;
        } else {
            this.team = rich;
        }
        this.money = 500_000;

    }

    // Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
