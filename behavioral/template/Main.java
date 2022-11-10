package behavioral.template;

/* ***************************** Template design pattern *****************************
 * Defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.
 * 
 * PROS:
 * - You can let clients override only certain parts of a large algorithm, making them less affected by changes that happen to other parts of the algorithm.
 * - You can pull the duplicate code into a superclass.
 * 
 * CONS: 
 * - Some clients may be limited by the provided skeleton of an algorithm.
 * - You might violate the Liskov Substitution Principle by suppressing a default step implementation via a subclass.
 * - Template methods tend to be harder to maintain the more steps they have.
 */

public class Main {
    public static void main(String[] args) {
        Hoagie basicHoagie = new ItalianHoagie();
        basicHoagie.makeSandwich();

        Hoagie veggieHoagie = new VeggieHoagie();
        veggieHoagie.makeSandwich();
    }
}
