public class ChoiceDisplay {
    private String choiceA;
    private String choiceB;
    private String choiceC;
    private String choiceD;

    public ChoiceDisplay(String a, String b, String c, String d) {
        this.choiceA = a;
        this.choiceB = b;
        this.choiceC = c;
        this.choiceD = d;
    }

    public void printChoices() {
        System.out.println("A. " + choiceA + "\n" + "B. " + choiceB + "\n" + "C. " + choiceC + "\n" + "D. " + choiceD + "\n");
    }
}
