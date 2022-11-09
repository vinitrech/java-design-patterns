package structural.facade;

public class FundsCheck {
    private double balance = 1000.00;

    public double getBalance() {
        return balance;
    }

    public void decreaseBalance(double withdraw) {
        balance -= withdraw;
    }

    public void increaseBalance(double deposit) {
        balance += deposit;
    }

    public boolean haveEnoughMoney(double withdraw) {
        if (withdraw > getBalance()) {
            System.out.println("Insufficient funds: " + getBalance());
            return false;
        }

        decreaseBalance(withdraw);
        System.out.println("Withdraw complete. Balance: " + getBalance());

        return true;
    }

    public void makeDeposit(double deposit) {
        increaseBalance(deposit);
        System.out.println("Deposit complete. Balance: " + getBalance());
    }
}
