package Electic_bill;
import java.util.Scanner;

class ATM {
    private double balance;

    public ATM(double initialBalance) {
        balance = initialBalance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            sendAlert("Withdrawal of $" + amount + " successful. Remaining balance: $" + balance);
        } else {
            sendAlert("Insufficient funds or invalid amount.");
        }
    }

    private void sendAlert(String message) {
        // Simulate sending alerts via phone and email
        sendSMS(message);
        sendEmail(message);
    }

    private void sendSMS(String message) {
        // Code to send SMS alert
        System.out.println("SMS Alert: " + message);
    }

    private void sendEmail(String message) {
        // Code to send email alert
        System.out.println("Email Alert: " + message);
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial balance: $");
        double initialBalance = scanner.nextDouble();

        ATM atm = new ATM(initialBalance);

        while (true) {
            System.out.println("Current balance: $" + atm.getBalance());
            System.out.print("Enter withdrawal amount (or 0 to exit): $");
            double withdrawalAmount = scanner.nextDouble();

            if (withdrawalAmount == 0) {
                break;
            }

            atm.withdraw(withdrawalAmount);
        }

        System.out.println("Thank you for using the ATM.");
    }
}
