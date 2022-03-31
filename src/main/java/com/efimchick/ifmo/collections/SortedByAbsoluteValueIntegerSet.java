package com.efimchick.ifmo.collections;

import java.util.AbstractSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public final class SortedByAbsoluteValueIntegerSet extends AbstractSet<Integer>  {

    private final TreeSet<Integer> sortedByAbsValueSet;

    public SortedByAbsoluteValueIntegerSet() {
        sortedByAbsValueSet = new TreeSet<>(Comparator.comparingInt(Math::abs)
        );
    }

    public Set<Integer> getSet() {
        return new TreeSet<>(sortedByAbsValueSet);
    }

    @Override
    public boolean add(Integer element) {
        sortedByAbsValueSet.add(element);
        return true;
    }

    @Override
    public int size() {
        return sortedByAbsValueSet.size();
    }


    public Iterator<Integer> iterator() {
        return sortedByAbsValueSet.iterator();
    }

    @Override
    public int hashCode() {
        return sortedByAbsValueSet.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SortedByAbsoluteValueIntegerSet)) {
            return false;
        }
        SortedByAbsoluteValueIntegerSet otherSet = (SortedByAbsoluteValueIntegerSet) obj;
        return this.getSet().equals(otherSet.getSet());
    }
}
