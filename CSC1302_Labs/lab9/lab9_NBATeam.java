/*
 * Vivian Do
 * ID: 002-48-6640
 * July 07, 2021
 *
 * Lab 9: NBA Team
 * This is the NBATeam class that will initialize the names, number of wins and losses for the teams. This class
 * will also tally and update the number of wins and losses each team will have. The end results of this class will
 * print out the results (number of wins and losses) of the team.
 */
public class lab9_NBATeam {
    //initializing private fields
    private String teamName;
    private int NumberofWin;
    private int NumberofLoss;

    //initializing the private fields with a constructor
    public lab9_NBATeam(String s, int w, int l) {
        //initializing teamName as a string, and number of wins and losses as ints
        this.teamName = s;
        this.NumberofWin = w;
        this.NumberofLoss = l;
    }

    //method to increment and return the number of wins
    public int winAgame() {
        return this.NumberofWin++;
    }
    //method to increment and return the number of losses
    public int lossAgame() {
        return this.NumberofLoss++;
    }

    //method to increment the number of wins the first team has
    //also increments the number of losses the second team has
    public void winAgame(lab9_NBATeam teamB) {
        this.winAgame();
        teamB.lossAgame();
    }
    //method to increment the number of losses the first team has
    //also increments the number of wins the second team has
    public void lossAgame(lab9_NBATeam teamB) {
        this.lossAgame();
        teamB.winAgame();
    }

    //method to convert and print everything into the toString method
    public String toString() {
        return "The " + this.teamName + "\nNumber of Wins = " + this.NumberofWin + "\nNumber of Losses = " + this.NumberofLoss;
    }
}
