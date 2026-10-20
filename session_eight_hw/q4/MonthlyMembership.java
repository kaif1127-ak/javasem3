
public class MonthlyMembership extends Membership {

    public MonthlyMembership(String memberName) {
        super(memberName);
    }

    @Override
    public double calculateFee() {
        return 1000;
    }
}
