import java.util.ArrayList;

public class Account {
    private String userId;
    private String userPin;
    private double balance;
    private ArrayList<String> transactionHistory;

    public Account(String userId, String userPin, double balance) {
        this.userId = userId;
        this.userPin = userPin;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
        addTransaction("Account created with balance: $" + balance);
    }

    public String getUserId() { return userId; }

    public boolean validatePin(String enteredPin) {
        return this.userPin.equals(enteredPin);
    }

    public double getBalance() { return balance; }

    public void deposit(double amount) {
        balance += amount;
        addTransaction("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        balance -= amount;
        addTransaction("Withdrew: $" + amount);
    }

    public void addTransaction(String message) {
        transactionHistory.add(message);
    }

    public void printHistory() {
        System.out.println("\n--- Transaction History ---");
        for (String record : transactionHistory) {
            System.out.println(record);
        }
        System.out.println("---------------------------");
    }
}