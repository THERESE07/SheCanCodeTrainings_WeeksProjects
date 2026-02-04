public class Item {
        // ATTRIBUTES
        public String name;
        public int quantity;
        public double price;

        // CONSTRUCTOR
        public Item(String name, int quantity, double price) {
            if (quantity < 0) quantity = 0;
            if (price < 0) price = 0;

            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }

        // METHOD: Add stock
        public void addStock(int amount) {
            if (amount > 0) {
                quantity += amount;
                System.out.println("Added " + amount + " units to " + name);
            } else {
                System.out.println("Error: Cannot add negative or zero stock.");
            }
        }

        // METHOD: Remove stock
        public void removeStock(int amount) {
            if (amount <= 0) {
                System.out.println("Error: Invalid removal amount!");
                return;
            }

            if (amount > quantity) {
                System.out.println("Error: Removal exceeds stock! Setting quantity to 0.");
                quantity = 0;
            } else {
                quantity -= amount;
                System.out.println("Removed " + amount + " units from " + name);
            }
        }

        // METHOD: get total value
        public double getValue() {
            return quantity * price;
        }

        // METHOD: display details
        public void displayItem() {
            System.out.println("Item: " + name +
                    ", Quantity: " + quantity +
                    ", Price: $" + price +
                    ", Value: $" + getValue());
        }
    }

