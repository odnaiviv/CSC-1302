/*
 * Vivian Do
 * ID: 002-48-6640
 * July 06, 2021
 *
 * Homework 4: Task 1 (Fraction Scale)
 * This is the FractionScale class that will prompt the user to input a fraction.
 * The fraction that the user inputted will then be broken down and converted into an integer.
 * This class will also prompt the user to scale the fraction by the user's desired factor.
 */
//importing user input scanner class
import java.util.Scanner;
public class hw4_FractionScale {

    public static void main(String[] args) {
        //creating user input Scanner
        Scanner scan = new Scanner(System.in);
        //prints the beginning of program
        System.out.println("This program performs the scaling operations on a fraction.");

        //prompts user to input a fraction
        System.out.print("Enter a fraction: ");
        String fraction = scan.nextLine();

        //creating the fraction using String
        //initializing the slash / as an int
        int slash = fraction.indexOf("/");

        //storing the numerator as the first number before the slash
        String numerator = fraction.substring(0, slash).trim();
        //storing the denominator as the second number after the slash
        String denominator = fraction.substring(slash + 1).trim();

        //converting the numerator and denominator String into int
        int num = Integer.parseInt(numerator);
        int denom = Integer.parseInt(denominator);

        //creating the fraction
        hw4_Fraction frac = new hw4_Fraction(num, denom);

        //prompting user to scale up or down
        System.out.print("Scale up or down (1: up, 0: down): ");
        //initializing scale as an int from the user input
        int scale = scan.nextInt();
        //while loop to check if the number entered was legal or not
        while (scale != 1 && scale != 0) {
            //if number was illegal, program will then prompt user to try again
            System.out.println("ERROR! The number you entered was not 0 or 1.");
            System.out.print("Scale up or down (1: up, 0: down): ");
            scale = scan.nextInt();
        }

        //prompting user to enter a scaling factor number
        System.out.print("Enter a scale factor: ");
        //initializing factor as the scaling factor from the user input
        int factor = scan.nextInt();

        //calling method to scale the factor
        frac.scale(factor, scale ==1);
        //printing results
        System.out.println("Scaled fraction is: " + frac.getNumerator() + "/" + frac.getDenominator());
    }
}
