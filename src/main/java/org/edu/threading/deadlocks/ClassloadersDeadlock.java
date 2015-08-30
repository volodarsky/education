package org.edu.threading.deadlocks;

/**
 * User: VR
 * Date: 29.08.15
 * Time: 21:36
 */
public class ClassloadersDeadlock {

    static class A {
        static {
            B b = new B();
        }

    }

    static class B {
        static {
            A a = new A();
        }
    }

    public static void main(String[] args) {
        new Thread(A::new).start();
        B b = new B();
    }


}
