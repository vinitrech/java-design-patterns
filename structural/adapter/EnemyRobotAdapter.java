package structural.adapter;

public class EnemyRobotAdapter implements EnemyAttacker{

    EnemyRobot robot = null;

    public EnemyRobotAdapter(EnemyRobot robot){
        this.robot = robot;
    }

    @Override
    public void assignDriver(String driver) {
        robot.reactToHuman(driver);
    }

    @Override
    public void driveForward() {
        robot.walksForward();
        
    }

    @Override
    public void fireWeapon() {
        robot.smashWithHand();
        
    }
    
}
