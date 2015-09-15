package org.edu.overriding;

/**
 * @author vladimir.romanov
 * @version 1.0
 */
public class SampleOne {

    static class A {
        A() {
            print();
        }

        void print() {
            System.out.println("A");
        }
    }

    static class B extends A {
        int i = Math.round(3.5f);

        void print() {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        A a = new B();
        a.print();
    }


}
