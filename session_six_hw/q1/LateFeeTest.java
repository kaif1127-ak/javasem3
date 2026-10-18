
public class LateFeeTest {
    public static void main(String[] args) {
        PremiumMember p =
                new PremiumMember("MEM5", 2000, "Coach Riya");

        p.chargeLateFee(200);

        int[] history = p.getLateFeeHistory();
        history[0] = 999;

        System.out.println("Total Late Fees: "
                + p.getTotalLateFees());

        System.out.println("History After Tampering: "
                + p.getLateFeeHistory()[0]);
    }
}
