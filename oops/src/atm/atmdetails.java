package atm;
import java.util.Scanner;

class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}

class ATM {
    private Account account;

    public ATM(Account account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: $" + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposited $" + depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    if (account.withdraw(withdrawalAmount)) {
                        System.out.println("Withdrawn $" + withdrawalAmount);
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

public class atmdetails {
    public static void main(String[] args) {
        Account account = new Account(12345, 1000.0);
        ATM atm = new ATM(account);
        atm.run();
    }
}
