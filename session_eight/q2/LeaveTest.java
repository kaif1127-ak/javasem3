
public class LeaveTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Arun", "Permanent");
        Employee e2 = new Employee("Priya", "Contract");

        LeaveRequest r1 = new LeaveRequest(e1, 3);
        LeaveRequest r2 = new LeaveRequest(e2, 2);

        r1.display();
        r1.approve();
        r1.reject();
        r1.display();

        System.out.println();

        r2.display();
        r2.reject();
        r2.display();
    }
}
