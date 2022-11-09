package behavioral.strategy;

/* ***************************** Strategy design pattern *****************************
 * Lets you define a family of algorithms, put each of them into a separate class, 
 * and make their objects interchangeable.
 * 
 * PROS:
 * - You can swap algorithms used inside an object at runtime.
 * - You can isolate the implementation details of an algorithm from the code that uses it.
 * - You can replace inheritance with composition.
 * - Open/Closed Principle. You can introduce new strategies without having to change the context.
 * 
 * CONS: 
 * - If you only have a couple of algorithms and they rarely change, there’s no real reason to overcomplicate the program with new classes and interfaces that come along with the pattern.
 * - Clients must be aware of the differences between strategies to be able to select a proper one.
 * - A lot of modern programming languages have functional type support that lets you implement different versions of an algorithm inside a set of anonymous functions. Then you could use these functions exactly as you’d have used the strategy objects, but without bloating your code with extra classes and interfaces.
 */

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();

        System.out.println("Dog trying to fly: " + dog.tryToFly());
        System.out.println("Bird trying to fly: " + bird.tryToFly());

        bird.setFlyingType(new ItCantFly());
        dog.setFlyingType(new ItFlies());

        System.out.println("Dog trying to fly: " + dog.tryToFly());
        System.out.println("Bird trying to fly: " + bird.tryToFly());
    }
}
