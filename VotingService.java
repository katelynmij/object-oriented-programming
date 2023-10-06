import java.util.ArrayList;
public class VotingService {
    private boolean isMultipleChoice;
    private ArrayList<String> studentAnswer;
    private int A = 0, B = 0, C = 0, D = 0;

    public VotingService(boolean questionType, ArrayList<String> answers) {
        this.isMultipleChoice = questionType;
        this.studentAnswer = answers;
    }

    public void calculateScore(ArrayList<String> studentAnswer) {
        for (int i = 0; i < studentAnswer.size(); i++) {
            String answer = studentAnswer.get(i);
            if (answer.equals("A")) {
                A++;
            } else if (answer.equals("B")) {
                B++;
            } else if (answer.equals("C")) {
                C++;
            } else if (answer.equals("D")) {
                D++;
            } else {
                System.out.println("invalid input.");
            }
        }
    }

    public void printAnswer() {
        System.out.println("Chosen Answers:  \nA: " + A + "\nB: " + B + "\nC: " + C + "\nD: " + D);

        A = 0;
        B = 0;
        C = 0;
        D = 0;
    }

    public void revote(ArrayList<String> newAnswer) {
        calculateScore(newAnswer);
        printAnswer();
    }
}
