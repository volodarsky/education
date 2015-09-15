package org.edu.overriding;

/**
 * @author vladimir.romanov
 * @version 1.0
 */
public class SampleTree {

    static class Super {
        static String ID = "QBANK";
    }

    static class Sub extends Super {
        static {
            System.out.print("In Sub");
        }
    }

    public static void main(String[] args) {
        System.out.println(Sub.ID);
    }


}
