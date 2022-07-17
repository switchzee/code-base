package jlearning.mutithreadingl.sychronizer.Atomic;

import java.util.concurrent.atomic.*;
import java.util.*;

public class Main {
    // volatile + atomic
    AtomicInteger count = new AtomicInteger(0);

    void atomicAddCount() {
        for (int i = 0; i < 10000; ++i) {
            count.incrementAndGet(); // count++
        }
    }

    public static void main(String[] args) {
        Main t = new Main();
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            threads.add(new Thread(t::atomicAddCount, "thread-" + i));
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
        // 100000 cause atomicInteger count++ is atomic
    }
}
