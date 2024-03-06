package exception;
//A class that represents a bank account
class BankAccount1 {
// The balance of the account
private int balance;

// A constructor that initializes the balance
public BankAccount1(int balance) {
   this.balance = balance;
}

// A method that returns the balance of the account
public int getBalance() {
   return balance;
}

// A synchronized method that deposits an amount to the account
public synchronized void deposit(int amount) {
   // Check if the amount is positive
   if (amount > 0) {
       // Update the balance
       balance += amount;
       // Print a message
       System.out.println(Thread.currentThread().getName() + " deposited " + amount + " to the account. New balance: " + balance);
   }
}
}

//A class that implements Runnable interface and performs deposit operations
class DepositTask implements Runnable {
// The bank account to deposit to
private BankAccount1 account;
// The number of times to deposit
private int count;
// The amount to deposit each time
private int amount;

// A constructor that initializes the fields
public DepositTask(BankAccount1 account, int count, int amount) {
   this.account = account;
   this.count = count;
   this.amount = amount;
}

// The run method that executes the deposit operations
public void run() {
   // Loop for the given number of times
   for (int i = 0; i < count; i++) {
       // Deposit the given amount to the account
       account.deposit(amount);
       // Sleep for a random time between 0 and 100 milliseconds
       try {
           Thread.sleep((int) (Math.random() * 12));
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
   }
}
}

//A class that contains the main method
public class Bankaccount {
// The main method that creates and starts the threads
public static void main(String[] args) {
   // Create a bank account with an initial balance of 1000
   BankAccount1 account = new BankAccount1(10000);
   // Print the initial balance
   System.out.println("Initial balance: " + account.getBalance());
   // Create two deposit tasks with different parameters
   DepositTask task1 = new DepositTask(account, 2, 1000); // Deposit 100 ten times
   DepositTask task2 = new DepositTask(account, 1, 2000); // Deposit 200 five times
   // Create two threads with the deposit tasks and assign names
   Thread thread1 = new Thread(task1, "Thread1");
   Thread thread2 = new Thread(task2, "Thread2");
   // Start the threads
   thread1.start();
   thread2.start();
   // Wait for the threads to finish
   try {
       thread1.join();
       thread2.join();
   } catch (InterruptedException e) {
       e.printStackTrace();
   }
   // Print the final balance
   System.out.println("Final balance: " + account.getBalance());
}
}
