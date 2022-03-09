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
        this.balance += amount;
        System.out.printf("The balance after deposit is: $%.2f\n", this.getBalance());
    }

    public void withdraw(double amount) throws Exception{
        if (amount > this.getBalance()) {
            throw new InsufficientFundsException(amount-this.getBalance());
        }
        this.balance -= amount;
        System.out.printf("The balance after withdraw is: $%.2f\n", this.getBalance());
    }

    public double getBalance() {
        return this.balance;
    }

    public String getNumber() {
        return this.accountNumber;
    }

}