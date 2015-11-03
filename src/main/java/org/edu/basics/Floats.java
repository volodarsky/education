package org.edu.basics;

/**
 * @author vladimir.romanov
 * @version 1.0
 */
public class Floats {

    public static void main(String[] args) {

        Float f1 = new Float(Float.NaN);
        Float f2 = new Float(Float.NaN);

        System.out.println("\nf1 [" + f1 + "], f2 [" + f2 + "]");
        System.out.println("(f1 == f2) : " + (f1 == f2));
        System.out.println("f1.equals(f2) : " + f1.equals(f2));
        System.out.println("(Float.NaN == Float.NaN) : " + (Float.NaN == Float.NaN));
        System.out.println("f1.compare(f2) : " + f1.compareTo(f2));

        f1 = 0.0f;
        f2 = -0.0f;

        System.out.println("\nf1 [" + f1 + "], f2 [" + f2 + "]");
        System.out.println("(f1.floatValue() == f2.floatValue()) : " + (f1.floatValue() == f2.floatValue()));
        System.out.println("(f1 == f2) : " + (f1 == f2));
        System.out.println("f1.equals(f2) : " + f1.equals(f2));
        System.out.println("f1.compare(f2) : " + f1.compareTo(f2));
    }


}
