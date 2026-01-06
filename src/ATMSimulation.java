import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATMService atmService = new ATMService();

        Account userAccount = new Account("saquib67", "1234", 1000.00);

        System.out.println("Welcome to Java ATM!");
        System.out.print("Enter User ID: ");
        String enteredId = scanner.nextLine();

        System.out.print("Enter PIN: ");
        String enteredPin = scanner.nextLine();

        if (enteredId.equals(userAccount.getUserId()) && userAccount.validatePin(enteredPin)) {
            System.out.println("Login Successful!");

            boolean exit = false;
            while (!exit) {
                System.out.println("\n--- ATM MENU ---");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Mini Statement");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        atmService.checkBalance(userAccount);
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double depAmount = scanner.nextDouble();
                        atmService.depositMoney(userAccount, depAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        double withAmount = scanner.nextDouble();
                        atmService.withdrawMoney(userAccount, withAmount);
                        break;
                    case 4:
                        userAccount.printHistory();
                        break;
                    case 5:
                        exit = true;
                        System.out.println("Thank you for using Java ATM. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }
        else {
            System.out.println("Invalid Credentials! Access Denied.");
        }
        scanner.close();
    }
}
