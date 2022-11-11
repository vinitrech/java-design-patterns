package behavioral.visitor;

import java.text.DecimalFormat;

public class TaxHolidayVisitor implements Visitor {

    DecimalFormat format = new DecimalFormat("#.##");

    public TaxHolidayVisitor(){};

    @Override
    public double visit(Liquor item) {
        System.out.println("Liquor item: Price with tax");
        return Double.parseDouble(format.format(item.getPrice() * .18) + item.getPrice());
    }

    @Override
    public double visit(Tobacco item) {
        System.out.println("Tobacco item: Price with tax");
        return Double.parseDouble(format.format(item.getPrice() * .32) + item.getPrice());
    }

    @Override
    public double visit(Necessity item) {
        System.out.println("Necessity item: Price with tax");
        return Double.parseDouble(format.format(item.getPrice() * 0) + item.getPrice());
    }
}
