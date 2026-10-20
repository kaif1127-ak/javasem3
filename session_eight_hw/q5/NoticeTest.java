
import java.util.Arrays;
import java.util.Collections;

public class NoticeTest {
    public static void main(String[] args) {
        Student asha = new Student("Asha", "CSE");
        asha.addChannel(new EmailChannel());
        asha.addChannel(new AppChannel());

        Student ravi = new Student("Ravi", "ECE");
        ravi.addChannel(new SmsChannel());

        NoticeBoard board = new NoticeBoard();
        board.addStudent(asha);
        board.addStudent(ravi);

        Notice notice1 = new Notice(
                "Lab Closed Tomorrow",
                Collections.singleton("CSE")
        );
        board.postNotice(notice1);

        Notice notice2 = new Notice(
                "Fee Deadline Extended",
                Arrays.asList("CSE", "ECE").stream()
                        .collect(java.util.stream.Collectors.toSet())
        );
        board.postNotice(notice2);

        Notice invalidNotice = new Notice(
                "Sports Day",
                Collections.emptySet()
        );
        board.postNotice(invalidNotice);

        Notice noTitle = new Notice(
                " ",
                Collections.singleton("CSE")
        );
        board.postNotice(noTitle);
    }
}
