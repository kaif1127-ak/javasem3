
public abstract class Membership {
    protected String memberName;
    protected String status;

    public Membership(String memberName) {
        this.memberName = memberName;
        this.status = "Active";
    }

    public abstract double calculateFee();

    public void checkIn() {
        if (status.equals("Active")) {
            System.out.println(memberName + " checked in successfully.");
        } else {
            System.out.println(memberName
                    + " cannot check in. Membership is " + status + ".");
        }
    }

    public void freeze() {
        if (status.equals("Active")) {
            status = "Frozen";
            System.out.println(memberName + "'s membership is Frozen.");
        } else {
            System.out.println("Cannot freeze membership. Status: " + status);
        }
    }

    public void unfreeze() {
        if (status.equals("Frozen")) {
            status = "Active";
            System.out.println(memberName + "'s membership is Active.");
        } else {
            System.out.println("Cannot unfreeze membership. Status: " + status);
        }
    }

    public void expire() {
        if (!status.equals("Expired")) {
            status = "Expired";
            System.out.println(memberName + "'s membership is Expired.");
        }
    }

    public String getStatus() {
        return status;
    }
}
