/*
 * June 23, 2021
 *
 * Lab 5
 */
//importing user input Scanner class
import java.util.Scanner;

public class lab5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //initializing elements as a variable
        int elements;
        //prompting user to enter the number of elements in an array
        System.out.println("Enter an array of integers \nHow many elements: ");
        elements = scan.nextInt();
        //creating the array to store the elements in
        int array[] = new int[elements];
        //prompting user to enter in the elements in the array
        System.out.println("What are the elements: ");
        //counting and inputting elements in the array
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        //calling the minGap method
        System.out.println(minGap(array));
    }

    //method to calculate the difference of numbers/elements in the inputted array
    public static int minGap(int array[]) {
        //initializing temporary variables for the minimum and the difference
        int minimum = 0;
        int difference = 0;
        //checking for the minimum if length of array is less than 2
        if (array.length < 2) {
            minimum = 0;
        }
        //calculating between the number/elements
        else {
            //subtracting the second element with the first element
            minimum = array[1] - array[0];
            //calculating the difference
            for (int i = 2; i < array.length - 1; i++) {
                difference = array[i + 1] - array[i];
                if (difference < minimum) {
                    minimum = difference;
                }
            }
        }
        //returns the minimum difference
        return minimum;
    }
}