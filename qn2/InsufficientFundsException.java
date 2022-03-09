public class InsufficientFundsException extends Exception {

    private double amount;

    public InsufficientFundsException(double amount) {
        super(String.format("Sorry, but your amount is short by: $%.2f", amount));
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }
}
