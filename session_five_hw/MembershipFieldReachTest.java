
public class MembershipFieldReachTest {

    public static String summarizeByModifier(String[][] attempts) {
        String[] modifiers = {"private", "default", "protected", "public"};
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < modifiers.length; i++) {
            int allowed = 0;
            int denied = 0;

            for (int j = 0; j < attempts.length; j++) {
                if (attempts[j][0].equalsIgnoreCase(modifiers[i])) {
                    if (AccessChecker.classifyAccess(
                            attempts[j][0], attempts[j][1])) {
                        allowed++;
                    } else {
                        denied++;
                    }
                }
            }

            if (i > 0) {
                result.append(" | ");
            }

            result.append(modifiers[i])
                  .append(": ")
                  .append(allowed)
                  .append(" allowed / ")
                  .append(denied)
                  .append(" denied");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String[][] attempts = {
            {"private", "SAME_CLASS"},
            {"private", "DIFFERENT_PACKAGE"},
            {"default", "SAME_PACKAGE"},
            {"default", "DIFFERENT_PACKAGE"},
            {"protected", "SAME_CLASS"},
            {"protected", "SAME_PACKAGE"},
            {"public", "DIFFERENT_PACKAGE"}
        };

        System.out.println(summarizeByModifier(attempts));
    }
}
