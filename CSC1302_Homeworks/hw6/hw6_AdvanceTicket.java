/*
 * Vivian Do
 * ID: 002-48-6640
 * July 20, 2021
 *
 * Homework 6: Task 1 (Advance Ticket)
 * This is the Advance Ticket subclass that represent the purchased tickets in advance. This subclass is constructed with a ticket number
 * and the number of days it was purchased in advance. If the ticket was bought in 10 or more days, the price is $30. If the tickets were bought
 * in less than 10 days, then the price is $40.
 */
public class hw6_AdvanceTicket extends hw6_Ticket {
    //initializing private instance variable
    private int daysInAdvance;

    //constructor to initialize variables
    public hw6_AdvanceTicket(int number, int daysInAdvance) {
        //super to call and refer to the ticket class object
        super(number);
        //setting the number of days in advance as the current object
        this.daysInAdvance = daysInAdvance;
    }

    //override method to return the ticket price
    @Override
    public double getPrice() {
        //if statement to check if ticket was bought more than 10 days in advanced
        if(daysInAdvance >= 10) {
            return 30;
        }
        //else statement to check if ticket was bought within 10 days
        else {
            return 40;
        }
    }
}
