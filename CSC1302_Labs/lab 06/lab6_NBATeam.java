/*
 * June 25, 2021
 *
 * Lab 6: NBA Team
 */
public class lab6_NBATeam {
    //creating instance variables for team names, number of wins, and number of losses
    public String teamName;
    public int NumberofWin;
    public int NumberofLoss;

    //method to increase number of wins by 1
    public void winAgame() {
        NumberofWin++;
    }
    //method to increase number of losses by 1
    public void lossAgame() {
        NumberofLoss++;
    }
    //method to set team's number of wins to an integer num
    public void setWinNum(int num) {
        NumberofWin = num;
    }
    //method to return team's number of wins
    public int getWinNum() {
        return NumberofWin;
    }
    //method to print the win/loss ratio of each to using toString()
    public String toString() {
        return teamName + "\nWins: " + NumberofWin + "\nLosses: " + NumberofLoss;
    }
}