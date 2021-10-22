/*
 * June 11, 2021
 *
 * Lab 2: Task 1
 */
public class lab2_task1 {
    public static void main(String[] args){
        //last two digits of Panther ID
        double n = 40;
        double m = n + 5;
        //initializing temporary variable to save sum for both equations
        double sum = 0;
        double sum2 = 0;
        //determines whether n is even or odd
        if (m % 2 == 0) {
            //when m is even
            //calculates even equation 1
            for(double i = 2; i <= m; i = i + 2) {
                sum = 1/(i) + sum;
            }
            //prints even equation 1 results
            System.out.println("The result of Eq. (1) is: " + sum);
            //calculates even equation 2
            for (double i = 5; i <= 3 * m - 1; i = (i + 6)) {
                sum2 = 1/(i) + sum2;
            }
            //prints even equation 2 results
            System.out.println("The result of Eq. (2) is: " + sum2);
        }
        //when m is odd
        else{
            //calculates odd equation 1
            for (double i = 1; i <= m; i = i + 2) {
                sum = 1/(i) + sum;
            }
            //print odd equation 1 results
            System.out.println("The result of Eq. (1) is: " + sum);
            //calculates odd equation 2
            for (double i = 3; i <= 2 * m + 1; i = (i + 4)) {
                sum2 = 1/(i) + sum2;
            }
            //prints odd equation 2 results
            System.out.println("The result of Eq. (2) is: " + sum2);
        }
    }
}