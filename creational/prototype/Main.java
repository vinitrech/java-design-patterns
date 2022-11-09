package creational.prototype;

/* ***************************** Prototype design pattern *****************************
 * Lets you copy existing objects without making your code dependent on their classes.
 * 
 * PROS:
 * - You can clone objects without coupling to their concrete classes.
 * - You can get rid of repeated initialization code in favor of cloning pre-built prototypes.
 * - You can produce complex objects more conveniently.
 * - You get an alternative to inheritance when dealing with configuration presets for complex objects.
 * 
 * CONS: 
 * - Cloning complex objects that have circular references might be very tricky.
 */

public class Main {

    public static void main(String[] args) {
        CloneFactory factory = new CloneFactory();
        Sheep sally = new Sheep();
        Sheep clonedSheep = (Sheep) factory.getClone(sally);

        System.out.println(sally);
        System.out.println(clonedSheep);
    }
}
