package structural.adapter;

/* ***************************** Adapter design pattern *****************************
 * Allows objects with incompatible interfaces to collaborate.
 * 
 * PROS:
 * - Single Responsibility Principle. You can separate the interface or data conversion code from the primary business logic of the program.
 * - Open/Closed Principle. You can introduce new types of adapters into the program without breaking the existing client code, as long as they work with the adapters through the client interface.
 * 
 * CONS: 
 * - The overall complexity of the code increases because you need to introduce a set of new interfaces and classes. Sometimes it’s simpler just to change the service class so that it matches the rest of your code.
 */

public class Main {
    public static void main(String[] args) {
        EnemyTank tank = new EnemyTank();
        EnemyRobot robot = new EnemyRobot();
        EnemyAttacker robotAdapter = new EnemyRobotAdapter(robot);
        
        System.out.println("The robot");

        robot.reactToHuman("Human");
        robot.smashWithHand();
        robot.walksForward();


        System.out.println("\n The tank");

        tank.assignDriver("Driver");
        tank.driveForward();
        tank.fireWeapon();


        System.out.println("\n The adapter");

        robotAdapter.assignDriver("Human driver");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }
}
