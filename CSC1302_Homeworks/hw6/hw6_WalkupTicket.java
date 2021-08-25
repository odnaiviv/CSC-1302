/*
 * July 20, 2021
 *
 * Homework 6: Task 1 (Walk-up Ticket)
 */
public class hw6_WalkupTicket extends hw6_Ticket {
    double price;

    //constructor
    public hw6_WalkupTicket(int number) {
        //super to call & refer to the ticket class object
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
