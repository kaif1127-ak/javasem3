
public class SmsChannel implements NotificationChannel {

    @Override
    public void send(Student student, Notice notice) {
        System.out.println("[SMS -> " + student.getName()
                + "] " + notice.getTitle() + ".");
    }
}
