/*
 * July 20, 2021
 *
 * Homework 6: Task 1 (Advance Ticket)
 */

public class hw6_AdvanceTicket extends hw6_Ticket {
    //private instance variable
    private int daysInAdvance;

    //constructor
    public hw6_AdvanceTicket(int number, int daysInAdvance) {
        //super to call & refer to the ticket class object
        super(number);
        //setting the number of days in advance as the current object
        this.daysInAdvance = daysInAdvance;
    }

    //override method to return ticket price
    @Override
    public double getPrice() {
        //checking if ticket was bought more than 10 days in advanced
        if(daysInAdvance >= 10) {
            return 30;
        }
        //checking if ticket was bought within 10 days
        else {
            return 40;
        }
    }
}
