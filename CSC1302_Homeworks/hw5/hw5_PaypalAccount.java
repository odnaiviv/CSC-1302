/*
 * Vivian Do
 * ID: 002-48-6640
 * July 13, 2021
 *
 * Homework 5: Task 1 (Paypal Account)
 * This is the Paypal Account class that initializes the instance variables and creates class constructors
 * in order to set the values of the account id and balances.
 */
public class hw5_PaypalAccount {
    //initializing instance variables for balance and accountID
    double balance;
    int accountID;

    //creating the paypal account constructor class
    public hw5_PaypalAccount() {
        //setting this class as the super/parent class constructor
        super();
    }
    //creating class constructor to set the account id and balance values
    public hw5_PaypalAccount(int accID, double bal) {
        super();
        this.accountID = accID;
        this.balance = bal;
    }
}
