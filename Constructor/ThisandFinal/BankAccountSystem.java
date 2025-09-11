import java.util.Scanner;

class BankAccount {
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;  // To keep track of total accounts
    
    private String accountHolderName;
    private final int accountNumber; // Final field: can't be changed after assignment
    private double balance;
    
    // Constructor
    public BankAccount(String accountHolderName, int accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName; // resolving ambiguity with 'this'
        this.accountNumber = accountNumber;         // final variable assignment
        this.balance = initialBalance;
        totalAccounts++;
    }
    
    // Static method to get total accounts
    public static void getTotalAccounts() {
        System.out.println("Total accounts in " + bankName + ": " + totalAccounts);
    }
    
    // Display account details with instanceof check
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("\nAccount Details:");
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid account object.");
        }
    }
    
    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }
    
    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount);
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create 2 accounts as example
        BankAccount account1 = new BankAccount("Alice", 1001, 5000);
        BankAccount account2 = new BankAccount("Bob", 1002, 3000);

        // Display account details
        account1.displayAccountDetails();
        account2.displayAccountDetails();

        // Perform deposit and withdrawal
        account1.deposit(1500);
        account1.withdraw(2000);
        
        account1.displayAccountDetails();

        // Display total accounts
        BankAccount.getTotalAccounts();

        sc.close();
    }
}
