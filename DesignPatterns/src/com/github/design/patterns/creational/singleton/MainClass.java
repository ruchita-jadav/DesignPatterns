package com.github.design.patterns.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Run any one for loop.
 */
public class MainClass {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        // All threads are pawned at same time. So all three entered in the constructor class but only one object is instantiated.
        for (int i = 0; i < 6; i++) {
            executor.execute(new Thread(() -> DataSource.getInstance(), "i"));
        }
        // Due to delay only one thread got an access
        for (int i = 0; i < 6; i++) {
            executor.execute(new Thread(() -> DataSource.getInstance(), "i"));
            Thread.sleep(2);
        }
        executor.shutdown();
    }
}
