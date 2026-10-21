
public class CirculationLedgerTest {

    public static void main(String[] args) {

        LoanReceipt regular1 =
                new LoanReceipt("M101",
                        new String[]{"B101", "B102"});

        ReferenceOnlyLoanReceipt referenceOnly =
                new ReferenceOnlyLoanReceipt(
                        "M103",
                        new String[]{"B301"},
                        "Room A");

        Object[] receipts = {
            regular1,
            referenceOnly,
            null
        };

        System.out.println(
                CirculationLedger.processNightlyCirculation(receipts));
    }
}
