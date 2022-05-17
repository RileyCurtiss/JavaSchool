package Lab8;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class TicketingService {

   public static void main (String[] args) {
      try (Scanner scnr = new Scanner(System.in)) {
         String personName = "";
         int counter = 1;
         int youPosition = 0;

         Queue<String> peopleInQueue = new LinkedList<String>();
         
         personName = scnr.nextLine();
         while (!personName.equals("-1")) {
            // TODO: Add personName to peopleInQueue and 
            //       determine position of "You" (youPosition)                                              
            peopleInQueue.add(personName);
            if (personName.equals("You")) {
               youPosition = counter;
            }
            counter++;
            personName = scnr.nextLine();
         }

         System.out.println("Welcome to the ticketing service... ");
         System.out.println("You are number " + youPosition + " in the queue.");
         while (peopleInQueue.peek() != "You" && youPosition  > 1) {
           String s = peopleInQueue.peek();
           System.out.println(s + " has purchased a ticket.");
           youPosition--;
           System.out.println("You are now number " + youPosition);
           peopleInQueue.poll();
         }
      }
      //System.out.println("You are number " + youPosition + " in the queue.");
      System.out.println("You can now purchase your ticket!");

      // TODO: In a loop, remove head person from peopleInQueue,                                    
      //       output their name and that they have purchased a ticket,                             
      //       then output your position in the queue. When you are at                              
      //       the head, output that you can purchase your ticket.                                  


   }
}