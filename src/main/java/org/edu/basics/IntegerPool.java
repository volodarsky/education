package org.edu.basics;

/**
 * @author vladimir.romanov
 * @version 1.0
 */
public class IntegerPool {

    public static void main(String[] args) {
        Integer a = 120;
        Integer b = 120;
        Integer c = 130;
        Integer d = 130;
        System.out.println(a==b);//true
        System.out.println(c==d);//false
    }
}
