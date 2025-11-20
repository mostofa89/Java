import java.util.*;

// Base class
class BankAccount {
    protected int accountNumber;
    protected String accountHolder;
    protected double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    public void deposit(double amount){
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }


    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }


    public void checkBalance(){
        System.out.println("Balance: " + balance);
    }



    public String toString(){
        return accountNumber + ": " + accountHolder + " - Balance: " + balance;
    }
}

// Savings account subclass
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate){
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }


    public void addInterest(){
        double interest = balance * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }
}

// Current account subclass
class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, String accountHolder, double balance, double overdraftLimit){
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount){
        if(balance + overdraftLimit >= amount){
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Exceeded overdraft limit!");
        }
    }
}


// Bank manager class
class Bank {
    private List<BankAccount> accounts;

    public Bank(){
        accounts = new ArrayList<>();
    }


    public void addAccount(BankAccount account){
        accounts.add(account);
    }

    public void showAccounts(){
        System.out.println("Bank Accounts:");
        for(BankAccount acc : accounts){
            System.out.println(acc);
        }
    }


    public BankAccount findAccount(int accountNumber){
        for(BankAccount acc : accounts){
            if(acc.accountNumber == accountNumber) return acc;
        }
        return null;
    }
}


// Main class
public class BankAccaountManagement {
    public static void main(String[] args){
        Bank bank = new Bank();

        SavingsAccount sa = new SavingsAccount(101, "Alice", 5000, 5);
        CurrentAccount ca = new CurrentAccount(102, "Bob", 2000, 1000);

        bank.addAccount(sa);
        bank.addAccount(ca);

        bank.showAccounts();

        System.out.println("\n--- Transactions ---");
        sa.deposit(1000);
        sa.addInterest();

        ca.withdraw(2500);
        ca.withdraw(1000);

        System.out.println("\n--- Final Status ---");
        bank.showAccounts();
    }
}

