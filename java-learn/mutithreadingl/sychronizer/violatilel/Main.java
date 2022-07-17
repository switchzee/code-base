package jlearning.mutithreadingl.sychronizer.violatilel;

import java.util.concurrent.TimeUnit;

class LazySingleton {
    private static volatile LazySingleton INSTANCE; // 1. thread visible

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (LazySingleton.class) {
                if (INSTANCE == null) { // double check: prevent INSTANCE invisible
                    // even this should use volatile on INSTANCE, why?
                    // prevent instruction reorder
                    INSTANCE = new LazySingleton();
                }
            }
        }
        return INSTANCE;
    }

}

public class Main {
    // volatile(changeable):
    // 1. make variable thread-visiable,
    // 2. prevent instruction reorder
    public volatile boolean running = true;

    private void game() {
        while (running) {
            System.out.println("the game is running");
        }
        System.out.println("the game ends");
    }

    public static void main(String[] args) {
        Main main = new Main();
        new Thread(main::game, "t1").start(); // lambda expression-method reference
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        main.running = false;
    }
}
