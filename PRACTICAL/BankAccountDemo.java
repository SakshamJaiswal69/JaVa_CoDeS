// File: BankAccountDemo.java

interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class SavingsAccount implements BankAccount {
    private double balance;

    SavingsAccount(double initialBalance) {
        balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount(1000.0);
        System.out.println("Initial Balance: " + acc.getBalance());

        acc.deposit(500.0);
        acc.withdraw(200.0);
        acc.withdraw(2000.0); // will show insufficient balance
    }
}
