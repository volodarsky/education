package org.edu.strings;

/**
 * @author vladimir.romanov
 * @version 1.0
 */
public class StringPool {

    public static void main(String[] args) {
        String hello = "Hello", lo = "lo";
        String hello2 = new String("Hello");
        String hello3 = new String("Hello");

        System.out.println("Other.hello == hello : " + (Other.hello == hello));
        System.out.println("hello == (\"Hel\" + \"lo\") : " + (hello == ("Hel" + "lo")));
        System.out.println("hello == (\"Hel\" + lo) : " + (hello == ("Hel" + lo))); // runtime
        System.out.println("hello == (\"Hel\" + lo).intern() : " + (hello == ("Hel" + lo).intern()));
        System.out.println("hello2 == hello3 : " + (hello2 == hello3));
        System.out.println("hello2.intern() == hello3.intern() : " + (hello2.intern() == hello3.intern()));
    }

    static class Other {
        static String hello = "Hello";
    }


}
