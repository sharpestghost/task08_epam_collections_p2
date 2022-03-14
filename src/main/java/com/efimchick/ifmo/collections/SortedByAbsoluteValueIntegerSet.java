package com.efimchick.ifmo.collections;

import java.util.*;

class SortedByAbsoluteValueIntegerSet extends TreeSet<Integer> {

    private Set<Integer> set;

    SortedByAbsoluteValueIntegerSet() {
        set = new TreeSet<>();
    }
    @Override
    public Comparator<? super Integer> comparator() {
        return null;
    }

    @Override
    public TreeSet<Integer> subSet(Integer fromElement, Integer toElement) {
        return null;
    }

    @Override
    public TreeSet<Integer> headSet(Integer toElement) {
        return null;
    }

    @Override
    public TreeSet<Integer> tailSet(Integer fromElement) {
        return null;
    }
}
