/*
 * July 21, 2021
 *
 * Lab 13: Doctor
 */
//creating subclass Doctor that extends from superclass Human
public class lab13_Doctor extends lab13_Human {
    //initializing private instance variables
    private int years;
    private String Speciality;

    //creating constructor extending from superclass and initializing private instance variables in this class
    public lab13_Doctor(int age, double weight, double height, int years, String Speciality) {
        super(age, weight, height);
        this.years = years;
        this.Speciality = Speciality;
    }

    //method to get constructors
    public int getYears() {
        return years;
    }
    public String getSpeciality() {
        return Speciality;
    }
    //method to calculate, get, and return salary
    public int getSalary() {
        return 40000 + (years - 1) * 5000;
    }
}
