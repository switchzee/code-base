package jlearning.mutithreadingl.startathread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

// 3 ways to create a thread
// implements runnable overwrite .run
class MyRunnable implements Runnable {
    @Override
    public void run() {
        // overwrite
        System.out.print("I am runnable");
    }
}

// implements callable overwrite callable
class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.print("I am callable");
        return "I am done";
    }
}

// extends a thread overwrite .start()
class MyThread extends Thread {
    @Override
    public synchronized void start() {
        System.out.println("I am extends thread");
    }
}

public class Main {
    public static void main(String[] args) {
        // use Thread to execute runnable
        new Thread(new MyRunnable()).start();
        // use subclass of Thread directly
        new MyThread().start();
        // use FutureTask to execute callable
        new FutureTask<>(new MyCallable());
        Math.log(2);
    }
}
