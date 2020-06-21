package com.company.Concrete;

import com.company.Abstract.Multiset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashmapMultiset<E> implements Multiset<E> {

    private Map<E, Integer> map = new HashMap<>();

    @Override
    public void add(E elem) {
        if(map.containsKey(elem)) {
            map.put(elem, map.get(elem) + 1);
        } else {
            map.put(elem, 1);
    }
    }

    @Override
    public void remove(E elem) {
        // implement the method
    }

    @Override
    public void union(Multiset<E> other) {
        // implement the method
    }

    @Override
    public void intersect(Multiset<E> other) {
        // implement the method
    }

    @Override
    public int getMultiplicity(E elem) {
        // implement the method
        return 0;
    }

    @Override
    public boolean contains(E elem) {
        // implement the method
        return false;
    }

    @Override
    public int numberOfUniqueElements() {
        // implement the method
        return 0;
    }

    @Override
    public int size() {
        // implement the method
        return 0;
    }

    @Override
    public Set<E> toSet() {
        // Creating a new HashSet<> object helps us avoid ConcurrentModificationException.
        // It is thrown when we try to iterate over elements of Map and modify them at the same time
        return new HashSet<>(map.keySet());
    }
}