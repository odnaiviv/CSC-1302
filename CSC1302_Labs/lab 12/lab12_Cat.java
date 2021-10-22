/*
 * July 16, 2021
 *
 * Lab 12: Cat
 */
//creating the subclass Cat that extends from the superclass Animal
public class lab12_Cat extends lab12_Animal{
    //initializing private variable
    private String color;
    //constructor extending from superclass
    //also initializing the private instance color in constructor
    public lab12_Cat(boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.color = color;
    }

    //method to get color
    public String getColor() {
        return color;
    }
    //method to set color
    public void setColor(String color) {
        this.color = color;
    }
}
