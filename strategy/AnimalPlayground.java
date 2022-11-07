package strategy;

/* ***************************** Strategy design pattern *****************************
 * Define a family of algorithms, encapsulate each one in a class, and make them interchangeable.
 * This pattern lets the algorithm vary independently from clients that use it.
 */

public class AnimalPlayground {
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
