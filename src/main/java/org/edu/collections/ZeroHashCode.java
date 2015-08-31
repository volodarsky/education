package org.edu.collections;

import sun.reflect.MyMagicAccessor;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author vladimir.romanov
 * @version 1.0
 * @since UP...
 */
public class ZeroHashCode {

    public static void main(String[] args) {
        final Map<BadKey, Object> hashMap = new ConcurrentHashMap<>();//new MyMap<>(new HashMap<BadKey,Object>());

        final Object value = new Object();

        //Object put = hashMap.put(null, value);
        //assert put == null;

        //put = hashMap.put(null, null);
        //assert put == value;

        for (int i = 0; i < 1000; i++) {
            hashMap.put(new BadKey(), new Object());
        }

        final int size = hashMap.size();
        System.out.println();
    }


    private static class BadKey {

        @Override
        public int hashCode() {
            return 5;
        }
    }

    private static class MyMap<K, V> extends MyMagicAccessor implements Map<K, V> {


        private Map<K, V> map;

        public MyMap(Map<K, V> map) {
            this.map = map;
        }

        @Override
        public int size() {
            return map.size();
        }

        @Override
        public boolean isEmpty() {
            return map.isEmpty();
        }

        @Override
        public boolean containsKey(Object key) {
            return map.containsKey(key);
        }

        @Override
        public boolean containsValue(Object value) {
            return map.containsValue(value);
        }

        @Override
        public V get(Object key) {
            return map.get(key);
        }

        @Override public V put(K key, V value) {
            return map.put(key, value);
        }

        @Override public V remove(Object key) {
            return map.remove(key);
        }

        @Override public void putAll(Map m) {
            map.putAll(m);
        }

        @Override
        public void clear() {
            map.clear();
        }

        @Override
        public Set keySet() {
            return map.keySet();
        }

        @Override
        public Collection values() {
            return map.values();
        }

        @Override
        public Set<Entry<K, V>> entrySet() {
            return map.entrySet();
        }
    }


}
