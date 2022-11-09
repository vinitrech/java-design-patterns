package structural.adapter;

public class EnemyRobot {

    public void smashWithHand(){
        System.out.println("EnemyRobot Smash with hands damage: 15");
    }

    public void walksForward(){
        System.out.println("EnemyRobot Walks forward");
    }

    public void reactToHuman(String driver){
        System.out.println("EnemyRobot tramps on " + driver);
    }
}
