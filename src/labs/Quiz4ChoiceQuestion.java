package labs;

public class Quiz4ChoiceQuestion extends QuizQuestion{
    private String choiceA;
    private String choiceB;
    private String choiceC;
    private String choiceD;


    public Quiz4ChoiceQuestion (String question, String choiceA, String choiceB,
                                String choiceC, String choiceD, String answer) {
        super(question, answer);
        this.choiceA = choiceA;
        this.choiceB = choiceB;
        this.choiceC = choiceC;
        this.choiceD = choiceD;
    }

    // because Quiz4ChoiceQuestion is a child of QuizQuestion, Quiz4ChoiceQuestion
    // also has the display() method but displays the question value from
    // the Quiz4ChoiceQuestion constructor
}
