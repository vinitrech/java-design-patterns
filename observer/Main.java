package observer;

/* ***************************** Observer design pattern *****************************
 * Lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they're observing.
 * 
 * PROS:
 * - Open/Closed Principle. You can introduce new subscriber classes without having to change the publisher’s code (and vice versa if there’s a publisher interface).
 * - You can establish relations between objects at runtime.
 * 
 * CONS: 
 * - Subscribers are notified in random order.
 */

public class Main {
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setApplePrice(198.00);
        stockGrabber.setGooglePrice(199.00);
    }
}
