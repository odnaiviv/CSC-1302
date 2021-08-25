/*
 * July 13, 2021
 *
 * Homework 5: Task 1 (Bank)
 */

import java.util.Scanner;
import java.util.Random;

public class hw5_Bank {
    public static void main(String[] args){
        //initializing the given objects/variables
        int numOfAccount;
        //temporary storing the balance double to 0
        double bal = 0;
        //random number generator
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        //prompting user to enter a number of accounts to create
        System.out.print("Enter the number of accounts to generate: ");
        numOfAccount = scan.nextInt();
        //checking to see if inputted number exceeds the 1000 maximum
        if (numOfAccount > 1000) {
            //error message if user exceeds the maximum
            System.out.println("ERROR! The number of accounts to generate in the bank should be less than 1000.");
        }

        //creating an array to hold the numOfAccount account objects
        hw5_PaypalAccount[] ppaccArray = new hw5_PaypalAccount[numOfAccount];
        //storing the values of numOfAccount objects in array
        for (int i = 0; i < numOfAccount; i++) {
            //creating random balance number
            bal = rand.nextDouble() * (1000.0 - 0.0) + 0.0;
            ppaccArray[i] = new hw5_PaypalAccount(i, bal);
        }

        //creating the GSU campus ID as a String by using my panther id
        String pantherID = "002-48-6640";
        //making account from first 3 numbers of panther id
        int thisAcc = Integer.parseInt(pantherID.substring(0, 3));

        //initializing total, largest, and lowest balances as doubles and temporary storing the largest & lowest account ids as 0's
        double totalBal = 0;
        double largeBal = ppaccArray[0].balance;
        double lowBal = ppaccArray[0].balance;
        int largeAcc = 0;
        int lowAcc = 0;
        //boolean to find account
        boolean accFound = false;

        //counting iterations in the array for account
        for (int i = 0; i < numOfAccount; i++) {
            //printing when account is found
            if (ppaccArray[i].accountID == thisAcc) {
                accFound = true;
                i = numOfAccount + 1;
                //prints panther id and its balance
                System.out.print("\nMy Panther ID is " + pantherID + "; my bank account ID is " + thisAcc);
                System.out.print(" and balance is: $");
                //printf to format & float results of the balance
                System.out.printf("%.1f", ppaccArray[numOfAccount - 1].balance);
                System.out.println();
            }
        }
        //printing when account is not found
        if (!accFound) {
            ppaccArray[numOfAccount - 1].accountID = thisAcc;
            ppaccArray[numOfAccount - 1].balance = Double.parseDouble(pantherID.substring(4, 6) + pantherID.substring(8, pantherID.length()))/100.0;
            //prints panther id and its balance
            System.out.print("\nMy Panther ID is " + pantherID + "; my bank account ID is " + thisAcc);
            System.out.print(" and my balance is: $");
            //printf to format & float results of the balance
            System.out.printf("%.1f", ppaccArray[numOfAccount - 1].balance);
            System.out.println();
        }

        //finding the largest and lowest account balances
        for (int i = 0; i < numOfAccount; i++) {
            //when the largest balance in the array is found; assigning largeAcc with its own account id
            if (ppaccArray[i].balance > largeBal) {
                largeBal = ppaccArray[i].balance;
                largeAcc = i;
            }
            //when the lowest balance in the array is found; assigning lowAcc with its own account id
            if (ppaccArray[i].balance < lowBal) {
                lowBal = ppaccArray[i].balance;
                lowAcc = i;
            }
            //finding the total balance of all account balances
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
