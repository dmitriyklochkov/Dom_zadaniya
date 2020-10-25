package Zadanie6;

import java.util.LinkedList;

public class LinkedCollection<E> implements TypeCollection {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("f");
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
