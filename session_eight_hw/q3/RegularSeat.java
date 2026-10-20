public class RegularSeat implements Seat {
    private String id;

    public RegularSeat(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return 150;
    }
}