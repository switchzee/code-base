package jlearning.design.singleton;

/* Singleton: 
   only an instance of this kind of class
   could exist in memory, even if there are mutiple new 
*/
// hangry singleton: singleton instantiate immediately after this class is loaded into memory.
// thread safe: because JVM only load every class once
class HangrySingleton {
    private static final HangrySingleton singleton = new HangrySingleton();

    // avoid new outside this class
    private HangrySingleton() {
    };

    // always get the same instance
    public static HangrySingleton getInstance() {
        return singleton;
    }
}

// lazy singleton: not create object until no choice
// thread safe if you make it, unsafe by default
class LazySingleton {
    private static volatile LazySingleton INSTANCE; // 1. thread visible

    private LazySingleton() {
    }

    static class LazySingletonHolder {
        public static final LazySingleton INSTANCE = new LazySingleton();
    }

    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            // 2 threads may both be here
            synchronized (LazySingleton.class) {
                if (INSTANCE == null) { // double check
                    INSTANCE = new LazySingleton();
                }
            }
        }
        return INSTANCE;
    }

    // static class get loaded once this method is called
    public static synchronized LazySingleton getInstance2() {
        return LazySingletonHolder.INSTANCE;
    }
}

public class Main {
    public static void main(String[] args) {
        // get singleton
        for (int i = 0; i < 100; ++i) {
            new Thread(() -> {
                System.out.println(LazySingleton.getInstance().hashCode());
            }).start();
        }
    }
}
