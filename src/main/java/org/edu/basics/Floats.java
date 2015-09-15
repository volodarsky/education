package org.edu.basics;

/**
 * @author vladimir.romanov
 * @version 1.0
 */
public class Floats {

    public static void main(String[] args) {
        Float f1 = new Float(Float.NaN);
        Float f2 = new Float(Float.NaN);

        System.out.println("(f1 == f2) : " + (f1 == f2));
        System.out.println("f1.equals(f2) : " + f1.equals(f2));
        System.out.println("(Float.NaN == Float.NaN) : " + (Float.NaN == Float.NaN));

        f1 = 0 / Float.POSITIVE_INFINITY;
        f2 = 0 / Float.NEGATIVE_INFINITY;

        System.out.println("f1 [" + f1 + "], f2 [" + f2 + "]");
        System.out.println("(f1 == f2) : " + (f1 == f2));
        //??
        System.out.println("f1.equals(f2) : " + f1.equals(f2));

    }


}
