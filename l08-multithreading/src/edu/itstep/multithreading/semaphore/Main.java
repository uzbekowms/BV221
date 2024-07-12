package edu.itstep.multithreading.semaphore;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger(new Random().nextInt(1000, 3000));
        for (int i = 0; i < 20; i++) {
            Thread thread = new Thread(logger);
            thread.start();
        }
    }

    static class Logger implements Runnable {
        private Semaphore semaphore = new Semaphore(5);
        private int counter;

        public Logger(int counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName() + "working " + this.counter);
                Thread.currentThread().sleep(counter);
                System.out.println(Thread.currentThread().getName() + " finished");
                semaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
