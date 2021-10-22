/*
 * Vivian Do
 * ID: 002-48-6640
 * July 21, 2021
 *
 * Lab 13: Human
 */
public class lab13_Human {
    //initializing private instance variables
    private int age;
    private double weight;
    private double height;

    //initializing private variables with constructor
    public lab13_Human(int age, double weight, double height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    //methods to get constructors
    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }
    public double getHeight() {
        return height;
    }
}
