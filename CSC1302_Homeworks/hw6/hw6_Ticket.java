/*
 * Vivian Do
 * ID: 002-48-6640
 * July 20, 2021
 *
 * Homework 6: Task 1 (Ticket)
 * This is the Ticket superclass for all other three ticket classes. It defines all of the operations in the
 * class and to specify the differing operations in a way where every subclass must implement them.
 */
public class hw6_Ticket {
    //initializing private instance variable
    private int number;

    //creating the ticket constructor class
    public hw6_Ticket(int number) {
        //setting number as the current object
        this.number = number;
    }

    //method to get and return price
    public double getPrice() {
        return number;
    }

    //override method to implement and return toString method
    @Override
    public String toString() {
        return "Number = " + number + ", Price: " + getPrice();
    }
}
