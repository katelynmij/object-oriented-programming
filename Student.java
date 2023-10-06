import java.util.ArrayList;
import java.util.HashMap;
public class Student {
    private int id;
    HashMap<Integer, ArrayList<String>> studentAnswer = new HashMap<Integer, ArrayList<String>>();

    public Student(int id) {
        this.id = id;
    }

    public void setID(int setID) {
        this.id = setID;
    }

    public int getID() {
        return id;
    }

    public void setStudentAnswer(int currentID, ArrayList<String> currentAnswer) {
        studentAnswer.put(currentID, currentAnswer);
    }

    public ArrayList<String> getStudentAnswer(int studentID) {
        ArrayList<String> answer = studentAnswer.get(studentID);
        return answer;
    }
}