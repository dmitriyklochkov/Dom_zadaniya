package Zadanie6;

import java.util.ArrayList;

public class ArrayCollection<E> implements TypeCollection {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("4");
        arrayList.add("5");
    }

    @Override
    public int size() {
        return this.size();
    }

    @Override
    public void add(Object item) {
    }

    @Override
    public void remove(int index) {
    }

    @Override
    public void remove(Object item) {
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public void clear() {
    }
}

