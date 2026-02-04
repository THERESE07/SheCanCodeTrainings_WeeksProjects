import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== INVENTORY MENU ===");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Item");
            System.out.println("4. Display Item");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();

                    System.out.print("Enter Name: ");
                    scanner.nextLine(); // clear newline
                    String name = scanner.nextLine();

                    System.out.print("Enter Quantity: ");
                    int qty = scanner.nextInt();

                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();

                    Item item = new Item(id, name, qty, price);
                    inventory.addItem(item);
                    break;

                case 2:
                    inventory.removeItem();
                    break;

                case 3:
                    System.out.print("Enter new Quantity: ");
                    int newQty = scanner.nextInt();

                    System.out.print("Enter new Price: ");
                    double newPrice = scanner.nextDouble();

                    inventory.updateItem(newQty, newPrice);
                    break;

                case 4:
                    inventory.displayItem();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

