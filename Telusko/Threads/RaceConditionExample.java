package Threads;

class Counter {
    int count = 0;
    int synchronizedCount = 0;
    // increment method is not synchronized, 
    // so it can lead to race condition when multiple threads try to access it simultaneously.
    public void increment() {
        count++;
    }

    // synchronized increment method to avoid race condition
    // synchronized keyword ensures that only one thread can access this method at a time,
    // so that the count variable is incremented correctly.
    public synchronized void synchronizedIncrement() {
        synchronized(this) {
            synchronizedCount++;
        }
    }
}

public class RaceConditionExample {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable r1 = () -> {
            for(int i = 1; i <= 10000; i++){
                counter.increment();
                counter.synchronizedIncrement();
            }   
        };

        Runnable r2 = () -> {
            for(int i = 1; i <= 10000; i++){
                counter.increment();
                counter.synchronizedIncrement();
            }   
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

        // waiting for both threads to finish before printing the final count
        // we need to use join() method to wait for the threads to finish, 
        // otherwise main thread may print the final count before the other threads finish executing, 
        // leading to incorrect results.
        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.count); // Final count: 13072, // 
        // The final count may not be 20000 due to race condition,
        // because both threads are trying to increment the count variable simultaneously,
        // leading to some increments being lost.
        // For example, if both threads read the value of count as 5, and then both increment it to 6,
        // the final value of count will be 6 instead of 7, because both threads have lost one increment.

        // To fix this issue, we can make the increment method synchronized,
        // so that only one thread can access it at a time,

        // After making the increment method synchronized, the final count will always be 20000,
        System.out.println("Final count after synchronization: " + counter.synchronizedCount); // Final count after synchronization: 20000
    }
}
