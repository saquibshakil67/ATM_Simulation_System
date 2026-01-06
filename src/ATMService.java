public class ATMService {

    public void withdrawMoney(Account account, double amount) {
        if (amount <= 0) {
            System.out.println("Error: Amount must be positive!");
        }
        else if (account.getBalance() >= amount) {
            account.withdraw(amount);
            System.out.println("Success! Please collect your cash.");
        }
        else {
            System.out.println("Error: Insufficient Funds!");
        }
    }

    public void depositMoney(Account account, double amount) {
        if (amount > 0) {
            account.deposit(amount);
            System.out.println("Success! Amount deposited.");
        }
        else {
            System.out.println("Error: Can't deposit negative amount!");
        }
    }

    public void checkBalance(Account account) {
        System.out.println("Current Balance: $" + account.getBalance());
    }
}