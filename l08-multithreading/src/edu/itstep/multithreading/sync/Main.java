package edu.itstep.multithreading.sync;

public class Main {
    public static int counter = 0;
    public static Object lock = new Object();

    public static void main(String[] args) {
        IncThread incThread = new IncThread(1_000_000_000);
        DecThread decThread = new DecThread(1_000_000_000);
        incThread.start();
        decThread.start();
        try {
            incThread.join();
            decThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Counter: " + counter);
    }

    static class IncThread extends Thread {
        private int limit;

        public IncThread(int limit) {
            this.limit = limit;
        }

        @Override
        public void run() {
            for (int i = 0; i < limit; i++) {
                synchronized (lock) {
                    Main.counter++;
                }
            }
        }
    }

    static class DecThread extends Thread {
        private int limit;


        public DecThread(int limit) {
            this.limit = limit;
        }

        @Override
        public void run() {
            for (int i = 0; i < limit; i++) {
                synchronized (lock) {
                    Main.counter--;
                }
            }
        }
    }
}
