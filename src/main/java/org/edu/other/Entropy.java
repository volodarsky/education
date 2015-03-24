package org.edu.other;

import java.lang.reflect.Field;
import java.util.Random;

/**
 * @author vladimir.romanov
 * @version 1.0
 * @since UP...
 */
public class Entropy {

    public static void main(String[] args)
            throws Exception {

        // Extract the IntegerCache through reflection
        Class<?> clazz = Class.forName(
                "java.lang.Integer$IntegerCache");
        Field field = clazz.getDeclaredField("cache");
        field.setAccessible(true);
        Integer[] cache = (Integer[]) field.get(clazz);

        // Rewrite the Integer cache
        for (int i = 0; i < cache.length; i++) {
            cache[i] = new Integer(
                    new Random().nextInt(cache.length));
        }

        // Prove randomness
        System.out.println("Cache length: " + cache.length);
        for (int i = 120; i < 150; i++) {
            System.out.println((Integer) i);
        }


    }
}
