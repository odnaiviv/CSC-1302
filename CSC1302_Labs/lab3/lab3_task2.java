/*
 * Vivian Do
 * ID: 002-48-6640
 * June 16, 2021
 *
 * Lab 3: Task 2
 */
//import user input scanner class
import java.util.Scanner;
public class lab3_task2 {
    public static void main(String[] args){
        //creating user input scanner
        Scanner scan = new Scanner(System.in);
        //initializing temporary values for sum and count of inputted numbers
        double num = 0;
        double sum = 0;
        double count = 0;
        double mean;

        //prompting user to input numbers
        System.out.println("Input set of numbers (hit 'enter' to separate each number): ");
        num = scan.nextDouble();
        //while loop to check if inputted value is either positive or negative
        //if the input is negative, it will skip this loop
        while (num >= 0) {
            //loop will read values
            count++;
            sum = sum + num;

            //user input of next number will be available if first inputted number was positive
            num = scan.nextDouble();
        }
        //calculating average/mean of inputted numbers
        mean = sum / count;
        //printing the average mean results if overall input was correct
        System.out.println("The average is: " + mean);
    }
}
