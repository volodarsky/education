package org.edu.algorythms;

/**
 * @author vladimir.romanov
 * @version 1.0
 * @since UP...
 */
public class BasicAlgorythms {

    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        swap(a, b);

    }

    static void swap(int a, int b) {

        System.out.print("a: " +  a);
        System.out.println(" b: " + b);

        System.out.print("a: " + Integer.toBinaryString(a));
        System.out.println(" b: " + Integer.toBinaryString(b));

        a ^= b;

        System.out.print("a: " + Integer.toBinaryString(a));
        System.out.println(" b: " + Integer.toBinaryString(b));

        b ^= a;

        System.out.print("a: " + Integer.toBinaryString(a));
        System.out.println(" b: " + Integer.toBinaryString(b));

        a ^= b;

        System.out.print("a: " + Integer.toBinaryString(a));
        System.out.println(" b: " + Integer.toBinaryString(b));

        System.out.print("a: " +  a);
        System.out.println(" b: " + b);
    }
}