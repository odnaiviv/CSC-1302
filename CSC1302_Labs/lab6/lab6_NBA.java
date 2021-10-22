/*
 * Vivian Do
 * ID: 002-48-6640
 * June 25, 2021
 *
 * Lab 6: NBA
 */
//importing random number generator
import java.util.Random;
public class lab6_NBA {
    public static void main(String[] args) {
        //creating the random number generator to generate random numbers
        Random rand = new Random();
        //creating the Miami Heat team
        lab6_NBATeam theHeat = new lab6_NBATeam();
        theHeat.teamName = "Miami Heat";
        //creating the los angeles lakers team
        lab6_NBATeam theLakers = new lab6_NBATeam();
        theLakers.teamName = "Los Angeles Lakers";

        //setting the win conditions of both teams from 1 - 82
        theHeat.setWinNum(rand.nextInt((82) + 1));
        theLakers.setWinNum(rand.nextInt((82) + 1));

        //for loop to do the steps inside three times
        for (int i = 1; i <= 3; i++) {
            //storing the number as a double
            double randomNumber = rand.nextDouble();
            //if random number is greater than 0.5, then the miami heat wins
            if (randomNumber > 0.5) {
                theHeat.winAgame();
            }
            //else, the la lakers win
            else {
                theLakers.winAgame();
            }
        }
        //printing the results of both teams
        System.out.println(theHeat);
        System.out.println(); //line to separate the two results
        System.out.println(theLakers);
    }
}
