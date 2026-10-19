
import java.util.HashMap;
import java.util.Map;

public class Attempt {
    private Student student;
    private Examination examination;
    private Map<Question, String> answers = new HashMap<>();
    private boolean submitted = false;

    public Attempt(Student student, Examination examination) {
        this.student = student;
        this.examination = examination;
    }

    public void answerQuestion(Question question, String answer) {
        if (submitted) {
            System.out.println("Cannot change answers after submission.");
        } else if (examination.getQuestions().contains(question)) {
            answers.put(question, answer);
            System.out.println("Answer recorded.");
        } else {
            System.out.println("Question does not belong to this exam.");
        }
    }

    public void submit() {
        if (submitted) {
            System.out.println("Attempt already submitted.");
            return;
        }

        submitted = true;
        System.out.println(student.getName() + " submitted "
                + examination.getTitle());
        System.out.println("Score: " + calculateScore() + "/"
                + examination.getQuestions().size());
    }

    private int calculateScore() {
        int score = 0;

        for (Question question : examination.getQuestions()) {
            String answer = answers.get(question);

            if (answer != null && question.checkAnswer(answer)) {
                score++;
            }
        }

        return score;
    }

    public boolean isSubmitted() {
        return submitted;
    }

    public Student getStudent() {
        return student;
    }

    public Examination getExamination() {
        return examination;
    }
}

