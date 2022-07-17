package jlearning.mutithreadingl.actions;

public class Main {
    static void testSleep() {
        // static method
        // pause the current thread and does not release any locks
        // thread wake up after a specified time interval
        // unless it's interrupt
        new Thread(() -> {
            try {
                System.out.println("I am sleeping");
                Thread.sleep(100);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        });
    }

    static void testYield() {
        // static
        // make thread to ready state
        // which yield cpu to
        // let other threads compete for it
        new Thread(() -> {
            Thread.yield();
        });
    }

    static void join() {
        // static
        // make control to the joined thread,
        // pause current thread until
        // the joined thread ends
        Thread t1 = new Thread(() -> {
            System.out.println("I am t1");
        });
        Thread t2 = new Thread(() -> {
            try {
                t1.join();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        });
        t2.start();
    }

    public static void main(String[] args) {

    }
}
