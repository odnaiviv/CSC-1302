/*
 * June 11, 2021
 *
 * Lab 1: Task 1
 */

public class lab1_task1 {
    //Method for calculating the sum of Arithmetic Sequence
    public static int Arithmetic_sequence(int n, int m){
        //putting the given arithmetic sequence as int S as stated in the task
        //S = n/2 * (2m + (n-1) * 2) but S is broken down into three different variables
        int a = n / 2;
        int b = (2 * m);
        int c = ((n - 1) * 2);
        int S = a * (b + c);
        return S;
        //returns int S
    }
    public static void main(String[] args){
        //Last two digits of the Panther ID
        int lastTwoDigits = 40;
        //initializing m as 2
        int m = 2 * (lastTwoDigits + 5); // m = 90
        //Initialize a temporary value to save the sum
        int sum = 0;
        //initializing when n is 30
        int n = 30;
        //For-loop to calculate sum
        for(int i = 0; i < 30; i++){
            sum = m + sum;
            m = m + 2;
        }
        //Print the result of the for-loop
        System.out.println("The result of the for-loop is: " + sum);
        //Print the result of the method
        System.out.println("The result of the method is: " + Arithmetic_sequence(n, 90));
    }
}
