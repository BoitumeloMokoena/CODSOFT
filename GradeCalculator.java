import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking marks obtained in each subject
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        double[] marksList = new double[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            marksList[i] = scanner.nextDouble();
        }

        // Calculate total marks
        double totalMarks = 0;
        for (double marks : marksList) {
            totalMarks += marks;
        }

        // Calculate average percentage
        double averagePercentage = totalMarks / numSubjects;

        // Calculate grade
        String grade = calculateGrade(averagePercentage);

        // Display results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
    }

    private static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90 && averagePercentage <= 100) {
            return "A OUTSTANDING RESULTS! \uD83D\uDCAF";
        } else if (averagePercentage >= 80 && averagePercentage < 90) {
            return "B VERY GOOD, PASSED! \uD83D\uDD25";
        } else if (averagePercentage >= 70 && averagePercentage < 80) {
            return "C PASSED! \uD83E\uDD73";
        } else if (averagePercentage >= 60 && averagePercentage < 70) {
            return "D PASSED BY CHANCE, WORK HARDER NEXT TIME! \uD83E\uDD2D";
        } else {
            return "F OOPS, FAILED! \uD83D\uDEA9";
        }
    }
}
