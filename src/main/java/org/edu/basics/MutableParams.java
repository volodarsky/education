package org.edu.basics;

/**
 * @author vladimir.romanov
 * @version 1.0
 */
public class MutableParams {


        public static void main(String[] args)   {
            String s = "old";
            print(s, s = "new");
        }

        static void print(String s1, String s2)   {
            System.out.println(s1 +" "+ s2);
        }

}
