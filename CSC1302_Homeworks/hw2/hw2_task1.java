/*
 * June 22, 2021
 *
 * Homework 2: Task 1 (Income Tax)
 */

import java.util.Scanner;
import java.util.Random;

public class hw2_task1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random num = new Random();
        //the number of residents in the range of 1 - 15
        int randomResidents = num.nextInt(14) + 1;
        //storing the maximum value of taxes
        double max = Integer.MIN_VALUE;
        //storing the person/resident with the highest tax value
        int maxResident = 1;

        for (int i = 1; i < randomResidents; i++) {
            //prints resident # and prompts user to input income
            System.out.println("Resident " + i + ", please enter your income: ");
            double income = scan.nextDouble();
            double taxes;

            //calculating tax
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
            //finding resident with highest tax value
            if (taxes > max) {
                maxResident = i;
                max = taxes;
            }
        }
        //prints resident with highest tax value
        System.out.println("Resident " + maxResident + " has the highest tax value.");
    }
}
