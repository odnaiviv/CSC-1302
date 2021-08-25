/*
 * June 29, 2021
 *
 * Homework 3: Task 1 (Tic Tac)
 */

import java.util.Scanner;

public class hw3_task1 {
    //main method
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //creating the game board as a 2D array
        char[][] gameBoard = new char[3][3];

        //prints welcome message & prompts user to play tic tac toe
        System.out.println("Welcome! Play a game of Tic Tac Toe!\nWe have the following 3 x 3 empty board: ");
        //adding blanks and spaces between rows and columns to create a blank board
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

        //playing tic tac toe until there's a winner
        while(true) {
            boolean acceptable;
            int row, column;
            do {
                //sets up the game board
                setupBoard(gameBoard);
                //defines who's turn the player is & prompting player to enter in the row and index number of desired spot on the board
                System.out.println("Player " + gamePlayer + "!");
                System.out.print("Enter the row index (0, 1, 2): ");
                
                row = scan.nextInt();
                System.out.print("Enter the column index (0, 1, 2): ");
                
                column = scan.nextInt();
                //acceptable boolean will play & display the results
                acceptable = validPlays(row, column, gameBoard);
            }
            //determining for winner or not
            while (acceptable == false);
                gameBoard[row][column] = player;
            win = checkWinner(player, gameBoard);
            //game ends if there's a winner
            if (win == true)
                break;
            //players will switch if there's not winner
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
            //prints victory for player 1/x
            if (player == 'X') {
                System.out.println("We have a winner! Congrats Player 1!");
            }
            //prints victory for player 2/o
            else {
                System.out.println("We have a winner! Congrats Player 2!");
            }
        }
        //prints draw for no winner/stalemate
        else {
            System.out.println("It's a draw! Good game!");
        }
    }

    //method to check if the user inputted row and column number are entered correctly
    public static boolean validPlays (int row, int column, char[][] gameBoard) {
        if (row < 0 || row > 3) {
            return false;
        }
        if (column < 0 || column > 3) {
            return false;
        }
        //filling on the game board
        if (gameBoard[row][column] != '-') {
            return false;
        }
        else {
            return true;
        }
    }
    //method to check for winner
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
        //checking for wins diagonally from top right to bottom left /
        if (gameBoard[2][0] == player &&
            gameBoard[1][1] == player &&
            gameBoard[0][2] == player) {
            return true;
        }
        //returns false if none of these conditions are true
        return false;
    }

    //method to create and print game board
    public static void setupBoard(char[][] gameBoard) {
        //prints top side of game board
        System.out.println("-------------");
        //dividing spaces and lines between rows and columns
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int column = 0; column < 3; column++) {
                System.out.print(gameBoard[row][column]);
                System.out.print(" | ");
            }
            //prints lines until bottom of board has been reached
            System.out.println("\n-------------");
        }
    }
}
