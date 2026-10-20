
public class WashingMachine {
    private String machineId;
    private WashCycle currentWash;
    private Student currentStudent;

    public WashingMachine(String machineId) {
        this.machineId = machineId;
    }

    public boolean isFree() {
        return currentWash == null;
    }

    public void startWash(Student student, WashCycle wash) {
        if (!isFree()) {
            System.out.println("Machine " + machineId + " is currently busy.");
            return;
        }

        currentStudent = student;
        currentWash = wash;

        System.out.printf(
            "%s wash started on %s for %s (%d min). Charge: ₹%.2f.%n",
            wash.getType(), machineId, student.getName(),
            wash.getDuration(), wash.getCharge()
        );
    }

    public void completeWash() {
        if (isFree()) {
            System.out.println("Machine " + machineId + " is already free.");
            return;
        }

        System.out.println(machineId + " cycle completed.");
        currentWash = null;
        currentStudent = null;
        System.out.println(machineId + " is now free.");
    }
}
