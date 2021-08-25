/*
 * Vivian Do
 * ID: 002-48-6640
 * July 20, 2021
 *
 * Homework 6: Task 2 (Colored Client)
 * This is the Colored Client class that creates new objects from the previous class ColoredPoint. This class will also compare
 * the point and its color. The results of the points and the comparison will be printed out in the main method.
 */
//ignore package because I'm using a different IDE
package HW6;

public class ColoredClient {
	public static void main(String[] args) {
		//creating new objects of the ColoredPoint class
		//points are created by randomly generating numbers between 1 - 10
		//colored is chosen by randomly spinning a wheel from the colors of ROYGBIV
		ColoredPoint cp1 = new ColoredPoint(4, 3, "violet");
		ColoredPoint cp2 = new ColoredPoint(8, 5, "orange");
		
		//printing out the colored points
		System.out.println(cp1);
		System.out.println(cp2);
		
		//comparing the two colored points to see if they are equal
		//printing results of this comparison
		System.out.println("is cp1 equal to cp2? " + cp1.equals(cp2));
	}
}
