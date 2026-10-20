
public class AppChannel implements NotificationChannel {

    @Override
    public void send(Student student, Notice notice) {
        System.out.println("[App -> " + student.getName()
                + "] " + notice.getTitle() + ".");
    }
}
