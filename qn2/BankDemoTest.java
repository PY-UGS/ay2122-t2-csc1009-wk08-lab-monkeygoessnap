import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args) {
        CheckingAccount newAcc = new CheckingAccount(0, "POSB-9191");
        System.out.print("Please enter deposit amount: ");
        Scanner sc = new Scanner(System.in);
        newAcc.deposit(sc.nextDouble());
        try {
            System.out.print("Please enter withdrawal amount: ");
            newAcc.withdraw(sc.nextDouble());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
