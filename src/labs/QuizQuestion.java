package labs;

public class QuizQuestion {
    private String question;
    private String answer;
    private String response;

    public QuizQuestion(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String display() {
        return question;
    }

    public boolean isAnswerCorrect(String response) {
        this.response = response;
        if (answer.equals(response)) {
            return true;
        }
        return false;
    }
}
