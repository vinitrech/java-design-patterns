package behavioral.visitor;

public interface Visitable {
    public double accept(Visitor visitor);
}
