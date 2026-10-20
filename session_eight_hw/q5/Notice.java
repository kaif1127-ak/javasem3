
import java.util.Set;
import java.util.HashSet;

public class Notice {
    private String title;
    private Set<String> targetDepartments;

    public Notice(String title, Set<String> targetDepartments) {
        this.title = title;
        this.targetDepartments = targetDepartments == null
                ? new HashSet<>()
                : new HashSet<>(targetDepartments);
    }

    public String getTitle() {
        return title;
    }

    public Set<String> getTargetDepartments() {
        return targetDepartments;
    }

    public boolean isValid() {
        return title != null && !title.trim().isEmpty()
                && !targetDepartments.isEmpty();
    }
}
