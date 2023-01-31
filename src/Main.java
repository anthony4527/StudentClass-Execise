package src;

public class Main {
    public static void main(String[] args) {
        // School can run this to init a student record //
        try {
            Student student1 = new Student("John", 1, 'C');
            // teacher can input grade
            student1.setGrade('D');
            if (student1.upgrade() == 1) {
                System.out.println("Student " + student1.getName() + " is now upgraded to " + student1.getGrade());
            } else
                System.out.println("Student " + student1.getName() + "cannot be upgraded more");
        } catch (IllegalArgumentException msg) {
            System.out.println(msg);
        }

        try {
            Student student2 = new Student("Nancy", 3, 'C');
            // teacher can input grade
            student2.setGrade('A');
            if (student2.downgrade() == 1) {
                System.out.println("Student " + student2.getName() + " is now downgraded to " + student2.getGrade());
            } else
                System.out.println("Student " + student2.getName() + "cannot be further downgraded");

        } catch (IllegalArgumentException msg) {
            System.out.println(msg);
        }

    }
}
