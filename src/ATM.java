public class ATM {
        private double balance;

        // Constructor: sets initial balance
        public ATM(double balance) {
            this.balance = balance;
        }

        // Deposit money
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Invalid deposit amount!");
            }
        }

        // Withdraw money
        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid withdrawal amount!");
            }
            else if (amount > balance) {
                System.out.println("Insufficient funds!");
            }
            else {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            }
        }

        // Check balance
        public void checkBalance() {
            System.out.println("Current Balance: " + balance);
        }
    }



