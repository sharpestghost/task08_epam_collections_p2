package com.efimchick.ifmo.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;

public final class SortedByAbsoluteValueIntegerSet extends LinkedHashSet<Integer>  {

    private static final long serialVersionUID = 1;
    private final Set<Integer> set;
    
    SortedByAbsoluteValueIntegerSet() {
        set = new LinkedHashSet<>();
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean add(Integer integer) {
        return set.add(integer);
    }

    @Override
    public boolean remove(Object o) {
        return set.remove(o);
    }

    @Override
    public boolean contains(Object o) {
        return set.contains(o);
    }

    @Override
    public Iterator<Integer> iterator() {
        
        return new Iterator<>() {
            private final List<Integer> setOfElements = set.stream().
                    sorted(Comparator.comparingInt(Math::abs)).collect(Collectors.toList());
            private int index;

            @Override
            public boolean hasNext() {
                index++;
                return index <= setOfElements.size();
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return setOfElements.get(index - 1);
            }
        };
    }

}
