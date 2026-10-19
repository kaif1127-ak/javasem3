
public class TrueFalseQuestion extends Question {
    public TrueFalseQuestion(String text, String correctAnswer) {
        super(text, correctAnswer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
    }
}
