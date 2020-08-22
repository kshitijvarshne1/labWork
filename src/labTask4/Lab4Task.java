/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 01-Aug-20
 *   Time: 10:18 PM
 *   File: Lab4Task.java
 */
package labTask4;

import java.util.Scanner;

public class Lab4Task {
    private static final byte TOTAL_PARTICIPANTS = 10;

    private static void sellTicket(String participantName) {
        String message = "Congratulations, " + participantName + ". " + "See you at the conference!";
        System.out.println(message);
    }

    public static void main(String[] args) {
        byte numberOfTicketSold = (byte) 0;
        while (numberOfTicketSold <= TOTAL_PARTICIPANTS) {
            System.out.println("Total Tickets Left : " + (TOTAL_PARTICIPANTS - numberOfTicketSold));
            System.out.println("Please enter your name : ");
            Scanner scanner = new Scanner(System.in);
            String participantName = scanner.nextLine();
            sellTicket(participantName);
            numberOfTicketSold++;
            if (numberOfTicketSold == TOTAL_PARTICIPANTS) {
                System.out.println("Sorry, The tickets are sold-out!");
                scanner.close();
                break;
            }
        }
    }
}
