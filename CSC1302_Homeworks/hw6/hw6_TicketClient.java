/*
 * July 20, 2021
 *
 * Homework 6: Task 1 (Ticket Client)
 */

public class hw6_TicketClient {
    public static void main(String[] args){
        //randomly picking numbers between 1 - 50 from an online random number generator
        //the days in advance are randomly generated number between 1 - 20
        hw6_Ticket t1 = new hw6_WalkupTicket(3);
        hw6_Ticket t2 = new hw6_AdvanceTicket(12, 15);
        hw6_Ticket t3 = new hw6_AdvanceTicket(26, 7);
        hw6_Ticket t4 = new hw6_StudentAdvanceTicket(37, 19);
        hw6_Ticket t5 = new hw6_StudentAdvanceTicket(43, 6);

        //printing results from corresponding Ticket classes
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
    }
}
