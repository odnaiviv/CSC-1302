/*
 * July 06, 2021
 *
 * Homework 4: Task 1 (Fraction Scale)
 */

import java.util.Scanner;

public class hw4_FractionScale {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("This program performs the scaling operations on a fraction.");
        //prompts user to input fraction
        System.out.print("Enter a fraction: ");
        String fraction = scan.nextLine();

        //creating the fraction using String & using slash / as an int
        int slash = fraction.indexOf("/");

        //storing the numerator as the first number before slash
        String numerator = fraction.substring(0, slash).trim();
        //storing the denominator as the second number after slash
        String denominator = fraction.substring(slash + 1).trim();

        //converting numerator & denominator String into int
        int num = Integer.parseInt(numerator);
        int denom = Integer.parseInt(denominator);

        //creating the fraction
        hw4_Fraction frac = new hw4_Fraction(num, denom);

        //prompting user to scale up or down
        System.out.print("Scale up or down (1: up, 0: down): ");
        //initializing scale as an int from user input
        int scale = scan.nextInt();
        //checking to see if input was legal or not
        while (scale != 1 && scale != 0) {
            //prompting user to enter in a different number if number was illegal
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
