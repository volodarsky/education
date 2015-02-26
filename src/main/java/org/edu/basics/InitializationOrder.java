package org.edu.basics;

/**
 * @author vladimir.romanov
 * @version 1.0
 * @since UP...
 */


public class InitializationOrder {

    private static String msg(String msg) {
        System.out.println(msg);
        return msg;
    }

    public InitializationOrder() {
        m = msg("o1");
    }

    {
        m = msg("o2");
    }

    String m = msg("o3");

    static{
        s = msg("s1");
    }

    static String s = msg("s2");


    public static void main(String[] args) {
        Object obj = new InitializationOrder();
    }
}
