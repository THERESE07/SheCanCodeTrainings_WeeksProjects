public class InventoryManager {

    public static void main(String[] args) {

        // Create items
        Item laptop = new Item("Laptop", 10, 999.99);
        Item mouse = new Item("Mouse", 50, 19.99);


        // LAPTOP OPERATIONS

        System.out.println("\n--- Laptop Initial State ---");
        laptop.displayItem();

        laptop.addStock(5);
        laptop.displayItem();

        laptop.removeStock(20); // exceeds
        laptop.displayItem();


        // MOUSE OPERATIONS

        System.out.println("\n--- Mouse Initial State ---");
        mouse.displayItem();

        mouse.removeStock(10);
        mouse.displayItem();

        mouse.addStock(15);
        mouse.displayItem();

        // LOOP
        System.out.println("\n--- Mouse Bulk Add ---");
        for (int i = 1; i <= 3; i++) {
            mouse.addStock(10);
            System.out.println("Batch " + i + ":");
            mouse.displayItem();
        }

        mouse.removeStock(70); // exceeds stock
        mouse.displayItem();
    }
}

