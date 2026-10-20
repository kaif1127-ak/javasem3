
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Submission {
    private Student student;
    private Assignment assignment;
    private LocalDate submissionDate;
    private String status;
    private double finalMarks;

    public Submission(Student student, Assignment assignment,
                      LocalDate submissionDate) {
        this.student = student;
        this.assignment = assignment;
        this.submissionDate = submissionDate;
        this.status = "Submitted";
    }

    public void grade(double awardedMarks) {
        if (!status.equals("Submitted")) {
            System.out.println("Cannot grade this submission again.");
            return;
        }

        if (awardedMarks < 0 || awardedMarks > assignment.getMaxMarks()) {
            System.out.println("Invalid marks.");
            return;
        }

        long lateDays = Math.max(0,
            ChronoUnit.DAYS.between(
                assignment.getDueDate(), submissionDate
            )
        );

        double penalty = assignment.getPenaltyRate() * lateDays;
        finalMarks = awardedMarks * (1 - penalty);
        status = "Graded";

        System.out.printf("%s graded: %.0f/%d",
            student.getName(), finalMarks, assignment.getMaxMarks());

        if (lateDays > 0) {
            System.out.printf(" after %.0f%% late penalty", penalty * 100);
        }

        System.out.println(". Status: " + status + ".");
    }

    public String getStatus() {
        return status;
    }

    public void showSubmission() {
        long lateDays = Math.max(0,
            ChronoUnit.DAYS.between(
                assignment.getDueDate(), submissionDate
            )
        );

        System.out.printf("%s's submission for '%s' received (%s days late). Status: %s.%n",
            student.getName(), assignment.getTitle(), lateDays, status);
    }

    public void resubmit() {
        if (status.equals("Graded")) {
            System.out.println("Cannot resubmit: '" +
                assignment.getTitle() + "' has already been graded.");
        } else {
            System.out.println("Resubmission allowed before grading.");
        }
    }
}
