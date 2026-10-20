
public class MembershipTest {
    public static void main(String[] args) {

        Membership asha = new QuarterlyMembership("Asha");
        Membership ravi = new MonthlyMembership("Ravi");

        System.out.println("Asha's Quarterly Fee: Rs."
                + asha.calculateFee());
        asha.checkIn();
        asha.freeze();
        asha.checkIn();
        asha.unfreeze();
        asha.checkIn();

        System.out.println();

        System.out.println("Ravi's Monthly Fee: Rs."
                + ravi.calculateFee());
        ravi.expire();
        ravi.freeze();
        ravi.checkIn();
        ravi.unfreeze();
    }
}
