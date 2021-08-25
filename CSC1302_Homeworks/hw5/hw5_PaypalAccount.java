/*
 * July 13, 2021
 *
 * Homework 5: Task 1 (Paypal Account)
 */
public class hw5_PaypalAccount {
    //creating instance variables for balance & accountID
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
