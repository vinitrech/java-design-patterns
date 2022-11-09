package creational.factory;

import java.util.Scanner;

/* ***************************** Factory design pattern *****************************
 * Provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
 * 
 * PROS:
 * - You avoid tight coupling between the creator and the concrete products.
 * - Single Responsibility Principle. You can move the product creation code into one place in the program, making the code easier to support.
 * - Open/Closed Principle. You can introduce new types of products into the program without breaking existing client code.
 * 
 * CONS: 
 * - The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern. The best case scenario is when you’re introducing the pattern into an existing hierarchy of creator classes.
 */

public class Main {
    public static void main(String[] args) {
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("What type of ship? (U / R / B)");

            if (scanner.hasNextLine()) {
                String typeOfShip = scanner.nextLine();

                theEnemy = shipFactory.makeEnemyShip(typeOfShip);
            }
        } catch (Exception e) {
        }

        if (theEnemy != null) {
            doStuffEnemy(theEnemy);
        } else {
            System.out.println("Choose between U / R / B next time.");
        }
    }

    public static void doStuffEnemy(EnemyShip anEnemyShip) {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
