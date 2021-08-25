/*
 * July 20, 2021
 *
 * Homework 6: Task 1 (Ticket)
 */
public class hw6_Ticket {
    //private instance variable
    private int number;

    //constructor for ticket
    public hw6_Ticket(int number) {
        this.number = number;
    }

    //method to get & return price
    public double getPrice() {
        return number;
    }

    //override method to implement & return toString method
    @Override
    public String toString() {
        return "Number = " + number + ", Price: " + getPrice();
    }
}
