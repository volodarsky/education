package org.edu.threading.deadlocks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * User: VR
 * Date: 29.08.15
 * Time: 21:42
 */
public class CommonDeadlock {

    final static Object lock1 = new Object();
    final static Object lock2 = new Object();

    public static long obtainLocks(Object first, Object second, int cycles){

        long res = 0;
        synchronized (first){
            //res = doCycleJob(cycles, res);
            LockSupport.parkNanos(TimeUnit.SECONDS.toNanos(1));
            synchronized (second){
                System.out.println(res);
            }
        }
        return res;
    }

    private static long doCycleJob(int cycles, long res) {
        for(int i = 0; i < cycles; i++){
            res = res*i - i*i;
        }
        return res;
    }

    public static void main(String[] args) {
        new Thread(() -> {
            obtainLocks(lock1, lock2,6000);
        }).start();

        long l = obtainLocks(lock2, lock1,6000);
    }

}
