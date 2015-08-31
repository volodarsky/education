package org.edu.algorythms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.PrimitiveIterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author vladimir.romanov
 * @version 1.0
 * @since UP...
 */
public class Primes {


    public static void withCycles(int limit) {

        final boolean[] nonprimes = new boolean[limit + 1];
        nonprimes[0] = nonprimes[1] = true;

        for (int i = 2; i * i <= limit; i++) {
            for (int j = i * i; j <= limit; j += i) {
                nonprimes[j] = true;
            }
        }
        for (int i = 0; i < nonprimes.length; i++) {
            boolean nonprime = nonprimes[i];
            if (!nonprime) System.out.print(i + " ");

        }
    }

    public static void withStreams(int limit) {
        final int startInclusive = 2;
        withStreams(IntStream.range(2, limit)).forEach(i ->  System.out.print(i + " "));
    }

    private static IntStream withStreams(IntStream s) {

        PrimitiveIterator.OfInt iterator = s.iterator();
        IntStream tail;
        if (iterator.hasNext()) {
            final int head = iterator.nextInt();
            tail = IntStream.generate(iterator::next).filter(i -> i % head != 0);
            return IntStream.concat(IntStream.of(head), withStreams(tail));
        } else{
            return s;
        }
    }

    public static void main(String[] args) throws ParseException {
        withStreams(100);
    }

}
