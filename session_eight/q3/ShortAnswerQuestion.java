
public class ShortAnswerQuestion extends Question {
    public ShortAnswerQuestion(String text, String correctAnswer) {
        super(text, correctAnswer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        return correctAnswer.equalsIgnoreCase(answer.trim());
    }
}
