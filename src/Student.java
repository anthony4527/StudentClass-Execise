package src;

public class Student {
    private final String name;
    private char grade;
    private int group;

    private String secretNickName;

    private final String ALLGRADES = "ABCDEF";
    private final int NOFGROUPS = 5;

    protected char getGrade() {
        return grade;
    }

    protected int getGroup() {
        return group;
    }
    public Student(String name, int group, char grade ) throws IllegalArgumentException {
        if ((group > NOFGROUPS) || (ALLGRADES.indexOf(grade) == -1)) {
            throw new IllegalArgumentException("student parameters not valid");
        }
        this.name = name;
        this.group = group;
        this.grade = grade;
        this.secretNickName = "MySecretNickName";
    }

    protected String getName() { return name; }

    protected void setGrade(char inputGrade) {grade = inputGrade; }

    protected int upgrade(){
        int idx = ALLGRADES.indexOf(grade);
        if ( idx > 0 ) {
            grade = ALLGRADES.charAt(idx-1);
            return 1;
        } else return -1;
    }
    protected  int downgrade(){
        int idx = ALLGRADES.indexOf(grade);
        if ( idx < (ALLGRADES.length() - 1)) {
            grade = ALLGRADES.charAt(idx+1);
            return 1;
        } else return -1;
    }


}
