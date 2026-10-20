
import java.time.LocalDate;

public class CodingAssignment extends Assignment {

    public CodingAssignment(String title, int maxMarks, LocalDate dueDate) {
        super(title, maxMarks, dueDate);
    }

    @Override
    public double getPenaltyRate() {
        return 0.10;
    }
}
