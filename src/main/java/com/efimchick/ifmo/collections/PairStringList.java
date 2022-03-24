package com.efimchick.ifmo.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PairStringList extends ArrayList<String> {

    private static final long serialVersionUID = 1;
    private static final int DIVISIER_OF_EVEN = 2;

    PairStringList() {
    }

    @Override
    public boolean add(String s) {
        super.add(s);
        return super.add(s);
    }

    @Override
    public void add(int index, String element) {
        int newIndex = getHigherEvenIndex(index);
        super.add(newIndex, element);
        super.add(newIndex, element);
    }

    @Override
    public String remove(int index) {
        super.remove(getLowerEvenIndex(index));
        return super.remove(getLowerEvenIndex(index));
    }

    @Override
    public boolean remove(Object o) {
        super.remove(o);
        return super.remove(o);
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        return super.addAll(duplicateCollection(c));
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        return super.addAll(getHigherEvenIndex(index), duplicateCollection(c));
    }


    @Override
    public String set(int index, String element) {
        super.set(index, element);
        return super.set(getAdjacentIndex(index), element);
    }

    //Perhaps there is a better solution here
    private List<String> duplicateCollection(Collection<? extends String> c) {
        List<String> duplicatedList = new ArrayList<>();
        for (String element: c) {
            duplicatedList.add(element);
            duplicatedList.add(element);
        }
        return duplicatedList;
    }

    private int getLowerEvenIndex(int index) {
        if (index % DIVISIER_OF_EVEN != 0) {
            index--;
        }
        return index;
    }

    private int getHigherEvenIndex(int index) {
        if (index % DIVISIER_OF_EVEN != 0) {
            index++;
        }
        return index;
    }
    private int getAdjacentIndex(int index) {
        if (index % DIVISIER_OF_EVEN != 0) {
            index--;
        } else {
            index++;
        }
        return index;
    }
}
