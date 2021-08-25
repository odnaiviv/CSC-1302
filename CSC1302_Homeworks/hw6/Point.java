/*
 * Vivian Do
 * ID: 002-48-6640
 * July 20, 2021
 *
 * Homework 6: Task 2 (Point)
 * This is the given Point class for this homework.
 */
//ignore package because I'm using a different IDE
package HW6;

//Point class
public class Point {
	private int x;
	private int y;
	
	public Point() {
		this(0, 0);
	}
	public Point(int x, int y) {
		setLocation(x, y);
	}
	public boolean equals(Object o) {
		if (o instanceof Point) {
		Point other = (Point) o;
		return x == other.x && y == other.y;
		}
		else {
			return false;
		}
	}
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return"(" + x + ", " + y + ")";
	}
}
