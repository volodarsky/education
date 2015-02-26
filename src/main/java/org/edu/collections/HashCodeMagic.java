package org.edu.collections;

import java.util.HashMap;

/**
 * @author vladimir.romanov
 * @version 1.0
 * @since UP...
 */
public class HashCodeMagic {

    public static void main(String[] args) {

        HashMap<byte[], String> map = new HashMap<byte[], String>();

        map.put(new byte[]{1,2,3},"A");
        map.put(new byte[]{1,2,3},"B");
        map.put(new byte[]{1,2,3},"C");
        System.out.println(map.get(new byte[]{1,2,3}));

        for (int i = 0; i < 10; i++) {
            System.out.println((new Object()).hashCode());
        }
    }

}
