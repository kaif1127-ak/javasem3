
public class GymMember {
    protected String memberId;
    protected int monthlyFee;
    private int sessionsAttended;
    private int[] lateFeeHistory = new int[10];
    private int lateFeeCount;
    private int feesPaid;
    private String paymentMode;
    private final String membershipNumber;
    private static int memberCounter = 2000;

    public GymMember(String memberId, int monthlyFee) {
        if (memberId == null || memberId.trim().length() < 4) {
            throw new IllegalArgumentException("Invalid member ID");
        }
        if (monthlyFee <= 0) {
            throw new IllegalArgumentException("Monthly fee must be positive");
        }

        this.memberId = memberId;
        this.monthlyFee = monthlyFee;
        this.sessionsAttended = 0;
        this.lateFeeCount = 0;
        this.feesPaid = 0;
        this.membershipNumber = "GYM-" + (++memberCounter);
    }

    public GymMember(int monthlyFee) {
        if (monthlyFee <= 0) {
            throw new IllegalArgumentException("Monthly fee must be positive");
        }

        this.memberId = "AUTO";
        this.monthlyFee = monthlyFee;
        this.sessionsAttended = 0;
        this.lateFeeCount = 0;
        this.feesPaid = 0;
        this.membershipNumber = "GYM-" + (++memberCounter);
    }

    public String getMembershipNumber() {
        return membershipNumber;
    }

    public static int getMembersEnrolled() {
        return memberCounter - 2000;
    }

    public static boolean isValidReferralCode(String code) {
        return code != null && code.length() == 4
                && code.charAt(0) == 'G'
                && Character.isDigit(code.charAt(1))
                && Character.isDigit(code.charAt(2))
                && Character.isUpperCase(code.charAt(3));
    }

    public void payFee(int amount) {
        if (amount > 0) {
            feesPaid += amount;
        }
    }

    public void payFee(int amount, String mode) {
        paymentMode = mode;
        payFee(amount);
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void attendSession() {
        sessionsAttended++;
    }

    public int getSessionsAttended() {
        return sessionsAttended;
    }

    public void displayInfo() {
        System.out.println("Standard Member | Sessions: " + sessionsAttended);
    }

    protected void chargeLateFee(int amount) {
        if (lateFeeCount < lateFeeHistory.length && amount > 0) {
            lateFeeHistory[lateFeeCount++] = amount;
        }
    }

    public int[] getLateFeeHistory() {
        int[] copy = new int[lateFeeCount];
        for (int i = 0; i < lateFeeCount; i++) {
            copy[i] = lateFeeHistory[i];
        }
        return copy;
    }

    public int getTotalLateFees() {
        int total = 0;
        for (int i = 0; i < lateFeeCount; i++) {
            total += lateFeeHistory[i];
        }
        return total;
    }

    public static String signUpBatch(String[] memberIds, int monthlyFee) {
        int signedUp = 0;
        int rejected = 0;

        for (String id : memberIds) {
            try {
                new GymMember(id, monthlyFee);
                signedUp++;
            } catch (IllegalArgumentException e) {
                rejected++;
            }
        }

        return "Signed Up: " + signedUp + " | Rejected: " + rejected;
    }
}
