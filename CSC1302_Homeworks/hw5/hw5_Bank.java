/*
 * Vivian Do
 * ID: 002-48-6640
 * July 13, 2021
 *
 * Homework 5: Task 1 (Bank)
 * This is the Bank class that initializes the given objects and variables. It's usually the main program that basically does everything.
 * This program prompts user to enter number of accounts, hold the number of accounts in an array, does the math and calculations of the total,
 * highest, and lowest balances through loops, and prints out the end results of the overall program formatted to float by 1 decimal place.
 */
//importing scanner user input and random classes
import java.util.Scanner;
import java.util.Random;
public class hw5_Bank {
    public static void main(String[] args){
        //initializing the given objects and variables
        //number of accounts
        int numOfAccount;
        //temporary storing the balance double at 0
        double bal = 0;
        //random number generator
        Random rand = new Random();
        //user input scanner
        Scanner scan = new Scanner(System.in);

        //prompting user to enter a number of accounts to create
        System.out.print("Enter the number of accounts to generate: ");
        numOfAccount = scan.nextInt();
        //if loop to check for if the inputted number exceeds the 1000 maximum
        if (numOfAccount > 1000) {
            //tells the user an error if number of account is greater than 1000
            System.out.println("ERROR! The number of accounts to generate in the bank should be less than 1000.");
        }

        //creating an array to hold the numOfAccount account objects
        hw5_PaypalAccount[] ppaccArray = new hw5_PaypalAccount[numOfAccount];
        //for loop to store the values of numOfAccount objects in the array
        for (int i = 0; i < numOfAccount; i++) {
            //creating the random balance number
            bal = rand.nextDouble() * (1000.0 - 0.0) + 0.0;
            ppaccArray[i] = new hw5_PaypalAccount(i, bal);
        }

        //creating the GSU campus ID as a String by using my panther id
        String pantherID = "002-48-6640";
        //initializing account from first 3 numbers of panther id
        int thisAcc = Integer.parseInt(pantherID.substring(0, 3));

        //initializing total, largest, and lowest balances as doubles and temporary storing the largest and lowest account ids as 0's
        double totalBal = 0;
        double largeBal = ppaccArray[0].balance;
        double lowBal = ppaccArray[0].balance;
        int largeAcc = 0;
        int lowAcc = 0;
        //creating a boolean to find account
        boolean accFound = false;

        //for loop to count the iterations in the array for the account
        for (int i = 0; i < numOfAccount; i++) {
            //if statement to print when account has been found
            if (ppaccArray[i].accountID == thisAcc) {
                accFound = true;
                i = numOfAccount + 1;
                //prints panther id and its balance
                System.out.print("\nMy Panther ID is " + pantherID + "; my bank account ID is " + thisAcc);
                System.out.print(" and balance is: $");
                //printf to format and float the results of the balance
                System.out.printf("%.1f", ppaccArray[numOfAccount - 1].balance);
                System.out.println();
            }
        }
        //if statement to print when account has not been found
        if (!accFound) {
            ppaccArray[numOfAccount - 1].accountID = thisAcc;
            ppaccArray[numOfAccount - 1].balance = Double.parseDouble(pantherID.substring(4, 6) + pantherID.substring(8, pantherID.length()))/100.0;
            //prints panther id and its balance
            System.out.print("\nMy Panther ID is " + pantherID + "; my bank account ID is " + thisAcc);
            System.out.print(" and my balance is: $");
            //printf to format and float the results of the balance
            System.out.printf("%.1f", ppaccArray[numOfAccount - 1].balance);
            System.out.println();
        }

        //for loop to find the largest and lowest account balances
        for (int i = 0; i < numOfAccount; i++) {
            //if statement to find the largest balance in the array and assigns largeAcc its own account id
            if (ppaccArray[i].balance > largeBal) {
                largeBal = ppaccArray[i].balance;
                largeAcc = i;
            }
            //if statement to find the lowest balance in the array and assigns lowAcc its own account id
            if (ppaccArray[i].balance < lowBal) {
                lowBal = ppaccArray[i].balance;
                lowAcc = i;
            }
            //finding the total balance of all the account balances
            totalBal = totalBal + ppaccArray[i].balance;
        }
        //calculating the average balance
        double mean = (totalBal / numOfAccount);

        //printing results of the average balance
        System.out.print("\nThe average balance is: $");
        System.out.printf("%.1f", mean);
        //space to separate the balance results
        System.out.println();
        //print results of the largest balance
        System.out.print("\nThe account with the largest balance: accountID = " + ppaccArray[largeAcc].accountID);
        System.out.printf(", balance = %.1f", ppaccArray[largeAcc].balance);
        System.out.println();
        //printing results of the lowest balance
        System.out.print("\nThe account with the lowest balance: accountID = " + ppaccArray[lowAcc].accountID);
        System.out.printf(", balance = %.1f", ppaccArray[lowAcc].balance);
        System.out.println();
    }
}
