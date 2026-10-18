
public class Problem1Test {
    public static void main(String[] args) {

        
        StudentMember s = new StudentMember("STU10", 3, "CSE");
        s.borrowBook();
        s.borrowBook();

        System.out.println("Books Borrowed: " + s.getBooksBorrowed());

        
        try {
            new LibraryMember("LB1", 3);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid ID rejected");
        }

        String[] ids = {"STU1", "LB1", "STU2", " ", "STU3"};
        System.out.println(LibraryMember.enrollBatch(ids, 3));
    }
}
