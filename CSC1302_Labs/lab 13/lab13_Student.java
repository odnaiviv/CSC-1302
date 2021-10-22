/*
 * July 21, 2021
 *
 * Lab 13: Student
 */
//creating subclass Student that extends from superclass Human
public class lab13_Student extends lab13_Human {
    //initializing private instance variables
    private String major;
    private double gpa;
    private int creditHours;

    //creating constructor extending from superclass and initializing private instance variables in this class
    public lab13_Student(int age, double weight, double height, String major, double gpa, int creditHours) {
        super(age, weight, height);
        this.major = major;
        this.gpa = gpa;
        this.creditHours = creditHours;
    }

    //method to get constructors
    public String getMajor() {
        return major;
    }
    public double getGPA() {
        return gpa;
    }
    //method to get year of student and return number of credit hours
    public String getYear() {
        //using if-else statements to check where the student's number of credit hours fall in between in order to categorize them by their classes/year
        if (creditHours < 32) {
            return "Freshman";
        }
        else if (creditHours >= 32 && creditHours < 64) {
            return "Sophomore";
        }
        else if (creditHours >= 64 && creditHours < 96) {
            return "Junior";
        }
        else if (creditHours >= 96) {
            return "Senior";
        }
        else {
            return "";
        }
    }
}
