/*
 * Vivian Do
 * ID: 002-48-6640
 * July 20, 2021
 *
 * Homework 6: Task 2 (Colored Point)
 * This is the Colored Point class that implements Colored interface and extends Point class. This class gives the Point class colors
 * and compares the colors with one another to see if the colors are equal or not.
 */
//ignore package because I'm using a different IDE
package HW6;

//creating class that implements Colored interface and extends Point class
//give Point class colors
public class ColoredPoint extends Point implements Colored {
	//initializing private instance variable
	private String color;
	
	//constructor to initialize variables
	public ColoredPoint(int x, int y, String color) {
		//super to call and refer to the Color interface and Point class object
		super(x, y);
		this.color = color;
	}
	
	//method to set color
	public void setColor(String clr) {
		color = clr;
	}
	
	//first override method to get and return color in this class
	@Override
	public String getColor() {
		return color;
	}
	
	//second override equals method to compare colors
	@Override
	public boolean equals(Object obj) {
		ColoredPoint other = (ColoredPoint) obj;
		return super.equals(obj) && (other.getColor().equals(color));
	}
	
	//third override method to implement and return this toString method
	@Override
	public String toString() {
		return super.toString() + ", Color: " + getColor();
	}
}
