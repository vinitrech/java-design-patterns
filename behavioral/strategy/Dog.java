package behavioral.strategy;

public class Dog extends Animal {
    Dog() {
        super();
        flyingType = new ItCantFly();
    }
}
