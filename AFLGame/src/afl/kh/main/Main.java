package afl.kh.main;

import afl.kh.main.matches.Match;
import afl.kh.main.player.Player;
import afl.kh.main.teamplayers.TeamPlayers;
import afl.kh.main.teams.Team;
import afl.kh.main.utils.Scouting;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import static afl.kh.main.teams.Team.*;

public class Main {

    public static void main(String[] args) {

        Team.initTeamLists();
        fre.generateOverallRating();
        rich.generateOverallRating();
        wce.generateOverallRating();

        System.out.println("Welcome to AFL Manager 2021");
        System.out.println("Choose your team");
        System.out.println("1) West Coast \n2) Fremantle \n3) Richmond");
        System.out.println("-> ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        Player user = new Player("Kane Howard", option);

        commandCentre(user);

    }

    public static void commandCentre(Player user) {
        System.out.println("====================\nTeam Name: " + user.getTeam().getTeamName());
        System.out.println("Team Overall: " + user.getTeam().getOverallRating());
        System.out.println("Wins: " + user.getTeam().getWins());
        System.out.println("Losses: " + user.getTeam().getLosses());
        System.out.println("Draws: " + user.getTeam().getDraws());
        System.out.println("Points: " + user.getTeam().getPointsOnLadder());
        System.out.println("========================\n1) Play Match");
        System.out.println("2) Show Team List");
        System.out.println("3) Scout Teams");
        System.out.println("4) Simulate Week");
        System.out.println("5) Ladder");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if (option == 1) {
            Match match = new Match();
            match.simulateGame(user, user.getTeam(), rich);
        } else if (option == 2) {
            System.out.println("Team List\n==============="); user.getTeam().getTeamList();
            commandCentre(user);
        } else if (option == 3) {
            Scouting scout = new Scouting();
            System.out.println("1) West Coast Eagles\n2) Richmond Tigers" +
                    "\n3) Fremantle Dockers");
            Scanner sc1 = new Scanner(System.in);
            int option1 = sc1.nextInt();
            if (option1 == 1) {
                scout.scoutTeam(wce);
            } else if (option1 == 2) {
                scout.scoutTeam(rich);
            } else if (option1 == 3) {
                scout.scoutTeam(fre);
            }
            commandCentre(user);
        }
    }
}