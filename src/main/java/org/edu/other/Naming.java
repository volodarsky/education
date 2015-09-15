package org.edu.other;

/**
 * @author vladimir.romanov
 * @version 1.0
 */
public class Naming {

    public static void doIt(String String) { //1
        int i = 10;
        i: for (int k = 0; k < 10; k++) { //2
            System.out.println(String + i); //3
            if (k * k > 10) continue i; //4
        }
    }

    class X {
        <X> X(X x) {
            System.out.println(x);
        }
    }

}
