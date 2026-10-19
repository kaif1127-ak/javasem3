
public class MCQQuestion extends Question {
    public MCQQuestion(String text, String correctAnswer) {
        super(text, correctAnswer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
    }
}
