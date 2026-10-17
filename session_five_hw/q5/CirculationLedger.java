
public class CirculationLedger {

    private static int totalProcessed;
    private static int nullSkipped;
    private static int referenceOnly;
    private static int regular;

    static {
        totalProcessed = 0;
        nullSkipped = 0;
        referenceOnly = 0;
        regular = 0;
    }

    public static String processNightlyCirculation(
            Object[] receipts) {

        totalProcessed = 0;
        nullSkipped = 0;
        referenceOnly = 0;
        regular = 0;

        if (receipts != null) {
            for (Object receipt : receipts) {

                if (receipt == null) {
                    nullSkipped++;
                    continue;
                }

                totalProcessed++;

                if (receipt instanceof ReferenceOnlyLoanReceipt) {
                    referenceOnly++;
                } else if (receipt instanceof LoanReceipt) {
                    regular++;
                }
            }
        }

        return totalProcessed + " processed | "
                + nullSkipped + " null skipped | "
                + referenceOnly + " reference-only | "
                + regular + " regular";
    }
}
