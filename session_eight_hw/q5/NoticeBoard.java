
import java.util.ArrayList;
import java.util.List;

public class NoticeBoard {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void postNotice(Notice notice) {
        if (notice == null || !notice.isValid()) {
            System.out.println(
                "Cannot post notice: A title and at least one target department are required."
            );
            return;
        }

        System.out.println("Notice '" + notice.getTitle()
                + "' posted to " + notice.getTargetDepartments() + ".");

        for (Student student : students) {
            if (notice.getTargetDepartments()
                    .contains(student.getDepartment())) {

                for (NotificationChannel channel : student.getChannels()) {
                    channel.send(student, notice);
                }
            }
        }

        System.out.println();
    }
}
