/*
 * Vivian Do
 * ID: 002-48-6640
 * June 18, 2021
 *
 * Lab 4: Task 1 (Count Digits)
 */
//importing user input Scanner class
import java.util.Scanner;
public class lab4_task1 {
    //main method
    public static void main(String[] args){
        //creating user input Scanner
        Scanner scan = new Scanner(System.in);
        //prompting user to input a number in the program
        System.out.print("Enter a number: ");
        //storing user input as an int value
        int num = scan.nextInt();
        //creating an int for calling the countDigit method
        int countingNumbers = countDigit(num);
        //printing results of countDigit method and showing the number of digits user has inputted
        System.out.println("There are " + countingNumbers + " digits in your inputted number " + num + ".");
    }
    //countDigit method to count the number of digits in a user inputted variable
    public static int countDigit(int num) {
        //initializing temporary variable to count numbers
        int counting = 0;
        //while loop to count numbers if it is not 1
        while (num != 0) {
            //divides number by 10
            num = num / 10;
            //increments counting variable each time it divides
            counting++;
        }
        //returns counting value
        return counting;
    }
}
