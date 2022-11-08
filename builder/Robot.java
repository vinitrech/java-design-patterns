package builder;

public class Robot implements RobotPlan {

    private String head;
    private String torso;
    private String arms;
    private String legs;

    @Override
    public void setRobotHead(String head) {
        this.head = head;
    }

    public String getRobotHead() {
        return head;
    }

    @Override
    public void setRobotTorso(String torso) {
        this.torso = torso;
    }

    public String getRobotTorso() {
        return torso;
    }

    @Override
    public void setRobotArms(String arms) {
        this.arms = arms;
    }

    public String getRobotArms() {
        return arms;
    }

    @Override
    public void setRobotLegs(String legs) {
        this.legs = legs;
    }

    public String getRobotLegs() {
        return legs;
    }
}
