package strategy;

public class Bird extends Animal {
    Bird() {
        super();
        flyingType = new ItFlies();
    }
}
