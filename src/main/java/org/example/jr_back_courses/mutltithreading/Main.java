package org.example.jr_back_courses.mutltithreading;

/**
 * The volatile keyword in Java is a non-access modifier that signals
 * to a thread that a variable is stored in the main memory, not the CPU cache.
 * This ensures that all threads see the same value for the volatile keyword.
 **/


public class Main {
    private static volatile int counter = 0;
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            int local_counter = counter;
            while (local_counter < 10) {
                if (local_counter != counter) {
                    System.out.println("[T1] Local counter is changed");
                    local_counter = counter;
                }
            }
        });

        Thread t2 = new Thread(() -> {
            int local_counter = counter;
            while (local_counter < 10) {
                System.out.println("[T2] incremented counter to: " + (local_counter + 1));
                counter = ++local_counter;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
        t2.start();
    }
}
