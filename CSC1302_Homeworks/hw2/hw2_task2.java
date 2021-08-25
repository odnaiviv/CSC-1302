/*
 * Vivian Do
 * ID: 002-48-6640
 * June 22, 2021
 *
 * Homework 2: Task 2 (Repeated Digits)
 */
//importing user input scanner and random number generator
import java.util.Scanner;
public class hw2_task2 {
    public static void main(String[] args){
        //creating user input scanner
        Scanner scan = new Scanner(System.in);
        //prompting user to enter number

        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        //while loop to check for 0s in the input
        //if the user has entered in a 0, program will end
        //if not, the program will continue forever until user will input a 0
        while (num > 0) {
            //initializing new variable as an array to store temporary values
            int occurrences[] = new int[10];
            //calling the method to count the number of occurances
            countingOccurrences(num, occurrences);
            //re-prompting user to enter number again
            System.out.print("\nEnter a number: ");
            num = scan.nextInt();
        }
    }
    //method to count the number of digits and occurrences from the user inputted number
    public static void countingOccurrences (int num, int occurrences[]) {
        //initializing temporary value as a digit
        int digits = 0;
        //while loop to count the number of digits and occurrences in the digits
        while (num > 0) {
            //finding the digit in the array
            digits = num % 10;
            //increasing the count of the digits in the array
            occurrences[digits] += 1;
            //dividing the number by 10
            num /= 10;
        }
        //printing the digits from 0-9
        System.out.print("Digits: \t\t");
        //for loop to print the numbers from 0 to 10
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        //printing the number of occurrences from the inputted number
        System.out.print("\nOccurrences: \t");
        //for loop to count the number of occurrence of the digits in the number
        for (int i = 0; i < 10; i++) {
            System.out.print(occurrences[i] + " ");
        }
        //prints to the next line
        System.out.println();
    }
}
