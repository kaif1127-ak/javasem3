
public class NightlySettlement {

    public static String processNightlySettlement(
            ReceiptType[] receipts) {

        int processed = 0;
        int nullSkipped = 0;
        int group = 0;
        int individual = 0;

        for (ReceiptType receipt : receipts) {
            if (receipt == null) {
                nullSkipped++;
            } else {
                processed++;

                if (receipt instanceof GroupBookingReceipt) {
                    group++;
                } else {
                    individual++;
                }
            }
        }

        return processed + " processed | "
                + nullSkipped + " null skipped | "
                + group + " group | "
                + individual + " individual";
    }

    public static void main(String[] args) {
        ReceiptType[] receipts = {
            new GroupBookingReceipt(
                    "CH-2002", new String[]{"B1", "B2"}, 2),
            null,
            new BookingReceipt(
                    "CH-3003", new String[]{"C1"})
        };

        System.out.println(processNightlySettlement(receipts));
    }
}
