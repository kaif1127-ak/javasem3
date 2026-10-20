import java.util.ArrayList;
import java.util.List;

public class Booking {
    private Customer customer;
    private Show show;
    private List<Seat> seats = new ArrayList<>();
    private boolean cancelled = false;

    public Booking(Customer customer, Show show) {
        this.customer = customer;
        this.show = show;
    }

    public boolean bookSeats(Seat... requestedSeats) {
        if (requestedSeats.length == 0 || requestedSeats.length > 6) {
            System.out.println("You can book 1 to 6 seats only.");
            return false;
        }

        for (Seat seat : requestedSeats) {
            if (show.isBooked(seat.getId())) {
                System.out.println("Seat " + seat.getId() + " is already booked.");
                return false;
            }
        }

        for (Seat seat : requestedSeats) {
            show.bookSeat(seat.getId());
            seats.add(seat);
        }

        System.out.println(customer.getName() + " booked "
                + requestedSeats.length + " seat(s). Total: ₹" + getTotal());
        return true;
    }

    public double getTotal() {
        double total = 0;

        for (Seat seat : seats) {
            total += seat.getPrice();
        }

        return total;
    }

    public void cancel() {
        if (cancelled) {
            System.out.println("Booking is already cancelled.");
            return;
        }

        if (show.hasStarted()) {
            System.out.println("Cannot cancel after the show starts.");
            return;
        }

        for (Seat seat : seats) {
            show.releaseSeat(seat.getId());
        }

        cancelled = true;
        System.out.println(customer.getName() + "'s booking cancelled.");
    }
}