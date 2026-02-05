public class Main {
    public static void main(String[] args) {

        GradeManager manager = new GradeManager();

        // Test array (as required)
        int[] grades = {85, 90, 78, 92, 88};

        // 1. Print original grades
        System.out.println("Original grades:");
        manager.printGrades(grades);

        // 2. Sort grades
        manager.sortGrades(grades);
        System.out.println("Sorted grades:");
        manager.printGrades(grades);

        // 3. Search for an existing grade
        int indexFound = manager.searchGrade(grades, 90);
        System.out.println("Index of grade 90: " + indexFound);

        // 4. Search for a grade that doesn't exist
        int indexNotFound = manager.searchGrade(grades, 100);
        System.out.println("Index of grade 100: " + indexNotFound);

        // 5. Test accessing valid index
        System.out.println("Grade at index 2: " + manager.getGrade(grades, 2));

        // 6. Test accessing invalid index
        System.out.println("Grade at index 10: " + manager.getGrade(grades, 10));
    }
}
