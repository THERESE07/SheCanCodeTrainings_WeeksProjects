public class Inventory {
        private Item item;

        // Add item
        public void addItem(Item item) {
            this.item = item;
            System.out.println("Item added successfully!");
        }

        // Remove item
        public void removeItem() {
            if (item != null) {
                item = null;
                System.out.println("Item removed successfully!");
            } else {
                System.out.println("No item to remove.");
            }
        }

        // Update item
        public void updateItem(int newQuantity, double newPrice) {
            if (item != null) {
                item.setQuantity(newQuantity);
                item.setPrice(newPrice);
                System.out.println("Item updated successfully!");
            } else {
                System.out.println("No item to update.");
            }
        }

        // Display item
        public void displayItem() {
            if (item != null) {
                System.out.println("\n--- Current Item in Inventory ---");
                item.displayItem();
            } else {
                System.out.println("Inventory is empty.");
            }
        }
    }
