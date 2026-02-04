public class Main {
    public static void main(String[] args) {

        // Create ATM object with initial balance
        ATM myATM = new ATM(100); // starting with 100

        System.out.println("=== Personal ATM Simulator ===");

        // Simulate transactions
        myATM.checkBalance();   // Check initial balance
        myATM.deposit(50);      // Deposit 50
        myATM.withdraw(30);     // Withdraw 30
        myATM.withdraw(200);    // Trying to withdraw more than balance
        myATM.checkBalance();   // Final balance
    }
}
