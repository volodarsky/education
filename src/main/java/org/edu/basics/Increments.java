package org.edu.basics;

/**
 * @author vladimir.romanov
 * @version 1.0
 * @since UP...
 */
public class Increments {


    public static void main(String[] args) {

        int i = 5;
        i = i++;
        System.out.println(i);

        i = 5;
        i = i++ + i++;
        System.out.println(i);

        i = 5;
        i = i++ + ++i;
        System.out.println(i);

        i = 5;
        i = ++i + ++i;
        System.out.println(i);

    }

}
