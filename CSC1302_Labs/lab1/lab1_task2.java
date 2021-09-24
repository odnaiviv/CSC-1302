/*
 * Vivian Do
 * ID: 002-48-6640
 * June 11, 2021
 *
 * Lab 1: Task 2
 */

public class lab1_task2 {
    //The method to draw the first and last side
    public static void LFside(int n){
        //for loop to print the top and bottom side of the square
        for (int i = 1; i <= n; i++) {
            System.out.print("x");
        }
    }
    //The method to draw the intermediate side
    public static void Mside(int n){
        //prints the left side of the square
        System.out.print("\nx");
        //for loop to print the inside of the square
        for (int i = 1; i <= n - 2; i++) {
            if (i == 0 || i == n) {
                System.out.print("x");
            }
            else {
                System.out.print("a");
            }
        }
        //prints the right side of the square
        System.out.print("x");
    }
    //The method to calculate the area of the square
    public static void Area(int n){
        //initializes the equation for the area of the square
        int area = (n * n);
        //prints area results in next line
        System.out.println("\nThe area of this square is: " + area);
    }
    //printing out the square
    public static void main(String[] args){
        //Initialize the value of n
        int n = 1 + 5; //n = 45
        //Draw the first side
        LFside(n); //calls LFside method
        //Draw intermediate sides
        for (int i = 1; i <= n - 2; i++) {
            Mside(n); //calls Mside method
        }
        //Draw last side
        System.out.println();
        LFside(n); //calls LFside method again
        //Calculate and print the area of the square
        Area(n);
    }
}
