
public class ReferenceDeskTest {

    public static void main(String[] args) {

        String[][] attempts = {
            {"private", "SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE"},
            {"protected", "SUBCLASS_DIFFERENT_PACKAGE_PARENT_TYPE"},
            {"default", "SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE"},
            {"protected", "SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE"},
            {"public", "DIFFERENT_PACKAGE"}
        };

        System.out.println("Access Results:");

        for (String[] attempt : attempts) {
            boolean allowed = AccessChecker.classifyAccess(
                attempt[0], attempt[1]);

            System.out.println(
                attempt[0] + " via " + attempt[1]
                + " = " + (allowed ? "Allowed" : "Denied"));
        }

        System.out.println("\nFirst Denied Attempt:");
        System.out.println(
            AccessChecker.firstDeniedAttempt(attempts));
    }
}
