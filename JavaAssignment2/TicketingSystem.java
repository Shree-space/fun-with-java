package TicketSystem;

import java.util.Scanner;

public class TicketingSystem {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Ticketing System");
        System.out.println("Please enter '1' to CREATE A NEW TICKET or '2' to EXIT ");
        int userInput = sc.nextInt();
        //Create ticket
        if (userInput == 1){

            sc.nextLine();
            System.out.println("Please enter a short description about the ticket");
            String ticketDescription = sc.nextLine();
           // sc.nextLine();
            System.out.println("Please enter the Ticket Type");
            String ticketType = sc.nextLine();

            Ticket T1 = new Ticket(ticketDescription,ticketType);

            // Approve or Reject
            System.out.println("Please enter '3' to APPROVE or '4' to REJECT ");
            userInput = sc.nextInt();
            if (userInput == 3){
                T1.approveTicket();
                // Resolve Ticket
                sc.nextLine();
                System.out.println("Please enter resolution details");
                String resolutionDetails  = sc.nextLine();
                T1.resolveTicket(resolutionDetails);


                //Close Ticket
                System.out.println("Please review the resolution and enter 5 to close the ticket");
                userInput = sc.nextInt();
                if (userInput == 5){
                    T1.closeTicket();
                }else {
                    System.out.println("Invalid Input  - exiting");
                }


            }else if(userInput == 4) {

                T1.rejectTicket();
            } else {
                System.out.println("Invalid Input  - exiting");
            }

        } else if (userInput == 2){
            System.out.println("Good Bye"); //exit
        } else {
            System.out.println("Invalid Input  - exiting");
        }


    }



}
