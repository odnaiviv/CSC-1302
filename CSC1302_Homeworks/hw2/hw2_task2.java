/*
 * June 22, 2021
 *
 * Homework 2: Task 2 (Repeated Digits)
 */

import java.util.Scanner;
public class hw2_task2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        //loop to check for user inputted 0s
        //if 0 is entered, program ends; else, program will continue until 0 is entered
        while (num > 0) {
            int occurrences[] = new int[10];
            //calling method to count number of occurrences
            countingOccurrences(num, occurrences);
            //re-prompting user to enter number again
            System.out.print("\nEnter a number: ");
            num = scan.nextInt();
        }
    }
    //method to count the number of digits and occurrences from user inputted number
    public static void countingOccurrences (int num, int occurrences[]) {
        //temporary value
        int digits = 0;
        while (num > 0) {
            //finding digit in array
            digits = num % 10;
            //increasing the count of digits in array & dividing number by 10
            occurrences[digits] += 1;
            num /= 10;
        }
        //printing the digits from 0-9
        System.out.print("Digits: \t\t");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        //printing the number of occurrences
        System.out.print("\nOccurrences: \t");
        //counting number of occurrences
        for (int i = 0; i < 10; i++) {
            System.out.print(occurrences[i] + " ");
        }
        System.out.println();
    }
}
