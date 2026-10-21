
public class GroupBookingReceipt implements ReceiptType {
    private final BookingReceipt receipt;
    private final int groupSize;

    public GroupBookingReceipt(String bookingId,
                               String[] seatNumbers,
                               int groupSize) {
        this.receipt = new BookingReceipt(bookingId, seatNumbers);
        this.groupSize = groupSize;
    }

    public String[] getSeatNumbers() {
        return receipt.getSeatNumbers();
    }

    public int getGroupSize() {
        return groupSize;
    }
}
