import java.util.InputMismatchException;

public class CheckingAccount{
    
    private double balance;
    private String accountNumber;

    public CheckingAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new ArithmeticException("Please enter amount greater than 0");
        try {
            this.balance += amount;
        } catch (InputMismatchException e) {
            throw e;
        }
        System.out.printf("The balance after deposit is: $%.2f\n", this.getBalance());
    }

    public void withdraw(double amount) throws Exception{
        if (amount <= 0) throw new ArithmeticException("Please enter amount greater than 0");
        if (amount > this.getBalance()) {
            throw new InsufficientFundsException(amount-this.getBalance());
        }
        try {
            this.balance -= amount;
        } catch (InputMismatchException e) {
            throw e;
        }
        System.out.printf("The balance after withdraw is: $%.2f\n", this.getBalance());
    }

    public double getBalance() {
        return this.balance;
    }

    public String getNumber() {
        return this.accountNumber;
    }

}