import java.util.scanner:

public class StudentGradeCalulator {

    public static void main(String[] args) {
        Scanner scanner + new Scanner(System.in):
        System.out.println ("Enter the number of courses: ");
        int numCourses = scanner.nextInt();

        double[] grades = new double[numCourses];
        int[] credits = new int[numCourses];

        for (int i = 0; i < numcourses; i++) {
            system.out.println("Enter the grade for courses" + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            system.out.println("Enter the credit hours for course" + (i + 1) + ": ");
            credits[i] = scanner.nextInt();
        }

        double weightedSum = 0;
        int totalcredits = 0;

        for (int i = 0 < numCourses; i++) {
            double weightedGrade = grades[i]  * credits[i];
            weightedSum += weightedGrade;
            totalCredits += credits[i];
        }

        double gpa = weightedSum / totalCredits;
        System.out.println("Your GPA is: " + gpa);
    }
}
