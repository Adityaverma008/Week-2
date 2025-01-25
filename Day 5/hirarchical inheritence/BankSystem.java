// Base class
class BankAccount {
    protected String accountNumber;
    protected double balance;

    // Constructor for base class
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display basic account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    private int depositTerm;

    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Deposit Term: " + depositTerm + " years");
    }
}

// Main class to test the implementation
public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 5000.00, 4.5);
        CheckingAccount checking = new CheckingAccount("CA456", 2000.00, 1000.00);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD789", 10000.00, 5);

        System.out.println("--- Savings Account Details ---");
        savings.displayAccountDetails();
        savings.displayAccountType();

        System.out.println("\n--- Checking Account Details ---");
        checking.displayAccountDetails();
        checking.displayAccountType();

        System.out.println("\n--- Fixed Deposit Account Details ---");
        fixedDeposit.displayAccountDetails();
        fixedDeposit.displayAccountType();
    }
}
