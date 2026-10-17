
public class AccessChecker {

    public static boolean classifyAccess(
            String fieldModifier, String accessorContext) {

        switch (fieldModifier.toLowerCase()) {

            case "private":
                return accessorContext.equals("SAME_CLASS");

            case "default":
                return accessorContext.equals("SAME_CLASS")
                    || accessorContext.equals("SAME_PACKAGE");

            case "protected":
                return accessorContext.equals("SAME_CLASS")
                    || accessorContext.equals("SAME_PACKAGE")
                    || accessorContext.equals(
                        "SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE");

            case "public":
                return true;

            default:
                return false;
        }
    }

    public static String firstDeniedAttempt(String[][] attempts) {

        for (int i = 0; i < attempts.length; i++) {

            boolean allowed = classifyAccess(
                attempts[i][0], attempts[i][1]);

            if (!allowed) {
                return attempts[i][0] + " via "
                    + attempts[i][1]
                    + " (attempt #" + (i + 1) + ")";
            }
        }

        return "None Denied";
    }
}
