
public class ExamTest {
    public static void main(String[] args) {

        Student student = new Student("Kaif");

        Examination exam = new Examination("Java Exam");

        Question q1 = new MCQQuestion(
                "Which language uses JVM?", "Java");

        Question q2 = new TrueFalseQuestion(
                "Java supports inheritance?", "True");

        Question q3 = new ShortAnswerQuestion(
                "Keyword used to inherit a class?", "extends");

        exam.addQuestion(q1);
        exam.addQuestion(q2);
        exam.addQuestion(q3);

        Attempt attempt = new Attempt(student, exam);

        attempt.answerQuestion(q1, "Java");
        attempt.answerQuestion(q2, "True");
        attempt.answerQuestion(q3, "extends");

        attempt.submit();

        attempt.answerQuestion(q1, "Python");
        attempt.submit();
    }
}
