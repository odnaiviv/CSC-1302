/*
 * July 06, 2021
 *
 * Homework 4: Task 1 (Fraction)
 */

public class hw4_Fraction {
    //instance variables = numerator and denominator of the fraction
    private int numerator;
    private int denominator;

    //constructors
    public hw4_Fraction(int num, int denom){
        numerator = num;
        denominator = denom;
    }

    //instance methods
    //method to return numerator
    public int getNumerator() {
        return numerator;
    }
    //method to return denominator
    public int getDenominator() {
        return denominator;
    }

    //given method from prompt
    public hw4_Fraction add(hw4_Fraction f) {
        int num = numerator * f.denominator + f.numerator * denominator;
        int denom = denominator * f.denominator;
        return new hw4_Fraction(num, denom);
    }

    //constructor to set the numerator to 0 and the denominator to 1
    public hw4_Fraction() {
        numerator = 0;
        denominator = 1;
    }
    //constructor to initialize the numerator as num
    public hw4_Fraction(int num) {
        numerator = num;
        denominator = 1;
    }

    //method to divide the fraction
    public hw4_Fraction divide(hw4_Fraction f) {
        int num = numerator * f.denominator;
        int denom = denominator * f.numerator;
        return new hw4_Fraction(num, denom);
    }

    //method to scale up the fraction
    public hw4_Fraction scaleup(int factor) {
        if(factor == 0) {
            System.out.println("ERROR! Fraction cannot be scaled by zero.");
        }
        else {
            numerator *= factor;
        }
        return new hw4_Fraction(numerator, denominator);
    }

    //method to scale down the fraction
    public hw4_Fraction scaledown(int factor) {
        if(factor == 0) {
            System.out.println("ERROR! Fraction cannot be scaled by zero.");
        }
        else {
            denominator *= factor;
        }
        return new hw4_Fraction(numerator, denominator);
    }

    //method to scale up or down the fraction based on the boolean
    public hw4_Fraction scale(int factor, boolean flag) {
        if (flag) {
            return scaleup(factor);
        }
        else {
            return scaledown(factor);
        }
    }
}
