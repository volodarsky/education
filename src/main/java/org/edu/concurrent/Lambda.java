package org.edu.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author vladimir.romanov
 * @version 1.0
 */
public class Lambda {


    private long counter = 0;


    public static void main(String[] args) throws InterruptedException {
        new Lambda().test();
    }


    public void test() throws InterruptedException {

        AtomicInteger sum = new AtomicInteger();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (AtomicInteger i = new AtomicInteger(); i.get() < 10; i.incrementAndGet()) {
            System.out.println("iteration:" + i);
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("before [" + this.getClass().getSimpleName() + "] :" + sum + ":" + i);
                    counter++;
                    sum.addAndGet(i.incrementAndGet());
                    System.out.println("after [" + this.getClass().getSimpleName() + "] :" + sum.get());
                }

            });
        }
        executorService.shutdown();
        executorService.awaitTermination(100500, TimeUnit.DAYS);

        System.out.println(sum);
        System.out.println(counter);
    }

}
