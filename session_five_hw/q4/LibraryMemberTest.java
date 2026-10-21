
public class LibraryMemberTest {

    public static void main(String[] args) {

        LibraryMember member = new LibraryMember();

        member.setMembershipId("LIB101");
        member.setMembershipId("LIB202");

        member.setName("Kaif");
        member.setPremiumMember(true);
        member.setSecurityAnswer("Blue");

        System.out.println("Membership ID: "
                + member.getMembershipId());

        System.out.println("Name: "
                + member.getName());

        System.out.println("Premium Member: "
                + member.isPremiumMember());

        System.out.println("Security answer stored securely: "
                + "No getter available");
    }
}
