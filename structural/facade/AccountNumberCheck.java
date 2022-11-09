package structural.facade;

public class AccountNumberCheck {
    private int accountNumber = 2204;

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean accountActive(int accountNumber){
        if(accountNumber == getAccountNumber()){
            return true;
        }
        return false;
    }
}
