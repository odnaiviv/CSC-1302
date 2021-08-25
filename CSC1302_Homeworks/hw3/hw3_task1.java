/*
 * Vivian Do
 * ID: 002-48-6640
 * June 29, 2021
 *
 * Homework 3: Task 1 (Tic Tac)
 */
//importing user input scanner class
import java.util.Scanner;
public class hw3_task1 {
    //main method to play the tic tac toe game
    public static void main(String[] args){
        //creating user input scanner
        Scanner scan = new Scanner(System.in);
        //creating the game board as a 2d array
        char[][] gameBoard = new char[3][3];

        //prints a welcome message & introduces the tic tac toe game
        System.out.println("Welcome! Play a game of Tic Tac Toe!\nWe have the following 3 x 3 empty board: ");
        //for loop to add blanks and spaces between the rows and columns on the board
        //this creates a blank board
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                gameBoard[row][column] = '-';
            }
        }
        //creating player 1; this player will start the game
        char player = 'X';
        int gamePlayer = 1;
        //setting win boolean to false
        boolean win = false;

        //players will play tic tac toe until there is a winner
        while(true) {
            //initializing variables
            boolean acceptable;
            int row, column;
            //do while loop to make the game continue until there is a winner
            do {
                //sets up the game board
                setupBoard(gameBoard);
                //defines who's turn the player is & prompting player to enter in the row and index number of desired spot on the board
                System.out.println("Player " + gamePlayer + "!");
                System.out.print("Enter the row index (0, 1, 2): ");
                //stores & reads the index of the row
                row = scan.nextInt();
                System.out.print("Enter the column index (0, 1, 2): ");
                //stores and reads the index of the column
                column = scan.nextInt();
                //acceptable boolean will play & display the results
                acceptable = validPlays(row, column, gameBoard);
            }
            //while loop to determine if there is a winner yet or not
            while (acceptable == false);
                gameBoard[row][column] = player;
            win = checkWinner(player, gameBoard);
            //if there is a winner, then game ends
            if (win == true)
                break;
            //if there isn't a winner, players will switch
            if (player == 'X') {
                player = 'O';
                gamePlayer = 2;
            }
            else {
                player = 'X';
                gamePlayer = 1;
            }
        }
        //diplays the game board after every move
        setupBoard(gameBoard);

        //determining the winner
        if (win) {
            //prints out victory results of player 1/x
            if (player == 'X') {
                System.out.println("We have a winner! Congrats Player 1!");
            }
            //prints out victory results of player 2/o
            else {
                System.out.println("We have a winner! Congrats Player 2!");
            }
        }
        //prints out results if there is a draw
        else {
            System.out.println("It's a draw! Good game!");
        }
    }

    //method to check if the user inputted row and column number are entered correctly
    public static boolean validPlays (int row, int column, char[][] gameBoard) {
        //if loops to check if what the user input was valid for the rows and columns
        if (row < 0 || row > 3) {
            return false;
        }
        if (column < 0 || column > 3) {
            return false;
        }
        //if loop to fill in the spots on the game board
        if (gameBoard[row][column] != '-') {
            return false;
        }
        //else to return true if none of these conditions are true
        else {
            return true;
        }
    }
    //method to check who the winner of the game is
    public static boolean checkWinner(char player, char[][] gameBoard) {
        //checking for wins across the rows
        for (int winAcross = 0; winAcross < 3; winAcross++) {
                if (gameBoard[winAcross][0] == player &&
                    gameBoard[winAcross][1] == player &&
                    gameBoard[winAcross][2] == player) {
                return true;
            }
        }
        //checking for wins down the columns
        for (int winDown = 0; winDown < 3; winDown++) {
                if (gameBoard[0][winDown] == player &&
                    gameBoard[1][winDown] == player &&
                    gameBoard[2][winDown] == player) {
                return true;
            }
        }
        //checking for wins diagonally from top left to bottom right \
        if (gameBoard[0][0] == player &&
            gameBoard[1][1] == player &&
            gameBoard[2][2] == player) {
            return true;
        }
        //checking for wins diagonally from top right to bottom left
        if (gameBoard[2][0] == player &&
            gameBoard[1][1] == player &&
            gameBoard[0][2] == player) {
            return true;
        }
        //returns false if none of these conditions are true
        return false;
    }

    //method to create and print out the game board
    public static void setupBoard(char[][] gameBoard) {
        //prints out the top side of the board
        System.out.println("-------------");
        //for loop to divide the spaces and lines between rows and columns
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int column = 0; column < 3; column++) {
                System.out.print(gameBoard[row][column]);
                System.out.print(" | ");
            }
            //prints out lines until it reaches the bottom line of the board
            System.out.println("\n-------------");
        }
    }
}
