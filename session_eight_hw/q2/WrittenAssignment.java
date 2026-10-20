
import java.time.LocalDate;

public class WrittenAssignment extends Assignment {

    public WrittenAssignment(String title, int maxMarks, LocalDate dueDate) {
        super(title, maxMarks, dueDate);
    }

    @Override
    public double getPenaltyRate() {
        return 0.20;
    }
}
