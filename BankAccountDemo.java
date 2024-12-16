import java.util.Scanner;

class Account {
    String customerName;
    String accountNumber;
    String accountType;
    double balance;

    public Account(String customerName, String accountNumber, String accountType, double initialBalance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully. Updated balance: " + balance);
    }

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully. Updated balance: " + balance);
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }
}

class Sav_acct extends Account {
    final double interestRate = 5.0; 

    public Sav_acct(String customerName, String accountNumber, double initialBalance) {
        super(customerName, accountNumber, "Savings", initialBalance);
    }

  
    public void computeInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest calculated: " + interest);
        deposit(interest);
    }
}

class Cur_acct extends Account {
    final double minimumBalance = 1000.0; 
    final double penalty = 100.0; 

    public Cur_acct(String customerName, String accountNumber, double initialBalance) {
        super(customerName, accountNumber, "Current", initialBalance);
    }

   
    public void checkMinimumBalance() {
        if (balance < minimumBalance) {
            System.out.println("Balance below minimum. Penalty of " + penalty + " imposed.");
            balance -= penalty;
        } else {
            System.out.println("Minimum balance requirement met.");
        }
        displayBalance();
    }

   
    public void withdraw(double amount) {
        super.withdraw(amount);
        checkMinimumBalance();
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Creating Savings Account...");
        Sav_acct savings = new Sav_acct("Alice", "SAV12345", 2000.0);
        savings.displayBalance();
        savings.deposit(500.0);
        savings.computeInterest();
        savings.withdraw(1000.0);

        System.out.println("\nCreating Current Account...");
        Cur_acct current = new Cur_acct("Bob", "CUR67890", 1500.0);
        current.displayBalance();
        current.deposit(500.0);
        current.withdraw(2000.0);
        current.withdraw(500.0);

        scanner.close();
    }
}
