package org.edu.basics;

/**
 * @author vladimir.romanov
 * @version 1.0
 */
public class Mountain {

    static String name = "Himalaya";

    static Mountain getMountain() {
        System.out.println("Getting Name ");
        return null;
    }

    public static void main(String[ ] args) {
        System.out.println( getMountain().name );
    }

}
