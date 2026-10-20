
public class EmailChannel implements NotificationChannel {

    @Override
    public void send(Student student, Notice notice) {
        System.out.println("[Email -> " + student.getName()
                + "] " + notice.getTitle() + ".");
    }
}
