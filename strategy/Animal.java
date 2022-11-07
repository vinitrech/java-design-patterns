package strategy;

public class Animal {
    Flies flyingType;

    public String tryToFly() {
        return flyingType.fly();
    }

    public void setFlyingType(Flies type) {
        flyingType = type;
    }
}
