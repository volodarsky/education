package org.edu.overload;

/**
 * @author vladimir.romanov
 * @version 1.0
 */
public class Overload {

    public void method(Object o) {
        System.out.println("Object");
    }

    public void method(String s) {
        System.out.println("String");
    }

    public void method(CharSequence sb) {
        System.out.println("StringBuffer");
    }

    public static void main(String args[]) {
        Overload test = new Overload();
        //not compiled
        test.method(null);
    }
}

