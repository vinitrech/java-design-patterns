package behavioral.iterator;

/* ***************************** Iterator design pattern *****************************
 * Lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.).
 * 
 * PROS:
 * - Single Responsibility Principle. You can clean up the client code and the collections by extracting bulky traversal algorithms into separate classes.
 * - Open/Closed Principle. You can implement new types of collections and iterators and pass them to existing code without breaking anything.
 * - You can iterate over the same collection in parallel because each iterator object contains its own iteration state.
 * - For the same reason, you can delay an iteration and continue it when needed.
 * 
 * CONS: 
 * - Applying the pattern can be an overkill if your app only works with simple collections.
 * - Using an iterator may be less efficient than going through elements of some specialized collections directly.
 */

public class Main {
    public static void main(String[] args) {
        SongsOfThe70s songs70 = new SongsOfThe70s();
        SongsOfThe80s songs80 = new SongsOfThe80s();
        SongsOfThe90s songs90 = new SongsOfThe90s();

        DiscJockey madMike = new DiscJockey(songs70, songs80, songs90);

        madMike.showTheSongs();
    }
}
