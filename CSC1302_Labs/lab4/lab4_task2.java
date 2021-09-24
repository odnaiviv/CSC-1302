/*
 * Vivian Do
 * ID: 002-48-6640
 * June 18, 2021
 *
 * Lab 4: Task 2
 */
//importing user input Scanner class
import java.util.Scanner;
public class lab4_task2 {
    //main method
    public static void main(String[] args){
        //creating user input Scanner
        Scanner scan = new Scanner(System.in);
        //prompting user to input their name in
        System.out.print("Enter your name: ");
        //storing user input as a string
        String name = scan.nextLine();

        //printing out the user input of their name
        System.out.println("Your name is " + name + ".");
        //printing out the results
        //results = what their name is and length of the string "name" (or how many characters the inputted string has)
        System.out.println("The string length of '" + name + "' is: " + name.length());
    }
}
