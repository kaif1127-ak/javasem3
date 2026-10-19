
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reservation {
    private Customer customer;
    private Room room;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private LocalDate cancellationDeadline;
    private boolean active;

    private static List<Reservation> reservations = new ArrayList<>();

    public Reservation(Customer customer, Room room,
                       LocalDate checkIn, LocalDate checkOut,
                       LocalDate cancellationDeadline) {
        this.customer = customer;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.cancellationDeadline = cancellationDeadline;
        this.active = false;
    }

    public boolean book() {
        if (!checkOut.isAfter(checkIn)) {
            System.out.println("Invalid booking dates.");
            return false;
        }

        for (Reservation r : reservations) {
            if (r.active && r.room.getRoomNumber() == room.getRoomNumber()
                    && checkIn.isBefore(r.checkOut)
                    && checkOut.isAfter(r.checkIn)) {
                System.out.println("Room " + room.getRoomNumber()
                        + " is already booked for these dates.");
                return false;
            }
        }

        active = true;
        reservations.add(this);
        System.out.println(customer.getName() + " booked "
                + room.getRoomType() + " Room " + room.getRoomNumber()
                + ". Total: Rs."
                + (room.getPricePerNight()
                * (checkOut.toEpochDay() - checkIn.toEpochDay())));
        return true;
    }

    public void cancel(LocalDate today) {
        if (!active) {
            System.out.println("Reservation is not active.");
        } else if (today.isBefore(cancellationDeadline)
                || today.isEqual(cancellationDeadline)) {
            active = false;
            System.out.println("Reservation cancelled for "
                    + customer.getName());
        } else {
            System.out.println("Cancellation deadline has passed.");
        }
    }
}
