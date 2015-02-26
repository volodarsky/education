package org.edu.timing;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * @author vladimir.romanov
 * @version 1.0
 * @since UP...
 */
public class CurrentTimeMillisTest {

    static volatile long counter = 0;
    static long time;

    public static void main(String[] args) {

        final CurrentTimeMillisTest currentTimeMillisTest = new CurrentTimeMillisTest();
        new Thread(){
            @Override public void run() {
                currentTimeMillisTest.test();
            }
        }.start();

        while(true){
            LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(1000));
            System.out.print("counter: " + counter * 500);
            System.out.println(" time: " + time);
        }
    }

    public void test(){
        while(true){
            for (int i = 0; i < 500; i++) {
                time = System.nanoTime();
            }
            counter++;
        }
    }

}
