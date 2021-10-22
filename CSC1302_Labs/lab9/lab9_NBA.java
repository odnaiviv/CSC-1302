/*
 * Vivian Do
 * ID: 002-48-6640
 * July 07, 2021
 *
 * Lab 9: NBA
 * This is the NBA class that will set up the teams. This class will also simulate a series of games
 * the teams will be playing against each other. With a random number generate, this program will determine
 * who wins and losses the game. The results of the program will be called via the NBATeam program.
 */
public class lab9_NBA {
    public static void main(String[] args) {
        //initializing both teams with their names, number of wins and losses
        //since we are at the beginning of the program, both teams start off with 0 wins and 0 losses
        lab9_NBATeam Heat = new lab9_NBATeam("Heat", 0, 0);
        lab9_NBATeam Spurs = new lab9_NBATeam("Spurs", 0, 0);

        //initializing a double to store the value of the random number
        double randomNum;
        //for loop to randomly generate a number
        for (int i = 0; i < 3; i++) {
            //random number generator
            randomNum = Math.random();
            //if loop to determine if randomly generated number is bigger than 0.5
            if (randomNum > 0.5) {
                //calling method to update the heat wins and losses over spurs
                Heat.winAgame(Spurs);
            }
            //else to call method, updating the spurs wins and losses over heat
            else {
                Heat.lossAgame(Spurs);
            }
        }
        //printing the results of both teams by calling toString method
        System.out.println(Heat.toString());
        System.out.println();   //line to separate the two results
        System.out.println(Spurs.toString());
    }
}
