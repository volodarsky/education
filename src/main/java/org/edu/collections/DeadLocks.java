package org.edu.collections;

/**
 * @author vladimir.romanov
 * @version 1.0
 * @since UP...
 */
public class DeadLocks {

    static class A {
        static final B b = new B();
    }

    static class B {
        static final A a = new A();
    }

    public static void main(String[] args) {
        new Thread(A::new).start();
        new B();
    }

}
