package org.edu.overriding;

/**
 * @author vladimir.romanov
 * @version 1.0
 * @since UP...
 */
public class OverrideNumbers {


    public static void main(String[] args) {

        A a = new B();
        B b = new B();

        Double d = 8.0;
        a.m( d );
        b.m( d );

        System.out.println( d );
    }


    static class A {

        public void m(Number n){
            n = 8.0f;
            System.out.println( n );
        }

    }


    static class B extends A {

        public void m(Double n) {
            n = n / 3;
            System.out.println( n );
        }
    }
}
