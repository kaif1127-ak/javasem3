
public class PremiumMember extends GymMember {
    protected String trainerName;

    public PremiumMember(String memberId, int monthlyFee, String trainerName) {
        super(memberId, monthlyFee);
        this.trainerName = trainerName;
    }

    @Override
    public void displayInfo() {
        System.out.println("Premium Member | Trainer: " + trainerName
                + " | Sessions: " + getSessionsAttended());
    }

    @Override
    protected void chargeLateFee(int amount) {
        super.chargeLateFee(amount / 2);
    }
}
