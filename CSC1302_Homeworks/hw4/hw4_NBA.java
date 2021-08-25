/*
 * Vivian Do
 * ID: 002-48-6640
 * July 06, 2021
 *
 * Homework 4: Task 2 (NBA)
 * This is the NBA class that will prompt the user to add players to each team.
 * This class also determines which team will win the overall simulated game series finished in the program.
 */
import java.util.Scanner;
public class hw4_NBA {
    public static void main(String[] args){
        //initializing the given objects/variables
        //changing the scanner from "input" to "scan"; this is my choice of preference
        Scanner scan = new Scanner(System.in);
        String ifAddPlayer;
        String playerName;

        //constructing the given Heat Team, but modified to my liking
        //I only corrected some spelling and grammar of the given source code
        System.out.println("Create the NBA team of Heats.....");
        hw4_NBATeam Heat = new hw4_NBATeam("Heats");
        System.out.println("Add a player to Heats team? (yes/no): ");
        ifAddPlayer = scan.next();
        while(ifAddPlayer.equalsIgnoreCase("yes")) {
            System.out.print("What is the name of the player to be added? ");
            playerName = scan.next();
            Heat.addAPlayer(playerName);
            System.out.print("Add another player to Heats team? (yes/no): ");
            ifAddPlayer = scan.next();
        }

        //constructing the Spurs Team
        //the code for creating the Spurs team is very similar to the code for the Heats team
        //I will attempt to explain every line on how to set up the Spurs team
        //prints the creation of the Spurs team
        System.out.println("Creating the NBA Team of Spurs ..... ");
        hw4_NBATeam Spurs = new hw4_NBATeam("Spurs");
        //prompts user to add players to the team or not
        System.out.println("Add a player to Spurs team? (yes/no): ");
        ifAddPlayer = scan.next();
        //while loop to define and add player to team if user inputs yes
        while(ifAddPlayer.equalsIgnoreCase("yes")) {
            System.out.print("What is the name of the player to be added? ");
            playerName = scan.next();
            //stores the name into the array
            Spurs.addAPlayer(playerName);
            //prompts user again to add another player onto the team
            System.out.print("Add another player to Spurs team? (yes/no): ");
            ifAddPlayer = scan.next();
            //loop will repeat until user inputs "no" to stop the loop
        }

        //simulating a series of almost 7 games
        //the Heat wins if random number is bigger than 0.5; otherwise, the Heat loses
        //game is over as soon as one team wins 4 games
        System.out.println("Game on now... ");
        //for loop to count the number of games in the series
        for (int i = 0; i < 7; i++) {
            //initializing double to generate a random number
            double randomNum = Math.random();
            //if else loop to determine which team is the winner of the game series
            if (randomNum > 0.5) {
                Heat.winAGame();
                Spurs.loseAGame();
            }
            else {
                Heat.loseAGame();
                Spurs.winAGame();
            }
        }
        //if else loop to determine which team wins the overall game series
        if (Heat.winNum() > Spurs.winNum() || Spurs.winNum() > Heat.winNum()) {
            if (Heat.winNum() > Spurs.winNum()) {
                System.out.println(Heat.teamName() + "***WIN the series***");
            }
            else {
                System.out.println(Spurs.teamName() + "***WIN the series***");
            }
        }
        //prints the score results of each team and the player on the team
        System.out.println(Heat);
        System.out.println(Spurs);
    }
}
