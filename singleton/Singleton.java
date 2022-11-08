package singleton;

public class Singleton {
    private static Singleton firstInstance = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (firstInstance == null) {
            firstInstance = new Singleton();
        }

        return firstInstance;
    }
}
