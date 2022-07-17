package jlearning.mutithreadingl.sychronizer.violatilel;

import java.util.*;

public class Atomic {
    volatile int count = 0;

    void addCount() {
        for (int i = 0; i < 10000; ++i) {
            count++;
        }
    }

    void addCountSyn() {
        for (int i = 0; i < 10000; ++i) {
            synchronized (this) {
                // lock fining
                count++;
            }
        }
    }

    public static void main(String[] args) {
        Atomic t = new Atomic();
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            threads.add(new Thread(t::addCount, "thread-" + i));
        }
        threads.forEach((o) -> o.start());
        threads.forEach((o) -> {
            try {
                o.join();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        });
        System.out.println(t.count);
        // not 100000 cause count++ is not atomic
        // violatile cannot make it atomic
    }
}
