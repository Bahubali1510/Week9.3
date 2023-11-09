package automationtest.Polymerphism10;

public class SavingAccount extends BankAccount{
    private double withdrawalLimit;

    public SavingAccount(String accountNumber, double initialBalance, double withdrawalLimit) {
        super(accountNumber, initialBalance);
        this.withdrawalLimit = withdrawalLimit;
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance && amount <= withdrawalLimit) {
            balance -= amount;
            System.out.println("Withdrawn from Savings Account: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount, insufficient balance, or exceeded withdrawal limit for Savings Account");
        }
    }
}

