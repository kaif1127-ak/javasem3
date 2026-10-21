
public class MovieTicket {
    private int seatNumber;
    String screenId;
    protected double ticketPrice;
    public String movieTitle;

    public MovieTicket(int seatNumber, String screenId,
                       double ticketPrice, String movieTitle) {
        this.seatNumber = seatNumber;
        this.screenId = screenId;
        this.ticketPrice = ticketPrice;
        this.movieTitle = movieTitle;
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket(
                12, "SCREEN-1", 250.0, "Leo");

        System.out.println("Seat Number: " + ticket.seatNumber);
        System.out.println("Screen ID: " + ticket.screenId);
        System.out.println("Ticket Price: " + ticket.ticketPrice);
        System.out.println("Movie Title: " + ticket.movieTitle);
    }
}
