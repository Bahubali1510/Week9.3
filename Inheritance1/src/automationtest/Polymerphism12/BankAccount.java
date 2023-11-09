package automationtest.Polymerphism12;

public class BankAccount {

        private String accountNumber;
        private double balance;

        // Constructor
        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        // Getter method for accountNumber
        public String getAccountNumber() {
            return accountNumber;
        }

        // Setter method for accountNumber
        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        // Getter method for balance
        public double getBalance() {
            return balance;
        }

        // Setter method for balance
        public void setBalance(double balance) {
            this.balance = balance;
        }

        public static void main(String[] args) {
            BankAccount account = new BankAccount("12345", 1000.00);

            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: $" + account.getBalance());

            // Modify account details using setters
            account.setAccountNumber("54321");
            account.setBalance(1500.00);

            System.out.println("Updated Account Number: " + account.getAccountNumber());
            System.out.println("Updated Balance: " + account.getBalance());
        }
    }


