public class Item {
        private int id;
        private String name;
        private int quantity;
        private double price;

        // Constructor
        public Item(int id, String name, int quantity, double price) {
            this.id = id;
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }

        // Getters
        public int getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public int getQuantity() {
            return quantity;
        }
        public double getPrice() {
            return price;
        }

        // Setters
        public void setName(String name) {
            this.name = name;
        }
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
        public void setPrice(double price) {
            this.price = price;
        }

        // Display method
        public void displayItem() {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Quantity: " + quantity);
            System.out.println("Price: " + price);
        }
    }


