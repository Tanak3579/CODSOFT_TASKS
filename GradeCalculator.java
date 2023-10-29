import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("NOTE: ENTER '5' IN NUMBER OF SUBJECTS!");
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        System.out.println("1. WEB DEVELOPMENT");
        System.out.println("2. JAVA PROGRAMMING");
        System.out.println("3. C PROGRAMMING");
        System.out.println("4. C# PROGRAMMING");
        System.out.println("5. PYTHON PROGRAMMING");
        

        
        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            int subjectMarks = scanner.nextInt();
            totalMarks += subjectMarks;
        }

        
        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;

        
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

                System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
