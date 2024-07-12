package edu.itstep.multithreading;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Thread
        // IO Streams
        // Stream API
//        Thread.sleep(50000);
//        LoggerThread loggerThread = new LoggerThread();
//        LoggerThread loggerThread2 = new LoggerThread();
//
//
//        loggerThread.start();
//        loggerThread2.start();
//
//        System.out.println("END");
//        new Thread().setPriority();
//        Thread thread = Thread.currentThread();
//        thread.setUncaughtExceptionHandler((t, e) -> System.out.println("Uncaught exception: " + t));
//        ThreadGroup group = thread.getThreadGroup();
//        System.out.println("ThreadGroup: " + group);
//        System.out.println("Thread: " + thread);
//        System.out.println(2 / 0);
//        System.out.println("Parent ThreadGroup: " + group.getParent().getName());
//        Runnable task = () -> {
//            for (int i = 0; i < 100; i++) {
//                System.out.println(Thread.currentThread().getName() + " Percents: " + i + "%");
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };
//        Thread olegThread = new Thread(new OlegWorker());
//        olegThread.setName("OlegWorker-Thread");
//        olegThread.setDaemon(true);
//        Thread taskThread = new Thread(task);
//        taskThread.setName("Task-Thread");
//        olegThread.start();
//        taskThread.start();
//
//        System.out.println("END");
////        Thread.sle
//        TimeUnit.SECONDS.sleep(5);
//        Runnable task = () -> {
//            try {
//                TimeUnit.SECONDS.sleep(60);
//            } catch (InterruptedException e) {
//                System.out.println("Interrupted");
//            }
//        };
//        Thread thread = new Thread(task);
//        thread.start();
//        thread.interrupt();

//        Runnable task = () -> {
//            while (!Thread.currentThread().isInterrupted()) {
//                System.out.println("HELLO");
//            }
//            System.out.println("finished");
//        };
//
//        Thread thread = new Thread(task);
//        thread.start();
//        Thread.sleep(100);
//        thread.interrupt();
//        Runnable task = () -> {
//            try {
//                TimeUnit.SECONDS.sleep(5);
//            } catch (InterruptedException e) {
//                System.out.println("Interrupted");
//            }
//        };
//        Thread t1 = new Thread(task);
//        t1.start();
//        t1.join();
//        System.out.println("END");


    }

    static class OlegWorker implements Runnable {


        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    static class LoggerThread extends Thread {

        public LoggerThread() {
        }

        public LoggerThread(Runnable target) {
            super(target);
        }

        public LoggerThread(ThreadGroup group, Runnable target) {
            super(group, target);
        }

        public LoggerThread(String name) {
            super(name);
        }

        public LoggerThread(ThreadGroup group, String name) {
            super(group, name);
        }

        public LoggerThread(Runnable target, String name) {
            super(target, name);
        }

        public LoggerThread(ThreadGroup group, Runnable target, String name) {
            super(group, target, name);
        }

        public LoggerThread(ThreadGroup group, Runnable target, String name, long stackSize) {
            super(group, target, name, stackSize);
        }

        public LoggerThread(ThreadGroup group, Runnable target, String name, long stackSize, boolean inheritThreadLocals) {
            super(group, target, name, stackSize, inheritThreadLocals);
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
