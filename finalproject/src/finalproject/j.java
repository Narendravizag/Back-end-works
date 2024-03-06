package finalproject;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Bank {
    private Map<String, User> users;

    public Bank() {
        this.users = new HashMap<>();
    }

    public void registerUser(String username, String password) {
        if (!users.containsKey(username)) {
            users.put(username, new User(username, password));
            System.out.println("Registration successful!");
        } else {
            System.out.println("Username already exists. Please choose another one.");
        }
    }

    public User loginUser(String username, String password) {
        if (users.containsKey(username)) {
            User user = users.get(username);
            if (user.getPassword().equals(password)) {
                System.out.println("Login successful!");
                return user;
            }
        }
        System.out.println("Invalid username or password. Please try again.");
        return null;
    }
}

class User {
    private String username;
    private String password;
    private double balance;
    private TransactionHistory transactionHistory;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.balance = 0.0;
        this.transactionHistory = new TransactionHistory();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.addTransaction("Deposit", amount);
        System.out.println("Deposit successful. New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactionHistory.addTransaction("Withdrawal", amount);
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void transfer(User recipient, double amount) {
        if (balance >= amount) {
            withdraw(amount);
            recipient.deposit(amount);
            System.out.println("Transfer successful.");
        } else {
            System.out.println("Insufficient funds for transfer.");
        }
    }

    public void viewTransactionHistory() {
        transactionHistory.displayHistory();
    }
}

class TransactionHistory {
    private StringBuilder history;

    public TransactionHistory() {
        this.history = new StringBuilder();
    }

    public void addTransaction(String type, double amount) {
        history.append(type).append(" $").append(amount).append("\n");
    }

    public void displayHistory() {
        System.out.println("Transaction History:");
        System.out.println(history.toString());
    }
}

public class j {
    private static Bank bank;

	public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nInternet Banking System");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String regUsername = scanner.next();
                    System.out.print("Enter password: ");
                    String regPassword = scanner.next();
                    bank.registerUser(regUsername, regPassword);
                    break;
                case 2:
                    System.out.print("Enter username: ");
                    String loginUsername = scanner.next();
                    System.out.print("Enter password: ");
                    String loginPassword = scanner.next();
                    User currentUser = bank.loginUser(loginUsername, loginPassword);
                    if (currentUser != null) {
                        performBankingOperations(currentUser, scanner);
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void performBankingOperations(User user, Scanner scanner) {
        while (true) {
            System.out.println("\nWelcome, " + user.getUsername() + "!");
            System.out.println("1. View Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
           
            System.out.println("5. View Transaction History");
            System.out.println("6. Logout");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: $" + user.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    user.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    user.withdraw(withdrawalAmount);
                    break;
               
                case 5:
                    user.viewTransactionHistory();
                    break;
                case 6:
                    System.out.println("Logging out. Goodbye, " + user.getUsername() + "!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
