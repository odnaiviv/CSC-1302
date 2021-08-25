/*
 * Vivian Do
 * ID: 002-48-6640
 * June 22, 2021
 *
 * Homework 2: Task 1 (Income Tax)
 */
//importing user input scanner and random number generator
import java.util.Scanner;
import java.util.Random;

public class hw2_task1 {
    public static void main(String[] args){
        //creating user input scanner and random number generator
        Scanner scan = new Scanner(System.in);
        Random num = new Random();
        //initializing the random number generator to pick
        //the number of residents in the range of 1 - 15
        int randomResidents = num.nextInt(14) + 1;
        //storing the maximum value of taxes
        double max = Integer.MIN_VALUE;
        //storing the person/resident with the highest tax value
        int maxResident = 1;

        //for loop that prompts user to enter the amount of income for each person/resident
        //for loop also calculates the taxes from the given Table in the problem
        for (int i = 1; i < randomResidents; i++) {
            //prints number of person/resident and prompts user to input income
            System.out.println("Resident " + i + ", please enter your income: ");
            double income = scan.nextDouble();
            //initializing variable
            double taxes;

            //series of if-else statement loops to calculate the tax
            if (income <= 750) {
                taxes = income * 0.01;
            }
            else if (income <= 2500) {
                taxes = 7.5 + ((income - 750) * 0.02);
            }
            else if (income <= 5000) {
                taxes = 82.5 + ((income - 2500) * 0.04);
            }
            else if (income <= 8000) {
                taxes = 142.50 + ((income - 5000) * 0.05);
            }
            else {
                taxes = 230.00 + ((income - 8000) * 0.06);
            }
            //prints the amount of taxes each resident dues
            System.out.println("Amount of Tax Due for Resident " + i + ": $" + taxes);
            //if statement to find the person with the highest tax value
            if (taxes > max) {
                maxResident = i;
                max = taxes;
            }
        }
        //prints the resident with the highest tax value
        System.out.println("Resident " + maxResident + " has the highest tax value.");
    }
}
