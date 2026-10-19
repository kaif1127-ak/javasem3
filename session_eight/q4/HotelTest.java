
import java.time.LocalDate;

public class HotelTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("Arun");
        Customer c2 = new Customer("Priya");

        Room room = new Room(101, "Deluxe", 3000);

        Reservation r1 = new Reservation(
                c1, room,
                LocalDate.of(2026, 11, 10),
                LocalDate.of(2026, 11, 13),
                LocalDate.of(2026, 11, 8));

        r1.book();

        Reservation r2 = new Reservation(
                c2, room,
                LocalDate.of(2026, 11, 12),
                LocalDate.of(2026, 11, 15),
                LocalDate.of(2026, 11, 10));

        r2.book();

        r1.cancel(LocalDate.of(2026, 11, 7));
        r2.book();
    }
}
