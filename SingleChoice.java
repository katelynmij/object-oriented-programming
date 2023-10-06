import java.util.ArrayList;

public class SingleChoice implements Question{
    private String oneQuestion;
    private ArrayList<String> oneAnswer;
    private boolean isMultipleChoice = false;

    public SingleChoice(String question, ArrayList<String> answer) {
        this.oneQuestion = question;
        this.oneAnswer = answer;
    }

    public void setQuestion(String question) {
        this.oneQuestion = question;
    }

    public String getQuestion() {
        return oneQuestion;
    }

    public void setAnswer(ArrayList<String> answer) {
        this.oneAnswer = answer;
    }

    public ArrayList<String> getAnswer() {
        return oneAnswer;
    }

    public boolean isMultipleChoice() {
        return isMultipleChoice();
    }

}
