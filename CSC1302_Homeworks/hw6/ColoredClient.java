/*
 * July 20, 2021
 *
 * Homework 6: Task 2 (Colored Client)
 */

public class ColoredClient {
	public static void main(String[] args) {
		//points are created by randomly generating numbers between 1 - 10
		//colors are chosen by randomly spinning a wheel from the colors of ROYGBIV
		ColoredPoint cp1 = new ColoredPoint(4, 3, "violet");
		ColoredPoint cp2 = new ColoredPoint(8, 5, "orange");
		
		//printing the colored points
		System.out.println(cp1);
		System.out.println(cp2);
		
		//comparing & printing the two colored points to see if they are equal
		System.out.println("is cp1 equal to cp2? " + cp1.equals(cp2));
	}
}
