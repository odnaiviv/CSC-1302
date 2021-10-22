/*
 * July 14, 2021
 *
 * Lab 11: Multiply Client
 */
//importing random number generator
import java.util.Random;
public class lab11_MultiplyClient {
    public static void main(String[] args){
        //initializing the random number generator
        Random rand = new Random();
        //creating Fraction array to store the elements inside
        //last digit of my panther id + 3 = 0 + 3
        lab11_Fraction[] fracArray = new lab11_Fraction[0 + 3];

        //loop to initialize the fraction array
        for (int i = 0; i < fracArray.length; i++) {
            int num = rand.nextInt(10) + 1;
            int denom = rand.nextInt(10) + 1;
            fracArray[i] = new lab11_Fraction(num, denom);
        }
        //loop to apply the fraction multiply method
        for (int i = 0; i < fracArray.length - 1; i++) {
            //calling FractionMultiply method and returning the product
            lab11_Fraction product = FractionMultiply(fracArray[i], fracArray[i + 1]);
            //printing product results in console
            System.out.println(product.getNumerator() + "/" + product.getDenominator());
        }
    }
    //method to multiply and return results as a fraction
    public static lab11_Fraction FractionMultiply(lab11_Fraction example1, lab11_Fraction example2) {
        return new lab11_Fraction(example1.getNumerator() * example2.getNumerator(), example1.getDenominator() * example2.getDenominator());
    }
}
