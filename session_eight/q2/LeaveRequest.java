
public class LeaveRequest {
    private Employee employee;
    private int days;
    private String status;

    public LeaveRequest(Employee employee, int days) {
        this.employee = employee;
        this.days = days;
        this.status = "Pending";
    }

    public void approve() {
        if (status.equals("Pending")) {
            status = "Approved";
            System.out.println("Leave approved for " + employee.getName());
        } else {
            System.out.println("Request is already finalized.");
        }
    }

    public void reject() {
        if (status.equals("Pending")) {
            status = "Rejected";
            System.out.println("Leave rejected for " + employee.getName());
        } else {
            System.out.println("Request is already finalized.");
        }
    }

    public void display() {
        System.out.println(employee.getName() + " (" 
                + employee.getEmployeeType() + ") - "
                + days + " days - Status: " + status);
    }
}
