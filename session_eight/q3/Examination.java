
import java.util.ArrayList;
import java.util.List;

public class Examination {
    private String title;
    private List<Question> questions = new ArrayList<>();

    public Examination(String title) {
        this.title = title;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public String getTitle() {
        return title;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
