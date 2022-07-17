package jlearning.mutithreadingl.sychronizer.synchronizedl;

import java.util.concurrent.TimeUnit;

public class Main {
    // 1. synchronized: atomic, transparent, reenterent
    private void objLock() {
        // sychronized: lock class or object
        // lock object: this means a Main object
        synchronized (this) {
            System.out.println("I am object locked");
        }
    }

    // 2. lock class: lock on static method
    private synchronized static void classLock1() {
        System.out.println("I am class locked(static method)");
    }

    // lock class: lock on Class object
    private synchronized void classLock2() {
        synchronized (Main.class) {
            System.out.println("I am class locked");
        }
    }

    // reenterent: acquire-locked thread can enter another sychronized function
    // without reqcauire the lock, otherwise it will be dead locked.
    private synchronized void reenterent() {
        try { // aleady acquired lock
            TimeUnit.SECONDS.sleep(100);
            objLock(); // reenterent allowed
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    private synchronized void lockException() {
        System.out.println(Thread.currentThread().getName() + " start");
        int count = 0;
        while (true) {
            count++;
            System.out.println(Thread.currentThread().getName() + " count" + count);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            if (count == 5) {
                int i = 1 / 0; // Exception: free lock, other thread might come in
                System.out.println("unlocked");
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Thread thread = new Thread(() -> {
            System.out.print("hello");
        });
    }
}
