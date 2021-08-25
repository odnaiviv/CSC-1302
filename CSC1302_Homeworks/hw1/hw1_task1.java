/*
 * Vivian Do
 * ID: 002-48-6640
 * June 15, 2021
 *
 * Homework 1: Task 1 (ChrisTree)
 */
public class hw1_task1 {
    public static void main(String[] args) {
        //initializing the number of segments & height of tree
        //you can change the numbers in segment and height
        //changing the numbers of segment and height should not significantly change overall outcome of program
        int segment = 3;
        int height = 4;
        //initializing start of tree tops
        int rowOfLeaves = 1;
        //for loop to make the tree tops
        for (int leaf = 1; leaf <= segment; leaf++) {
            for (int i = rowOfLeaves; i <= height; i++) {
                int tree = leaf;
                while (tree < segment) {
                    System.out.print(" ");
                    tree++;
                }
                //for loop to print spaces between the stars in the tree
                for (int spaces = height - 1; spaces >= i; spaces--) {
                    System.out.print(" ");
                }
                //for loop to print stars on left side of tree
                for (int leftStars = 1; leftStars <= i; leftStars++) {
                    System.out.print("*");
                }
                //for loop to print stars on right side of tree
                for (int rightStars = 1; rightStars < i; rightStars++) {
                    System.out.print("*");
                }
                //returns to next line
                System.out.println();
            }
            //lines up the next/upcoming segments of tree tops
            rowOfLeaves += 1;
            height += 1;
        }
        //for loop to create the trunk/stem of tree
        for (int stem = 1; stem <= 2; stem++) {
            //for loop to print spaces in the trunk
            for (int spaces = 1; spaces <= (height + segment + 1) / 2; spaces++) {
                System.out.print(" ");
            }
            //for loop to print the stars/stem/trunk
            for (int stars = 1; stars <= (height/4); stars++) {
                System.out.print("*");
            }
            //returns to next line
            System.out.println();
        }
        //for loop to create the base of tree
        for (int spaces = 1; spaces <= (height + segment + 1) / 4; spaces++) {
            //prints spaces in the base
            System.out.print(" ");
        }
        //print the base of tree
        System.out.println("*******");
    }
}
