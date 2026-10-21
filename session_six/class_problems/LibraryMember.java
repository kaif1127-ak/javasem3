
public class LibraryMember {

    protected String memberId;
    protected int borrowLimit;
    protected int booksBorrowed;

    private int[] fineHistory = new int[10];
    private int fineCount = 0;

    private static int memberCounter = 100;

    public final String memberNumber;

    // Constructor with member ID and borrow limit
    public LibraryMember(String memberId, int borrowLimit) {
        if (memberId == null || memberId.trim().length() < 4) {
            throw new IllegalArgumentException(
                "Member ID must contain at least 4 characters"
            );
        }

        if (borrowLimit <= 0) {
            throw new IllegalArgumentException(
                "Borrow limit must be positive"
            );
        }

        this.memberId = memberId;
        this.borrowLimit = borrowLimit;
        this.booksBorrowed = 0;

        memberCounter++;
        this.memberNumber = "LIB-" + memberCounter;
    }

    // Constructor with only borrow limit
    public LibraryMember(int borrowLimit) {
        this("GEN" + (memberCounter + 1), borrowLimit);
    }

    // Borrow a book
    public void borrowBook() {
        if (booksBorrowed < borrowLimit) {
            booksBorrowed++;
        } else {
            System.out.println("Borrow limit reached.");
        }
    }

    // Borrow a book with a genre
    public void borrowBook(String genre) {
        System.out.println("Genre: " + genre);
        borrowBook();
    }

    public int getBooksBorrowed() {
        return booksBorrowed;
    }

    // Record fines
    protected void chargeFine(int amount) {
        if (fineCount < fineHistory.length) {
            fineHistory[fineCount] = amount;
            fineCount++;
        }
    }

    // Return a copy of the fine history
    public int[] getFineHistory() {
        int[] copy = new int[fineCount];

        for (int i = 0; i < fineCount; i++) {
            copy[i] = fineHistory[i];
        }

        return copy;
    }

    // Calculate total fines
    public int getTotalFine() {
        int total = 0;

        for (int i = 0; i < fineCount; i++) {
            total += fineHistory[i];
        }

        return total;
    }

    // Enroll a batch of members
    public static String enrollBatch(String[] memberIds) {
        if (memberIds == null) {
            return "No members to enroll";
        }

        StringBuilder result = new StringBuilder();

        for (String id : memberIds) {
            if (id != null && id.trim().length() >= 4) {
                result.append(id).append(" enrolled\n");
            } else {
                result.append("Invalid member ID\n");
            }
        }

        return result.toString();
    }

    // Validate renewal code: R + 2 digits + 1 uppercase letter
    public static boolean isValidRenewalCode(String code) {
        if (code == null || code.length() != 4) {
            return false;
        }

        return code.charAt(0) == 'R'
            && Character.isDigit(code.charAt(1))
            && Character.isDigit(code.charAt(2))
            && Character.isUpperCase(code.charAt(3));
    }

    // Count members enrolled
    public static int getMembersEnrolled() {
        return memberCounter - 100;
    }

    // Display member information
    public void displayInfo() {
        System.out.println(
            "General Member | Books Borrowed: " + booksBorrowed
        );
    }
}
