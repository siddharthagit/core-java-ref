package com.fullstacksref.concurrency;

import java.util.concurrent.Executors;

public class ThreadPerformanceComparison {

    public static void main(String[] args) throws InterruptedException {

        int tasks = 100_000; // number of concurrent tasks
        int sleepTimeMs = 10; // simulate I/O work

        System.out.println("Starting performance test...");

        // ------------------------
        // Platform Threads
        // ------------------------
        Thread[] platformThreads = new Thread[tasks];

        long startPlatform = System.currentTimeMillis();

        for (int i = 0; i < tasks; i++) {
            platformThreads[i] = new Thread(() -> {
                try {
                    Thread.sleep(sleepTimeMs);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
            platformThreads[i].start();
        }

        // Wait for all platform threads to finish
        for (Thread t : platformThreads) {
            t.join();
        }

        long endPlatform = System.currentTimeMillis();
        System.out.println("Platform Threads took: " + (endPlatform - startPlatform) + " ms");

        // ------------------------
        // Virtual Threads
        // ------------------------
        long startVirtual = System.currentTimeMillis();

        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < tasks; i++) {
                executor.submit(() -> {
                    try {
                        Thread.sleep(sleepTimeMs);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                });
            }
        } // Executor automatically waits for all tasks to finish

        long endVirtual = System.currentTimeMillis();
        System.out.println("Virtual Threads took: " + (endVirtual - startVirtual) + " ms");
    }
}
