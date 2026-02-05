public class GradeManager {

    // Print all grades
    public void printGrades(int[] grades) {
        System.out.println("Grades:");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();
    }

    // Sort grades in ascending order
    public void sortGrades(int[] grades) {
        for (int i = 0; i < grades.length - 1; i++) {
            for (int j = 0; j < grades.length - 1 - i; j++) {
                if (grades[j] > grades[j + 1]) {
                    int temp = grades[j];
                    grades[j] = grades[j + 1];
                    grades[j + 1] = temp;
                }
            }
        }
    }

    // Search for a grade and return its index
    public int searchGrade(int[] grades, int target) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == target) {
                return i;
            }
        }
        return -1; // not found
    }

    // Get a grade safely with exception handling
    public int getGrade(int[] grades, int index) {
        try {
            return grades[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index!");
            return -1; // fallback value
        }
    }
}
