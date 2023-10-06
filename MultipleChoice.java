import java.util.ArrayList;
public class MultipleChoice implements Question {
    private String mulQuestion;
    private ArrayList<String> mulAnswer = new ArrayList<String>();
    private boolean isMultipleChoice = true;

    public MultipleChoice(String question, ArrayList<String> answers) {
        this.mulQuestion = question;
        this.mulAnswer = answers;
    }

    public void setQuestion(String question) {
        this.mulQuestion = new String(question);
    }

    public String getQuestion() {
        return mulQuestion;
    }

    public void setAnswer(ArrayList<String> answers) {
        this.mulAnswer = answers;
    }

    public ArrayList<String> getAnswer() {
        return mulAnswer;
    }

    public boolean isMultipleChoice() {
        return isMultipleChoice;
    }
}
