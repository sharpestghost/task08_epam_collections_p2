package com.efimchick.ifmo.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PairStringList extends ArrayList<String> {
    private List<String> list;

    PairStringList() {
        list = new ArrayList<>();
    }

    @Override
    public int size() {
        return list.size();
    }


    @Override
    public boolean add(String s) {
        list.add(s);
        list.add(s);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        super.addAll(c);
        return super.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
       list.addAll(index, c);
       list.addAll(index, c);
        return false;
    }

    @Override
    public String get(int index) {
        return super.get(index);
    }

    @Override
    public String set(int index, String element) {
        return null;
    }

    @Override
    public void add(int index, String element) {
        list.add(index, element);
        list.add(index, element);
    }

    @Override
    public String remove(int index) {
        return null;
    }
}
