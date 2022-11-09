package structural.facade;

/* ***************************** Facade design pattern *****************************
 * Provides a simplified interface to a library, a framework, or any other complex set of classes.
 * 
 * PROS:
 * - You can isolate your code from the complexity of a subsystem.
 * 
 * CONS: 
 * - A facade can become a god object coupled to all classes of an app.
 */

public class Main {
    public static void main(String[] args) {
        BankAccountFacade accessingBank = new BankAccountFacade(2204, 123456);

        accessingBank.withdraw(50.00);
        accessingBank.withdraw(500.00);
        accessingBank.deposit(300.00);
    }
}
