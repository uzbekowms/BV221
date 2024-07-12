package edu.itstep.multithreading.executors;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//
//        executorService.execute(() -> {
//            String threadName = Thread.currentThread().getName();
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                System.out.println("Thread interrupted");
//            }
//            System.out.println("Hello from " + threadName);
//        });
//        executorService.execute(() -> {
//            String threadName = Thread.currentThread().getName();
//            System.out.println("Hello from " + threadName);
//        });
//        executorService.shutdown();

//        ExecutorService executor = Executors.newSingleThreadExecutor();
//
//        Future<?> future = executor.submit(() -> {
//            String threadName = Thread.currentThread().getName();
//            System.out.println(threadName);
//        });
//
//        try {
//            if (future.get() == null) {
//                System.out.println("Success!");
//            }
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }
//        executor.shutdown();

//        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
//        Runnable task = () -> {
//            System.out.println("Hello from " + Thread.currentThread().getName());
//        };
//
//        ScheduledFuture<?> scheduledFuture = scheduledExecutorService.scheduleAtFixedRate(task, 0, 3, TimeUnit.SECONDS);
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        scheduledFuture.cancel(true);
//        scheduledExecutorService.shutdown();
//        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
//        Future<Integer> sumResult = executor.submit( new SumCalculator(1, 10));
//        Future<Integer> sumResult2 = executor.submit( new SumCalculator(1, 10_000_000));
//
//        try {
//            System.out.println(sumResult.get());
//            System.out.println(sumResult2.get());
//
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }


    }

    static class SumCalculator implements Callable<Integer> {

        private int beg;
        private int end;

        public SumCalculator(int beg, int end) {
            this.beg = beg;
            this.end = end;
        }

        @Override
        public Integer call() throws Exception {
            int sum = 0;
            for (int i = beg; i <= end; i++) {
                sum += i;
            }
            return sum;
        }
    }
}
