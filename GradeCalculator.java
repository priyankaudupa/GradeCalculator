import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TOTAL_SUB = 5;
        final int MAX_MARKS = 100;

        System.out.println("Enter marks obtained in each subject (out of 100):");

        int totalMarks = 0;
        int marks;

        for (int subject = 1; subject <= TOTAL_SUB; subject++) {
            System.out.print("Subject " + subject + ": ");
            marks = scanner.nextInt();

            if (marks < 0 || marks > MAX_MARKS) {
                System.out.println("Invalid input. Marks should be between 0 and 100.");
                subject--;
            } else {
                totalMarks += marks;
            }
        }

        double averagePercentage = (double) totalMarks / (TOTAL_SUB * MAX_MARKS) * 100;

        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
