package structural.bridge;

/* ***************************** Bridge design pattern *****************************
 * Lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.
 * 
 * PROS:
 * - You can create platform-independent classes and apps.
 * - The client code works with high-level abstractions. It isn’t exposed to the platform details.
 * - Open/Closed Principle. You can introduce new abstractions and implementations independently from each other.
 * - Single Responsibility Principle. You can focus on high-level logic in the abstraction and on platform details in the implementation.
 * 
 * CONS: 
 * - You might make the code more complicated by applying the pattern to a highly cohesive class.
 */

public class Main {
    public static void main(String[] args) {
        RemoteButton theTV = new TVRemoteMute(new TVDevice(1,200));
        RemoteButton theTV2 = new TVRemotePause(new TVDevice(1,200));

        System.out.println("Test tv with mute");
        theTV.buttonFivePressed();
        theTV.buttonSixPressed();
        theTV.buttonNinePressed();

        System.out.println("Test tv with pause");
        theTV2.buttonFivePressed();
        theTV2.buttonSixPressed();
        theTV2.buttonNinePressed();
    }
}
