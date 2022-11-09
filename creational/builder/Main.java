package creational.builder;

/* ***************************** Builder design pattern *****************************
 * Lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.
 * 
 * PROS:
 * - You can construct objects step-by-step, defer construction steps or run steps recursively.
 * - You can reuse the same construction code when building various representations of products.
 * - Single Responsibility Principle. You can isolate complex construction code from the business logic of the product.
 * 
 * CONS: 
 * - The overall complexity of the code increases since the pattern requires creating multiple new classes.
 */

public class Main {

    public static void main(String[] args) {
        RobotBuilder oldStyleRobot = new OldRobotBuilder();
        RobotEngineer engineer = new RobotEngineer(oldStyleRobot);

        engineer.makeRobot();

        Robot firstRobot = engineer.getRobot();

        System.out.println(firstRobot.getRobotHead());
        System.out.println(firstRobot.getRobotArms());
        System.out.println(firstRobot.getRobotTorso());
        System.out.println(firstRobot.getRobotLegs());
    }
}
