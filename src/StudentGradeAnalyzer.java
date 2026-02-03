public class StudentGradeAnalyzer {

    public static void main(String[] args) {

        // 1. Declare score variables
        double assignmentScore = 85;
        double midtermScore = 78;
        double finalExamScore = 92;

        // 2. Call method to calculate the average
        double average = calculateAverage(assignmentScore, midtermScore, finalExamScore);

        // 3. Call method to determine the grade
        String grade = determineGrade(average);

        // 4. Print results
        System.out.println("---- Student Grade Report ----");
        System.out.println("Assignment Score: " + assignmentScore);
        System.out.println("Midterm Score: " + midtermScore);
        System.out.println("Final Exam Score: " + finalExamScore);
        System.out.println("------------------------------");
        System.out.println("Average Score: " + average);
        System.out.println("Final Grade: " + grade);
    }

    // Method 1: Calculate average
    public static double calculateAverage(double score1, double score2, double score3) {
        double sum = score1 + score2 + score3;
        double average = sum / 3;
        return average;
    }

    // Method 2: Determine grade
    public static String determineGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

