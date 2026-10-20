import java.time.LocalDateTime;

public class TicketTest {
    public static void main(String[] args) {
        Show show = new Show(
            "7 PM",
            LocalDateTime.now().plusHours(2)
        );

        Customer asha = new Customer("Asha");
        Customer ravi = new Customer("Ravi");
        Customer neha = new Customer("Neha");

        Booking booking1 = new Booking(asha, show);
        booking1.bookSeats(
            new RegularSeat("A1"),
            new RegularSeat("A2"),
            new PremiumSeat("F5")
        );

        Booking booking2 = new Booking(ravi, show);
        booking2.bookSeats(new RegularSeat("A2"));
        booking2.bookSeats(new ReclinerSeat("R1"));

        booking1.cancel();

        Booking booking3 = new Booking(neha, show);
        booking3.bookSeats(new RegularSeat("A2"));
    }
}