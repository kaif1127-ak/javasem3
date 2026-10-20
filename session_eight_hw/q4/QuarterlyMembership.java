
public class QuarterlyMembership extends Membership {

    public QuarterlyMembership(String memberName) {
        super(memberName);
    }

    @Override
    public double calculateFee() {
        return 2700;
    }
}
