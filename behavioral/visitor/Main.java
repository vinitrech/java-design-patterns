package behavioral.visitor;

/* ***************************** Visitor design pattern *****************************
 * Lets you separate algorithms from the objects on which they operate.
 *
 * PROS:
 * - Open/Closed Principle. You can introduce a new behavior that can work with objects of different classes without changing these classes.
 * - Single Responsibility Principle. You can move multiple versions of the same behavior into the same class.
 * - A visitor object can accumulate some useful information while working with various objects. This might be handy when you want to traverse some complex object structure, such as an object tree, and apply the visitor to each object of this structure.
 *
 * CONS:
 * - You need to update all visitors each time a class gets added to or removed from the element hierarchy.
 * - Visitors might lack the necessary access to the private fields and methods of the elements that they’re supposed to work with.
 */

public class Main {
    public static void main(String[] args) {
        TaxVisitor taxCalculator = new TaxVisitor();
        TaxHolidayVisitor taxHolidayVisitor = new TaxHolidayVisitor();

        Necessity milk = new Necessity(3.45);
        Liquor vodka = new Liquor(7.99);
        Tobacco cigar = new Tobacco(9.99);

        System.out.println(milk.accept(taxCalculator));
        System.out.println(vodka.accept(taxCalculator));
        System.out.println(cigar.accept(taxCalculator)+"\n");

        System.out.println(milk.accept(taxHolidayVisitor));
        System.out.println(vodka.accept(taxHolidayVisitor));
        System.out.println(cigar.accept(taxHolidayVisitor));

    }
}
