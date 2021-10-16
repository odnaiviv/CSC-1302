/*
 * June 16, 2021
 *
 * Lab 3: Task 1
 */
public class lab3_task1 {
    public static void main(String[] args){
        //for loop to start counting rows down with 5
        for (int count = 5; count >= 1; count--) {
            //printing numbers
            for (int num = count; num <= 5; num++) {
                //printing spaced-out numbers
                System.out.print(num + " ");
            }
            //stopping the spacing between rows
            if (count != 2) {
                System.out.println();
            }
            //returns to next line & program continues
            else{
                System.out.println();
                continue;
            }
            //returns to next line
            System.out.println();
        }
    }
}
