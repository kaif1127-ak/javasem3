
public abstract class Question {
    protected String text;
    protected String correctAnswer;

    public Question(String text, String correctAnswer) {
        this.text = text;
        this.correctAnswer = correctAnswer;
    }

    public abstract boolean checkAnswer(String answer);

    public String getText() {
        return text;
    }
}
