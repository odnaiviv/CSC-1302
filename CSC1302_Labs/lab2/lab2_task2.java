/*
 * June 11, 2021
 *
 * Lab 2: Task 2 (BMI)
 */
import java.util.Scanner;

public class lab2_task2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //user inputs name
        System.out.println("Input Name: ");
        String name = scan.nextLine();
        //user inputs panther id
        System.out.println("Input Panther ID: ");
        String pid = scan.nextLine();

        //user inputs weight
        System.out.println("Input your weight in kg: ");
        boolean validInput = scan.hasNextDouble();
        double weight;
        String weight2 = "test";
        //when user inputs correctly
        if (validInput == true) {
            weight = scan.nextDouble();
        }
        //if user inputs incorrectly, else part will prompt instead & gives user one more chance to input correctly
        else {
            System.out.println("Input was not a double. Try again.\nInput your weight in kg: ");
            weight2 = scan.nextLine();
            boolean validInput2 = scan.hasNextDouble();
            if (validInput2 == true) {
                weight = scan.nextDouble();
                //when user prompts correctly
            }
            //if user inputs incorrectly again, program ends
            else {
                System.out.print("\nToo many errors! Try again later.");
                return;
            }
        }
        //user inputs height
        System.out.println("Input your height in m: ");
        boolean validInput3 = scan.hasNextDouble();
        double height;
        String height2 = "test";
        if (validInput3 == true) {
            height = scan.nextDouble();
            //when user inputs correctly
        }
        //if user inputs incorrectly, else part will prompt instead & gives user one more chance to input correctly
        else {
            System.out.println("Input was not a double. Try again.\nInput your height in m: ");
            height2 = scan.nextLine();
            height2 = scan.nextLine();
            boolean validInput4 = scan.hasNextDouble();
            if (validInput4 == true) {
                height = scan.nextDouble();
                //when user prompts correctly
            }
            //if user inputs incorrectly again, program ends
            else {
                System.out.print("\nToo many errors! Try again later.");
                return;
            }
        }

        //printing name and panther id
        System.out.println(name + ", your Panther ID is " + pid + ".");

        //equation to calculate bmi
        double bmi = weight/(height * height);
        //if-else to print user's bmi and weight class
        if (bmi <= 18.5) {
            //prints user's bmi & underweight weight class
            System.out.println("Your BMI is " + bmi + " and you are underweight.");
        }
        else if (bmi > 18.5 && bmi < 24.9){
            //prints user's bmi and normal weight class
            System.out.println("Your BMI is " + bmi + " and you are normal.");
        }
        else if (bmi > 25.0 && bmi < 29.9) {
            //prints user's bmi and overweight weight class
            System.out.println("Your BMI is " + bmi + " and you are overweight.");
        }
        else if (bmi > 30.0) {
            //prints user's bmi and obese weight class
            System.out.println("Your BMI is " + bmi + " and you are obese.");
        }
    }
}
