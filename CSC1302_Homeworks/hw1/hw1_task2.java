/*
 * Vivian Do
 * ID: 002-48-6640
 * June 15, 2021
 *
 * Homework 1: Task 2 (Swap)
 */

//importing user input scanner class
import java.util.Scanner;
public class hw1_task2 {

    //swapDigitPairs method
    public static int swapDigitPairs(int num){
        //set temporary values of x and y
        //x = results, y = starting value
        int x = 0;
        int y = 1;
        //while loop to swap the numbers
        while (num >= 10) {
            //last digit
            int n1 = num % 10;
            //decreases by 1 digit
            num = num / 10;
            //second digit
            int n2 = num % 10;
            x = x + (n1 * y * 10) + (n2 * y);
            num = num / 10;
            y = y * 100;
        }
        //if loop to keep first digit unchanged when input number is odd
        if (num > 0) {
            x = x + num * y;
        }
        //returns overall results of loop
        return x;
    }

    //swapLetterPairs method
    public static String swapLetterPairs(String str){
        //set temporary characters of x
        //x = results
        String x = "";
        //if-else loop to determine if length of string is odd or even by dividing by 2
        if (str.length() % 2 == 0) {
            //for loop for swapping even string
            for (int i = 0; i < str.length() - 1; i = i + 2) {
                x = x + str.charAt(i + 1);
                x = x + str.charAt(i);
            }
        }
        else {
            //for loop for swapping odd string
            for (int i = 1; i < str.length(); i = i + 2) {
                if (i <= 1)
                    x = x + str.charAt(0);
                    x = x + str.charAt(i + 1);
                    x = x + str.charAt(i);
            }
        }
        //returns overall results of loop
        return x;
    }

    //main method
    public static void main(String[] args) {
        //creating user input Scanner
        Scanner scan = new Scanner(System.in);
        //prompts user to input Panther ID
        System.out.println("Input Panther ID: ");
        String pid = scan.nextLine();
        //prints out user's Panther ID
        System.out.println("Your Panther ID is: " + pid);

        //prompts user to input numbers
        System.out.print("Input a number to be swapped: ");
        int number = scan.nextInt();
        //puts user input number in swapDigitPairs method
        int swapNum = swapDigitPairs(number);
        //prints results of method
        System.out.println("The swapped result is: " + swapNum);

        //creating new user input for this particular String
        Scanner scan2 = new Scanner(System.in);
        //prompts user to input letters/numbers
        System.out.print("Input a string of letters to be swapped: ");
        String letter = scan2.nextLine();
        //puts uer input letter in swapLetterPairs method
        String swapStr = swapLetterPairs(letter);
        //prints results of method
        System.out.println("The swapped result is: " + swapStr);
    }
}
