
public class Problem2Test {
    public static String classifyGeneration(LibraryMember member) {
        if (member instanceof HonorsStudentMember) {
            return "Multilevel descendant (3 generations deep)";
        } else if (member instanceof FacultyMember) {
            return "Hierarchical sibling (independent branch)";
        } else if (member instanceof StudentMember) {
            return "Student member (second generation)";
        } else {
            return "General member (base generation)";
        }
    }

    public static int getTotalBooksBorrowed(LibraryMember[] members) {
        int total = 0;

        for (LibraryMember member : members) {
            total += member.getBooksBorrowed();
        }

        return total;
    }

    public static void main(String[] args) {
        LibraryMember general = new LibraryMember("GEN01", 3);
        StudentMember student = new StudentMember("STU02", 3, "CSE");
        HonorsStudentMember honors =
                new HonorsStudentMember("STU03", 3, "ECE", 2);
        FacultyMember faculty =
                new FacultyMember("FAC04", 5, "Physics");

        student.borrowBook();
        student.borrowBook();

        honors.borrowBook();

        faculty.borrowBook();
        faculty.borrowBook();
        faculty.borrowBook();

        System.out.println("--- Membership Details ---");
        general.displayInfo();
        student.displayInfo();
        honors.displayInfo();
        faculty.displayInfo();

        System.out.println("\n--- Classification ---");
        System.out.println(classifyGeneration(honors));
        System.out.println(classifyGeneration(faculty));

        LibraryMember[] members = {student, honors, faculty};

        System.out.println("\nTotal Books Borrowed: "
                + getTotalBooksBorrowed(members));
    }
}
