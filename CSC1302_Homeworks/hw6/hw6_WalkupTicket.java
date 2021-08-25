/*
 * Vivian Do
 * ID: 002-48-6640
 * July 20, 2021
 *
 * Homework 6: Task 1 (Walk-up Ticket)
 * This is the Walk-up Ticket subclass that is constructed by a number with a price of $50.
 */
public class hw6_WalkupTicket extends hw6_Ticket {
    //initializing price as a double
    double price;

    //constructor class to initialize variables
    public hw6_WalkupTicket(int number) {
        //super to call and refer to the ticket class object
        super(number);
        //setting ticket price to $50
        price = 50.0;
    }

    //override method to return price
    @Override
    public double getPrice() {
        return price;
    }
}
