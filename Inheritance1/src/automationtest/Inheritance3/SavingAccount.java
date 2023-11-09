package automationtest.Inheritance3;

public class SavingAccount extends BankAccount {
    public SavingAccount(double initialbalance) {
        super(initialbalance);
        initialbalance = balance;
    }

    public void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
        } else
            System.out.println("withdral not allowed");
    }
}
