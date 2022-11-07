package abstractFactory;

/* ***************************** Abstract Factory design pattern *****************************
 * Lets you produce families of related objects without specifying their concrete classes.
 * 
 * PROS:
 * - You can be sure that the products you’re getting from a factory are compatible with each other.
 * - You avoid tight coupling between concrete products and client code.
 * - Single Responsibility Principle. You can extract the product creation code into one place, making the code easier to support.
 * - Open/Closed Principle. You can introduce new variants of products without breaking existing client code.
 * 
 * CONS: 
 * - The code may become more complicated than it should be, since a lot of new interfaces and classes are introduced along with the pattern.
 */

public class Main {
    public static void main(String[] args) {
        EnemyShipBuilding makeUFOS = new UFOEnemyShipBuilding();

        EnemyShip theGrunt = makeUFOS.orderTheShip("UFO");
        System.out.println(theGrunt + "\n");

        EnemyShip theBoss = makeUFOS.orderTheShip("UFO BOSS");
        System.out.println(theBoss + "\n");
    }
}
