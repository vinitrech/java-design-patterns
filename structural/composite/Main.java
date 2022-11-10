package structural.composite;

/* ***************************** Composite design pattern *****************************
 * Lets you compose objects into tree structures and then work with these structures as if they were individual objects.
 * 
 * PROS:
 * - You can work with complex tree structures more conveniently: use polymorphism and recursion to your advantage.
 * - Open/Closed Principle. You can introduce new element types into the app without breaking the existing code, which now works with the object tree.
 * 
 * CONS: 
 * - It might be difficult to provide a common interface for classes whose functionality differs too much. In certain scenarios, you’d need to overgeneralize the component interface, making it harder to comprehend.
 */

public class Main {
    public static void main(String[] args) {
        SongComponent industrialMusic = new SongGroup("Industrial", "Industrial music");
        SongComponent heavyMetalMusic = new SongGroup("Heavy Metal", "Heavy Metal music");
        SongComponent dubstepMusic = new SongGroup("Dubstep", "Dubstep music"); //version of industrialMusic

        SongComponent everySong = new SongGroup("Song List", "Every song available!");
        industrialMusic.add(dubstepMusic);
        everySong.add(industrialMusic);
        everySong.add(heavyMetalMusic);
        everySong.add(dubstepMusic);

        DiscJockey crazyLarry = new DiscJockey(everySong);

        crazyLarry.getSongList();
    }
}
