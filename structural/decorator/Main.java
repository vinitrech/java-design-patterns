package structural.decorator;

/* ***************************** Decorator design pattern *****************************
 * Lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.
 * 
 * PROS:
 * - You can extend an object’s behavior without making a new subclass.
 * - You can add or remove responsibilities from an object at runtime.
 * - You can combine several behaviors by wrapping an object into multiple decorators.
 * - Single Responsibility Principle. You can divide a monolithic class that implements many possible variants of behavior into several smaller classes.
 * 
 * CONS: 
 * - It’s hard to remove a specific wrapper from the wrappers stack.
 * - It’s hard to implement a decorator in such a way that its behavior doesn’t depend on the order in the decorators stack.
 * - The initial configuration code of layers might look pretty ugly.
 */

public class Main {
    public static void main(String[] args) {
        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println(basicPizza.getDescription());
        System.out.println(basicPizza.getCost());
    }
}
