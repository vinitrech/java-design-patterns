package behavioral.state;

/* ***************************** State design pattern *****************************
 * Lets an object alter its behavior when its internal state changes. It appears as if the object changed its class.
 * 
 * PROS:
 * - Single Responsibility Principle. Organize the code related to particular states into separate classes.
 * - Open/Closed Principle. Introduce new states without changing existing state classes or the context.
 * - Simplify the code of the context by eliminating bulky state machine conditionals.
 * 
 * CONS: 
 * - Applying the pattern can be overkill if a state machine has only a few states or rarely changes.
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
    }
}
