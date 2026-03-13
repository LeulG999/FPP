package Lesson_9.Problem_4;
public class TicketTest {
    public static void main(String[] args) {
        TicketingSystem system = new TicketingSystem();
        //Adding tickets
        system.addTicket("internet not working");
        system.addTicket("Printer is broken");
        system.addTicket("Login problem");
        // View the next Ticket
        System.out.println(system.viewNextTicket());
        //to process the ticket
        System.out.println(system.processTicket());
        //
        System.out.println(system.viewNextTicket());

    }
}
