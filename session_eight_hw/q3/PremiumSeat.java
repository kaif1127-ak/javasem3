public class PremiumSeat implements Seat {
    private String id;

    public PremiumSeat(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return 250;
    }
}