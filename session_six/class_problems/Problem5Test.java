
public class Problem5Test {
    public static String processNightlyAudit(LibraryMember[] members) {
        int processed = 0;
        int nullSkipped = 0;
        int facultyCount = 0;
        int regularCount = 0;

        for (LibraryMember member : members) {
            if (member == null) {
                nullSkipped++;
            } else {
                processed++;

                if (member instanceof FacultyMember) {
                    facultyCount++;
                } else {
                    regularCount++;
                }
            }
        }

        return processed + " processed | "
            + nullSkipped + " null skipped | "
            + facultyCount + " faculty | "
            + regularCount + " regular";
    }

    public static void main(String[] args) {
        LibraryMember m1 = new LibraryMember("GEN01", 3);

        System.out.println("Member Number: " + m1.memberNumber);
        System.out.println("Members Enrolled: "
                + LibraryMember.getMembersEnrolled());

        System.out.println(
            "R12A valid: " + LibraryMember.isValidRenewalCode("R12A")
        );
        System.out.println(
            "R1A valid: " + LibraryMember.isValidRenewalCode("R1A")
        );
        System.out.println(
            "X12A valid: " + LibraryMember.isValidRenewalCode("X12A")
        );

        m1.borrowBook();
        m1.borrowBook("Fiction");
        System.out.println("Books Borrowed: " + m1.getBooksBorrowed());

        LibraryMember[] members = {
            new FacultyMember(5, "Physics"),
            null,
            new LibraryMember("GEN02", 3)
        };

        System.out.println(processNightlyAudit(members));
    }
}
