package org.edu.threading;

/**
 * @author vladimir.romanov
 */
public class ThreadSample {

    static class Threader extends Thread {
        public void run() {
            System.out.println("In Threader");
        }
    }

    static class Pooler extends Thread {
        public Pooler() {
        }

        public Pooler(Runnable r) {
            super(r);
        }

        public void run() {
            System.out.println("In Pooler");
        }
    }

    public static void main(String[] args) {
        Threader t = new Threader();
        Thread h = new Pooler(t);
        h.start();
    }


}
