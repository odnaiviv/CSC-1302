/*
 * June 15, 2021
 *
 * Homework 1: Task 1 (ChrisTree)
 */
public class hw1_task1 {
    public static void main(String[] args) {
        //you can change the numbers in segment and height;
        //it should not significantly change overall outcome of program
        int segment = 3;
        int height = 4;
        
        //creating tree tops
        int rowOfLeaves = 1;
        
        for (int leaf = 1; leaf <= segment; leaf++) {
            for (int i = rowOfLeaves; i <= height; i++) {
                int tree = leaf;
                while (tree < segment) {
                    System.out.print(" ");
                    tree++;
                }
                //printing spaces between * of the tree
                for (int spaces = height - 1; spaces >= i; spaces--) {
                    System.out.print(" ");
                }
                //printing * on the left side of tree
                for (int leftStars = 1; leftStars <= i; leftStars++) {
                    System.out.print("*");
                }
                //printing * on the right side of tree
                for (int rightStars = 1; rightStars < i; rightStars++) {
                    System.out.print("*");
                }
                //returns next line
                System.out.println();
            }
            //lines up the next/upcoming segments of tree tops
            rowOfLeaves += 1;
            height += 1;
        }
        //creating tree trunk/stem
        for (int stem = 1; stem <= 2; stem++) {
            //printing spaces between * in tree trunk
            for (int spaces = 1; spaces <= (height + segment + 1) / 2; spaces++) {
                System.out.print(" ");
            }
            //printing * of tree trunk
            for (int stars = 1; stars <= (height/4); stars++) {
                System.out.print("*");
            }
            //returns next line
            System.out.println();
        }
        //creating tree base
        for (int spaces = 1; spaces <= (height + segment + 1) / 4; spaces++) {
            System.out.print(" ");
        }
        System.out.println("*******");
    }
}
