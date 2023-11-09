package automationtest.Inheritance3;

public class BankAccount {
    protected double balance;

    public BankAccount(double Initialbalance){
        Initialbalance=balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("This is valid deposit amount");
        } else {
            System.out.println("This is invalid deposit amount");
        }
    }

    public void withdraw(double amount){
            if (balance >=amount){
                balance-=amount;
            }else {
                System.out.println("Insufficient amount");
            }
        }
        public double getBalance(){
            return balance;
        }
    }

