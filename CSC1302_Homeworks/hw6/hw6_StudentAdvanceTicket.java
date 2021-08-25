/*
 * July 20, 2021
 *
 * Homework 6: Task 1 (Student Advance Ticket)
 */

public class hw6_StudentAdvanceTicket extends hw6_Ticket{
    //private instance variable
    private int stuDaysInAdvance;

    //constructor
    public hw6_StudentAdvanceTicket(int number, int stuDaysInAdvance) {
        //super to call & refer to the ticket class object
        super(number);
        //setting the number of days in advance for students as the current object
        this.stuDaysInAdvance = stuDaysInAdvance;
    }

    //first override method to return ticket price
    @Override
    public double getPrice() {
        //checking if student has bought ticket in more than 10 days in advance
        if (stuDaysInAdvance >= 10) {
            return 15;
        }
        //checking if student has nought ticket within 10 days
        else {
            return 20;
        }
    }

    //second override method to implement & return this toString method
    @Override
    public String toString() {
        return super.toString() + " (ID required)";
    }
}
