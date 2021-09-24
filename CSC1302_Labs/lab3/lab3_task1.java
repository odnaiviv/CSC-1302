/*
 * Vivian Do
 * ID: 002-48-6640
 * June 16, 2021
 *
 * Lab 3: Task 1
 */
public class lab3_task1 {
    public static void main(String[] args){
        //for loop to start counting rows down with 5
        for (int count = 5; count >= 1; count--) {
            //for loop to print numbers
            for (int num = count; num <= 5; num++) {
                //prints and spaces out numbers
                System.out.print(num + " ");
            }
            //if else loop to stop spacing between rows
            if (count != 2) {
                System.out.println();
            }
            //returns to next line and continues printing out rest of the program
            else{
                System.out.println();
                continue;
            }
            //returns to next line
            System.out.println();
        }
    }
}
