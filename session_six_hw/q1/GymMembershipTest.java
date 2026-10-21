
public class GymMembershipTest {

    public static String classifyGeneration(GymMember member) {
        if (member instanceof EliteMember)
            return "Multilevel descendant (3 generations deep)";
        if (member instanceof GroupClassMember)
            return "Hierarchical sibling (independent branch)";
        if (member instanceof PremiumMember)
            return "Premium Member";
        return "Standard Member";
    }

    public static int getTotalSessionsAttended(GymMember[] members) {
        int total = 0;
        for (GymMember m : members)
            if (m != null) total += m.getSessionsAttended();
        return total;
    }

    public static String batchPrint(GymMember[] members) {
        StringBuilder report = new StringBuilder();

        for (GymMember m : members) {
            if (m instanceof PremiumMember) {
                PremiumMember p = (PremiumMember) m;
                report.append("Premium | Trainer: ")
                      .append(p.trainerName)
                      .append(" | Sessions: ")
                      .append(m.getSessionsAttended())
                      .append(" [Trainer via downcast: ")
                      .append(p.trainerName).append("] | ");
            } else {
                report.append("Standard | Sessions: ")
                      .append(m.getSessionsAttended()).append(" | ");
            }

            // Polymorphic call required by the assignment
            m.displayInfo();
        }

        return report.toString();
    }

    public static String processWeeklyCheckIn(GymMember[] members) {
        int processed = 0, skipped = 0, group = 0, individual = 0;

        for (GymMember m : members) {
            if (m == null) {
                skipped++;
            } else {
                processed++;
                if (m instanceof GroupClassMember) group++;
                else individual++;
            }
        }

        return processed + " processed | " + skipped
                + " null skipped | " + group + " group | "
                + individual + " individual";
    }

    public static void main(String[] args) {
        GymMember standard = new GymMember("MEM101", 1000);
        PremiumMember premium =
                new PremiumMember("MEM102", 2000, "Coach Riya");
        EliteMember elite =
                new EliteMember("MEM103", 3000, "Coach Arjun", "L12");
        GroupClassMember group =
                new GroupClassMember("MEM104", 1000, "Zumba");

        GymMember[] members = {standard, premium, elite, group, null};

        System.out.println("=== Member Details ===");
        for (GymMember m : members) {
            if (m != null) {
                m.displayInfo();
                System.out.println(classifyGeneration(m));
                m.attendSession();
            }
        }

        System.out.println("\nTotal Sessions: "
                + getTotalSessionsAttended(members));

        System.out.println("\n=== Batch Report ===");
        System.out.println(batchPrint(
                new GymMember[]{standard, premium}));

        System.out.println("\n=== Weekly Check-in ===");
        System.out.println(processWeeklyCheckIn(members));

        System.out.println("\n=== Batch Sign-up ===");
        String[] ids = {"MEM1", "GM1", "MEM2", " ", "MEM3"};
        System.out.println(GymMember.signUpBatch(ids, 1000));

        System.out.println("\nMembership Number: "
                + standard.getMembershipNumber());
        System.out.println("Members Enrolled: "
                + GymMember.getMembersEnrolled());
        System.out.println("Valid Referral: "
                + GymMember.isValidReferralCode("G12A"));

        standard.payFee(1000, "UPI");
        System.out.println("Fees Paid: " + standard.getFeesPaid());
        System.out.println("Payment Mode: " + standard.getPaymentMode());
    }
}
