
public class TicketAccessTest {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket(
                "Leo", "Screen 1", 250, "BK101");

        System.out.println("Booking ID: " + ticket.bookingId);
        System.out.println("Screen: " + ticket.screenName);
        System.out.println("Price: " + ticket.ticketPrice);
    }
}

