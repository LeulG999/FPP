package Lesson_9.Problem_4;

import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {
       private Queue<Ticket> tickets=new LinkedList<>();
       private int nextId=1;

       public void addTicket(String description){
           Ticket t=new Ticket(nextId,description);
             tickets.add(t);
             nextId++;
       }
       public Ticket processTicket(){
           return tickets.poll();
       }
       public Ticket viewNextTicket(){
           return tickets.peek();
       }
       public boolean isEmpty(){
           return tickets.isEmpty();
       }
}
