package behavioral.chainOfResponsability;

/* ***************************** Chain of Responsability design pattern *****************************
 * Lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.
 * 
 * PROS:
 * - You can control the order of request handling.
 * - Single Responsibility Principle. You can decouple classes that invoke operations from classes that perform operations.
 * - Open/Closed Principle. You can introduce new handlers into the app without breaking the existing client code.
 * 
 * CONS: 
 * - Some requests may end up unhandled.
 */

public class Main {
    public static void main(String[] args) {
        Chain sum = new AddNumbers();
        Chain sub = new SubtractNumbers();
        Chain multiply = new MultiplyNumbers();
        Chain divide = new DivideNumbers();

        sum.setNextChain(sub);
        sub.setNextChain(multiply);
        multiply.setNextChain(divide);

        Numbers request = new Numbers(1, 2, "add");
        Numbers request2 = new Numbers(1, 2, "subtract");
        Numbers request3 = new Numbers(1, 2, "multiply");
        Numbers request4 = new Numbers(1, 2, "divide");

        sum.calculate(request);
        sum.calculate(request2);
        sum.calculate(request3);
        sum.calculate(request4);
    }
}
