import java.util.ArrayList;
import java.util.Collections;
import java.util.IllegalFormatWidthException;
class SimulationDriver {
    private static MultipleChoice q1;
    private static SingleChoice q2;
    private static VotingService question1, question2;
    private static String currentQuestion;
    private static ChoiceDisplay mulChoices, oneChoice;
    private static ArrayList<String> currentAnswerList = new ArrayList<String>();
    private static ArrayList<String> studentAnswer = new ArrayList<String>();
    final static int TOTAL_STUDENTS = (int)(Math.random() * 50) + 1;
    private static Student[] student = new Student[TOTAL_STUDENTS];

    public static void main(String[] args) {
        System.out.println("number of students participating: " + student.length);
        student = createStudentID(student.length);

        currentQuestion = new String ("skibidi toilet rizz gyatt");
        currentAnswerList.add("A");
        currentAnswerList.add("B");
        currentAnswerList.add("C");
        currentAnswerList.add("D");

        q1 = new MultipleChoice(currentQuestion, currentAnswerList);
        System.out.println("Question: " + q1.getQuestion());
        mulChoices = new ChoiceDisplay("skibidi", "toilet", "rizz", "gyatt");
        mulChoices.printChoices();

        int numChosenAnswer;
        Collections.shuffle(currentAnswerList);
        for (int i = 0; i < student.length; i++) {
            numChosenAnswer = (int)(Math.random() * currentAnswerList.size() + 1);
            for (int j = 0; j < numChosenAnswer; j++) {
                studentAnswer.add(currentAnswerList.get(j));
            }
            student[i].setStudentAnswer(i, studentAnswer);
        }

        question1 = new VotingService(q1.isMultipleChoice(), studentAnswer);
        question1.calculateScore(studentAnswer);
        question1.printAnswer();

        currentQuestion = "ohio grimace shake?";
        q2 = new SingleChoice(currentQuestion, currentAnswerList);
        System.out.println("Question: " + q2.getQuestion());
        oneChoice = new ChoiceDisplay("1", "2", "3", "4");
        oneChoice.printChoices();
        studentAnswer.clear();

        Collections.shuffle(currentAnswerList);
        for (int i = 0; i < student.length; i++) {
            int oneAnswer = (int)(Math.random() * currentAnswerList.size());
            studentAnswer.add(i, currentAnswerList.get(oneAnswer));
            student[i].setStudentAnswer(i, studentAnswer);

        }
        question2 = new VotingService(q2.isMultipleChoice(), studentAnswer);
        question2.calculateScore(studentAnswer);
        question2.printAnswer();
    }

    public static Student[] createStudentID(int numStudents) {
        for (int i = 0; i < numStudents; i++) {
            student[i] = new Student(i + 1);
        }
        return student;
    }
}

