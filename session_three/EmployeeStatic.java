class EmployeeInfo {
    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    EmployeeInfo(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class EmployeeStatic {
    public static void main(String[] args) {

        EmployeeInfo emp1 = new EmployeeInfo("Ravi", 50000);
        EmployeeInfo emp2 = new EmployeeInfo("Anitha", 55000);
        EmployeeInfo emp3 = new EmployeeInfo("Karthik", 60000);

        EmployeeInfo.printCompanyInfo();
    }
}