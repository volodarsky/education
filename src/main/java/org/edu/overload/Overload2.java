package org.edu.overload;

/**
 * @author vladimir.romanov
 * @version 1.0
 */
public class Overload2 {

    public void method(Object o) {
        System.out.println("Object");
    }

    public void method(java.io.FileNotFoundException f) {
        System.out.println("FileNotFoundException");
    }

    public void method(java.io.IOException i) {
        System.out.println("IOException");
    }

    public static void main(String args[]) {
        Overload2 test = new Overload2();
        test.method(null);
    }

}
