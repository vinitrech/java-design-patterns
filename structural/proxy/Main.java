package structural.proxy;

/* ***************************** Proxy design pattern *****************************
 * Lets you provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.
 * 
 * PROS:
 * - You can control the service object without clients knowing about it.
 * - You can manage the lifecycle of the service object when clients don’t care about it.
 * - The proxy works even if the service object isn’t ready or is not available.
 * - Open/Closed Principle. You can introduce new proxies without changing the service or clients.
 * 
 * CONS: 
 * - The code may become more complicated since you need to introduce a lot of new classes.
 * - The response from the service might get delayed.
 */

public class Main {
    public static void main(String[] args) {
        
       ATMMachine machine = new ATMMachine();

       machine.insertCard();
       machine.ejectCard();
       machine.insertCard();
       machine.insertPin(1234);
       machine.requestCash(2000);
       machine.insertCard();
       machine.insertPin(1234);

       GetATMData atmProxy = new ATMProxy();

       System.out.println("\nCurrent ATM state");

       System.out.println(atmProxy.getATMData());
       System.out.println(atmProxy.getCashIn());
    }
}
