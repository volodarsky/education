package org.edu.overriding;

/**
 * @author vladimir.romanov
 * @version 1.0
 */
public class SampleFour {

    static class A {
        int x = getX();

        public int getX() {
            return 1;
        }
    }

    static class B extends A {
        int x = 2;

        public int getX() {
            return x;
        }
    }

    public static void main(String[] args) {
        A a = new A();
        A b = new B();
        B c = new B();

        System.out.println(a.x + " " + b.x + " " + c.x);
    }

}
