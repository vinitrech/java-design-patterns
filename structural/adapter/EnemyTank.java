package structural.adapter;


public class EnemyTank implements EnemyAttacker{

    @Override
    public void assignDriver(String driver) {
        System.out.println("Driver name: " + driver);
        
    }

    @Override
    public void driveForward() {
        System.out.println("Enemy tank driving forward");
        
    }

    @Override
    public void fireWeapon() {
        System.out.println("Enemy tank damage: 10");
    }
    
}
