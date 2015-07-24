package org.edu.arrays;

import java.util.Objects;

/**
 * @author vladimir.romanov
 * @version 1.0
 * @since UP...
 */
public class InvertString {

    public static void main(String[] args) {
        String str;
        if (args.length > 0) {
            str = args[0];
        }else{
            str = " this is a test string";
        }

        System.out.println(invert(str));

    }

    private static String invert(String str) {

        Objects.requireNonNull(str);

        char[] chars = str.toCharArray();

        char tmp;
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            /*tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;*/

            swap(chars, i, j);
        }

        return new String(chars);  //To change body of created methods use File | Settings | File Templates.
    }

    private static void swap(char[] chars, int i, int j) {
        chars[i] ^= chars[j];
        chars[j] ^= chars[i];
        chars[i] ^= chars[j];
    }



}
