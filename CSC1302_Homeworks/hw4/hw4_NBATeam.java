/*
 * July 06, 2021
 *
 * Homework 4: Task 2 (NBA Team)
 */

import java.util.Arrays;
public class hw4_NBATeam {
    //initializing the given private Strings, ints, and array
    private String sTeamName;
    private int nWin;
    private int nLoss;
    private String[] playerArray = new String[1];
    //initializing additional private objects

    private int counting = 0;
    //array to temporary store values in String
    private String[] tempArray = new String[1];

    //constructor to make & store the teams
    public hw4_NBATeam(String name) {
        sTeamName = name;
    }

    //instance method to return team name
    public String teamName() {
        return sTeamName;
    }

    //method to add team players onto the team
    public void addAPlayer(String playerName) {
        counting++;
        //if the number of players in the array is one, then this loops will run
        if (counting == 1) {
            playerArray[counting - 1] = playerName;
            //loop to temporary swap the number of players in array
            for (int i = 1; i < playerArray.length; i++) {
                tempArray[i] = playerArray[i];
            }
        }
        //if the number of players in the array is not one, then this loop will run
        else {
            playerArray = new String[counting];
            //counting number of elements in array; this swaps the player array with the temporary array
            for (int i = 0; i < tempArray.length; i++) {
                playerArray[i] = tempArray[i];
            }
            playerArray[counting - 1] = playerName;
            tempArray = new String[counting];
            //swapping the temporary array back with the player array
            for (int i = 0; i < playerArray.length; i++) {
                tempArray[i] = playerArray[i];
            }
        }
    }

    //method to add up the wins
    public void winAGame() {
        nWin++;
    }
    //method to return the number of wins
    public int winNum() {
        return nWin;
    }
    //method to add up the losses
    public void loseAGame() {
        nLoss++;
    }

    //method to print results of program into a String
    public String toString() {
        //returns & converts into String
        return sTeamName + " " + Arrays.toString(tempArray) + " Win #: " + nWin + " | Lose #: " + nLoss;
    }
}
