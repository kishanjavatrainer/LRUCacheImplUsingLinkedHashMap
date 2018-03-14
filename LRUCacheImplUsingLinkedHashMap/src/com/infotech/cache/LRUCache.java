package com.infotech.cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
	private static final long serialVersionUID = -4622177786359540728L;
	private int size;

    public static void main(String[] args) {
        LRUCache<Integer, Integer> cache = LRUCache.newInstance(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(1, 1);
        cache.put(3, 3);

        System.out.println(cache);
    }

    private LRUCache(int size) {
        super(size, 0.75f, true);
        this.size = size;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > size;
    }

    public static <K, V> LRUCache<K, V> newInstance(int size) {
        return new LRUCache<K, V>(size);
    }
}