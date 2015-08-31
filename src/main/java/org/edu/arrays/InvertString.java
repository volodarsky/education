package org.edu.arrays;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Objects;

/**
 * @author vladimir.romanov
 * @version 1.0
 * @since UP...
 */
public class InvertString {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        String str;
        System.out.println(Charset.defaultCharset());

        PrintStream out = new PrintStream(System.out, true, Charset.defaultCharset().displayName());
        System.setOut(out);
        //System.setProperty()
        if (args.length > 0) {
            str = args[0];
        }else{
            str = "это тестовая строка";
        }


        out.println(invert(str));

    }

    private static String invert(String str) {

        Objects.requireNonNull(str);

        byte[] bytes = str.getBytes();//toCharArray();

        System.out.println(bytes.length);

        char tmp;
        for (int i = 0, j = bytes.length - 1; i < j; i++, j--) {
            /*tmp = bytes[i];
            bytes[i] = bytes[j];
            bytes[j] = tmp;*/

            swap(bytes, i, j);
        }

        return new String(bytes);  //To change body of created methods use File | Settings | File Templates.
    }

    private static void swap(byte[] bytes, int i, int j) {
        bytes[i] ^= bytes[j];
        bytes[j] ^= bytes[i];
        bytes[i] ^= bytes[j];
    }



}
