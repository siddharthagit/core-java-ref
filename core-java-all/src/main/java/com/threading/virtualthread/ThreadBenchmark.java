package com.threading.virtualthread;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadBenchmark {

    public static void main(String[] args) throws InterruptedException {
        int tasks = 100_000;        // number of concurrent tasks
        int sleepMs = 10;           // simulated I/O per task
        int iterations = 100;         // number of runs to average

        System.out.println("=== Java Thread Benchmark ===");
        System.out.println("Tasks: " + tasks + ", Sleep per task: " + sleepMs + "ms\n");

        for (int i = 1; i <= iterations; i++) {
            System.out.println("Iteration " + i + " of " + iterations + ":");

            long memBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
            long startPlatform = System.nanoTime();
            runPlatformThreads(tasks, sleepMs);
            long endPlatform = System.nanoTime();
            long memAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

            System.out.printf("Platform Threads - Time: %d ms, Memory used: %d MB%n",
                    TimeUnit.NANOSECONDS.toMillis(endPlatform - startPlatform),
                    (memAfter - memBefore) / (1024 * 1024));

            memBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
            long startVirtual = System.nanoTime();
            runVirtualThreads(tasks, sleepMs);
            long endVirtual = System.nanoTime();
            memAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

            System.out.printf("Virtual Threads - Time: %d ms, Memory used: %d MB%n%n",
                    TimeUnit.NANOSECONDS.toMillis(endVirtual - startVirtual),
                    (memAfter - memBefore) / (1024 * 1024));
        }
    }

    private static void runPlatformThreads(int tasks, int sleepMs) throws InterruptedException {
        Thread[] threads = new Thread[tasks];
        for (int i = 0; i < tasks; i++) {
            threads[i] = new Thread(() -> {
                try {
                    Thread.sleep(sleepMs);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }
    }

    private static void runVirtualThreads(int tasks, int sleepMs) throws InterruptedException {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < tasks; i++) {
                executor.submit(() -> {
                    try {
                        Thread.sleep(sleepMs);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                });
            }
        }
    }
}

