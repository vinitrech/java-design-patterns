package strategy;

public class ItCantFly implements Flies {
    @Override
    public String fly() {
        return "Can't fly";
    }
}
