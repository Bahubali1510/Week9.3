package automationtest.Polymerphism10;

public class CheckingAccount extends BankAccount{
    private double overdraftFee;

    public CheckingAccount(String accountNumber, double initialBalance, double overdraftFee) {
        super(accountNumber, initialBalance);
        this.overdraftFee = overdraftFee;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn from Checking Account: " + amount);
            } else {
                double overdraftAmount = amount - balance;
                balance = 0;
                System.out.println("Overdraft Fee Charged: " + overdraftFee);
                System.out.println("Withdrawn from Checking Account with overdraft: $" + amount);
            }
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }
}

