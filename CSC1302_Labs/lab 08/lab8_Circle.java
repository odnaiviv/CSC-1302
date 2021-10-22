/*
 * July 02, 2021
 *
 * Lab 8: Circle Class
 */
public class lab8_Circle {
    //initializing private integer radius
    private int radius;
    //declaring the point object as a center
    public lab8_Point center;

    //circle constructor
    public lab8_Circle(lab8_Point center, int radius) {
        //refers to the current class using this.radius and this.center
        this.radius = radius;
        this.center = center;
    }
    //method to get and return the center
    public lab8_Point getCenter(){
        return center;
    }
    //method to get and return the radius
    public int getRadius(){
        return radius;
    }
    //method to get and return the calculation of the area
    public double getArea(){
        return (radius * radius * Math.PI);
    }
    //method to get and return the calculation of the circumference
    public double getCircumference(){
        return(radius * 2 *Math.PI);
    }
    //method to return the center and radius in toString method
    public String toString(){
        return "Circle: Center = (" + center + ") | Radius = " + radius;
    }
    //method to check if the given point lies within the circle
    public boolean contains(lab8_Point point){
        if(lab8_Point.distance(center, point) <= radius) {
            return true;
        }
        else {
            return false;
        }
    }
}