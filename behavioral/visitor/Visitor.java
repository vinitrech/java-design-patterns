package behavioral.visitor;

public interface Visitor {
    public double visit(Liquor item);
    public double visit(Tobacco item);
    public double visit(Necessity item);
}
