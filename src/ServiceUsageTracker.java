import java.util.Scanner;

public class ServiceUsageTracker {

    // Initial system values
    static double totalUnits = 100;
    static double usedUnits = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("\n=== Secure Service Usage Tracker ===");
            System.out.println("1. Consume Service Units");
            System.out.println("2. Check Remaining Units");
            System.out.println("3. View Usage Percentage");
            System.out.println("4. Reset Usage");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter units to consume: ");
                    double units = input.nextDouble();
                    consumeUnits(units);
                    break;

                case 2:
                    checkRemainingUnits();
                    break;

                case 3:
                    calculateUsagePercentage();
                    break;

                case 4:
                    usedUnits = 0;
                    System.out.println("Usage has been reset successfully.");
                    break;

                case 0:
                    System.out.println("Exiting the system...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (choice != 0);

        input.close();
    }


    // Method: Consume Units

    public static void consumeUnits(double units) {
        double remainingUnits = totalUnits - usedUnits;

        // Validation: non-negative
        if (units < 0) {
            System.out.println("Error: Units cannot be negative.");
            return;
        }

        // Validation: cannot consume more than available
        if (units > remainingUnits) {
            System.out.println("Error: You cannot consume more than the remaining units.");
            return;
        }

        // Update usage
        usedUnits += units;
        System.out.println(units + " units consumed successfully.");
    }

    // Method: Check Remaining Units

    public static void checkRemainingUnits() {
        double remainingUnits = totalUnits - usedUnits;
        System.out.println("Remaining Units: " + remainingUnits);
    }


    // Method: Calculate Usage Percentage

    public static void calculateUsagePercentage() {
        // Prevent division by zero
        if (totalUnits == 0) {
            System.out.println("Error: Total units cannot be zero.");
            return;
        }

        double percentage = (usedUnits / totalUnits) * 100;
        System.out.printf("Usage Percentage: %.2f%%\n", percentage);
    }
}


