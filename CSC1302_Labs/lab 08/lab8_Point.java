/*
 * July 02, 2021
 *
 * Lab 8: Point Class
 */
public class lab8_Point {
    //initializing private integers to store x and y coordinates
    private int xCoord;
    private int yCoord;

    //point constructor
    public lab8_Point(int xCoord, int yCoord) {
        //refers to the current class instance variables using this.xCoord and this.yCoord
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }
    //method to return the x and y coordinates in toString method
    public String toString() {
        return xCoord + ", " + yCoord;
    }
    //method to calculate and return the distance between the two x and y coordinate points
    public static double distance(lab8_Point one, lab8_Point two) {
        return Math.sqrt((one.xCoord - two.xCoord) * (one.xCoord - two.xCoord) + (one.yCoord - two.yCoord) * (one.yCoord - two.yCoord));
    }
}