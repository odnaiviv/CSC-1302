/*
 * July 14, 2021
 *
 * Lab 11: Fraction
 */
public class lab11_Fraction {
    //initializing private instance variables for numerator and denominator
    private int numerator;
    private int denominator;

    //initializing private instance variables with constructor
    public lab11_Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //method to return numerator
    public int getNumerator() {
        return numerator;
    }
    //method to return denominator
    public int getDenominator() {
        return denominator;
    }
    //method to set numerator and denominator
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}
