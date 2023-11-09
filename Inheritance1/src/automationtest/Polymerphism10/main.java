package automationtest.Polymerphism10;

public class main {

        public static void main(String[] args) {
            SavingAccount savingsAccount = new SavingAccount("SAV123", 1000.0, 500.0);
            CheckingAccount checkingAccount = new CheckingAccount("CHK456", 1000.0, 25.0);

            savingsAccount.displayBalance();
            savingsAccount.deposit(200.0);
            savingsAccount.withdraw(300.0);
            savingsAccount.displayBalance();

            checkingAccount.displayBalance();
            checkingAccount.deposit(200.0);
            checkingAccount.withdraw(1500.0);
            checkingAccount.displayBalance();
        }
    }

