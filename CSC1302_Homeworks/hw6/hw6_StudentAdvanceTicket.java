/*
 * Vivian Do
 * ID: 002-48-6640
 * July 20, 2021
 *
 * Homework 6: Task 1 (Student Advance Ticket)
 * This is the Student Advance Ticket subclass that represents the purchased tickets in advance for students. This subclass
 * is constructed with a ticket number and the number of days the student has bought it in advance. The ticket price is $15 if the
 * student bought over 10 days. The ticket price is $20 if the student bought it in less than 10 days. The toString method will
 * ask student to show ID if ticket was bought in advance.
 */
public class hw6_StudentAdvanceTicket extends hw6_Ticket{
    //initializing private instance variable
    private int stuDaysInAdvance;

    //constructor to initialize variables
    public hw6_StudentAdvanceTicket(int number, int stuDaysInAdvance) {
        //super to call and refer to the ticket class object
        super(number);
        //setting the number of days in advance for students as the current object
        this.stuDaysInAdvance = stuDaysInAdvance;
    }

    //first override method to return ticket price
    @Override
    public double getPrice() {
        //if statement to check if student has bought ticket in more than 10 days in advance
        if (stuDaysInAdvance >= 10) {
            return 15;
        }
        //else statement to check if student has nought ticket within 10 days
        else {
            return 20;
        }
    }

    //second override method to implement and return this toString method
    @Override
    public String toString() {
        return super.toString() + " (ID required)";
    }
}
