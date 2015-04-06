package org.edu.encoding;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;

/**
 * @author vladimir.romanov
 * @version 1.0
 * @since UP...
 */
public class Encodings {

    public static void main(String[] args) {
        try {
            String initial = "\u03c0";
            System.out.println(initial);
            String encoded = URLEncoder.encode(initial, "UTF-8");
            System.out.println(encoded);
            System.out.println(Arrays.toString(encoded.getBytes()));

            encoded = URLEncoder.encode(initial, "UTF-16");
            System.out.println(encoded);
            System.out.println(Arrays.toString(encoded.getBytes()));

            encoded = URLEncoder.encode(initial, "windows-1251");
            System.out.println(encoded);
            System.out.println(Arrays.toString(encoded.getBytes()));

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
