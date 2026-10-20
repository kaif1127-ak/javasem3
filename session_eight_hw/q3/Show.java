import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Show {
    private String time;
    private LocalDateTime startTime;
    private Set<String> bookedSeats = new HashSet<>();

    public Show(String time, LocalDateTime startTime) {
        this.time = time;
        this.startTime = startTime;
    }

    public String getTime() {
        return time;
    }

    public boolean isBooked(String seatId) {
        return bookedSeats.contains(seatId);
    }

    public boolean bookSeat(String seatId) {
        return bookedSeats.add(seatId);
    }

    public void releaseSeat(String seatId) {
        bookedSeats.remove(seatId);
    }

    public boolean hasStarted() {
        return !LocalDateTime.now().isBefore(startTime);
    }
}