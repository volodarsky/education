package org.edu.threading;

/**
 * @author vladimir.romanov
 * @version 1.0
 * @since UP...
 */
public class InterruptingTests {


    public static void main(String[] args) {
        InterruptingTests interruptingTests = new InterruptingTests();
        interruptingTests.interruptedThread();
    }

    public void interruptedThread(){

        ThreadLocal<Long> l = new ThreadLocal<>();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){

                    synchronized (this){

                        try {
                            wait(1000);
                        } catch (InterruptedException e) {
                            boolean interrupted = Thread.currentThread().isInterrupted();
                            System.out.println("interrupted: " + interrupted);
                            Thread.interrupted();
                        }
                    }


                }
            }
        });
        t1.start();

        while(true){
            synchronized (this){
                t1.interrupt();
                this.notifyAll();
            }
        }

    }

}
