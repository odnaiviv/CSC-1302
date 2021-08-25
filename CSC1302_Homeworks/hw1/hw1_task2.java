/*
 * June 15, 2021
 *
 * Homework 1: Task 2 (Swap)
 */

import java.util.Scanner;

public class hw1_task2 {

    //swapDigitPairs method
    public static int swapDigitPairs(int num){
        //set temporary values of x/results and y/starting value
        int x = 0;
        int y = 1;

        while (num >= 10) {
            //last digit decreasing by 1 digit
            int n1 = num % 10;
            num = num / 10;
            //second digit
            int n2 = num % 10;
            x = x + (n1 * y * 10) + (n2 * y);
            num = num / 10;
            y = y * 100;
        }
        //when input is odd
        if (num > 0) {
            x = x + num * y;
        }
        return x;
    }

    //swapLetterPairs method
    public static String swapLetterPairs(String str){
        //set temporary characters of x/results
        String x = "";

        if (str.length() % 2 == 0) {
            //swapping string if even
            for (int i = 0; i < str.length() - 1; i = i + 2) {
                x = x + str.charAt(i + 1);
                x = x + str.charAt(i);
            }
        }
        else {
            //swapping string if odd
            for (int i = 1; i < str.length(); i = i + 2) {
                if (i <= 1)
                    x = x + str.charAt(0);
                    x = x + str.charAt(i + 1);
                    x = x + str.charAt(i);
            }
        }
        return x;
    }

    //main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //prompts user to input Panther ID
        System.out.println("Input Panther ID: ");
        String pid = scan.nextLine();
        //prints user's Panther ID
        System.out.println("Your Panther ID is: " + pid);

        //prompts user to input numbers
        System.out.print("Input a number to be swapped: ");
        int number = scan.nextInt();
        int swapNum = swapDigitPairs(number);
        System.out.println("The swapped result is: " + swapNum);

        Scanner scan2 = new Scanner(System.in);
        //prompts user to input letters/numbers
        System.out.print("Input a string of letters to be swapped: ");
        String letter = scan2.nextLine();
        String swapStr = swapLetterPairs(letter);
        System.out.println("The swapped result is: " + swapStr);
    }
}
