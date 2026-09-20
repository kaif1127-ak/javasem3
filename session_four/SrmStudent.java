class StudentRecord {
    String name;

    static String collegeName;
    static String academicYear;

    static {
        collegeName = "SRM Institute of Science and Technology";
        academicYear = "2026-27";
        System.out.println("College info loaded");
    }

    StudentRecord(String name) {
        this.name = name;
    }

    void printRecord() {
        System.out.println("Student record created: " + name);
    }
}

public class SrmStudent {
    public static void main(String[] args) {

        String[] names = {
            "Ravi", "Meera", "Karthik", "Divya", "Anitha"
        };

        for (String name : names) {
            StudentRecord student = new StudentRecord(name);
            student.printRecord();
        }
    }
}
