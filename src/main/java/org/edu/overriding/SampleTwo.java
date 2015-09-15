package org.edu.overriding;

/**
 * @author vladimir.romanov
 * @version 1.0
 */
public class SampleTwo {

    static class Super {
        public String name = "Tort";

        public String getName() {
            return name;
        }
    }

    static class Sub extends Super {
        public String name = "Habr";
    }

    public static void main(String[] args) {

        Super s = new Sub();
        System.out.println(s.name + " " + s.getName());
    }

}
