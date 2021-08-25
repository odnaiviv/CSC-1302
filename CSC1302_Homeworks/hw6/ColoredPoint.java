/*
 * July 20, 2021
 *
 * Homework 6: Task 2 (Colored Point)
 */

//giving Point class colors
public class ColoredPoint extends Point implements Colored {
	//private instance variable
	private String color;
	
	//constructor
	public ColoredPoint(int x, int y, String color) {
		//super to call & refer to the Color interface and Point class object
		super(x, y);
		this.color = color;
	}
	
	//method to set color
	public void setColor(String clr) {
		color = clr;
	}
	
	//first override method to get & return color in this class
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
	
	//third override method to implement & return this toString method
	@Override
	public String toString() {
		return super.toString() + ", Color: " + getColor();
	}
}
