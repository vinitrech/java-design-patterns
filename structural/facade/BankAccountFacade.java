package structural.facade;

public class BankAccountFacade {
    private int accountNumber;
    private int securityCode;

    AccountNumberCheck accountChecker;
    SecurityCodeCheck securityCodeChecker;
    FundsCheck fundsCheck;
    WelcomeBank bankWelcome;

    public BankAccountFacade(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;

        bankWelcome = new WelcomeBank();
        accountChecker = new AccountNumberCheck();
        securityCodeChecker = new SecurityCodeCheck();
        fundsCheck = new FundsCheck();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withdraw(double amount) {
        if (accountChecker.accountActive(accountNumber) && securityCodeChecker.isValidCode(securityCode)
                && fundsCheck.haveEnoughMoney(amount)) {
            fundsCheck.haveEnoughMoney(amount);
            System.out.println("Transaction complete\n");
        } else {
            System.out.println("Transaction failed\n");
        }
    }

    public void deposit(double amount) {
        if (accountChecker.accountActive(accountNumber) && securityCodeChecker.isValidCode(securityCode)) {
            fundsCheck.makeDeposit(amount);

            System.out.println("Transaction complete\n");
        } else {
            System.out.println("Transaction failed\n");
        }
    }
}
