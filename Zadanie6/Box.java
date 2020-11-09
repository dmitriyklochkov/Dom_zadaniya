package Zadanie6;

import java.util.Comparator;

public class Box<E> extends MyArrayCollection implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    protected boolean compare(Object item) {

        float comp = Apple.weightBox - Orange.weightBox;
        {
            if (comp == 0) {
                return false;
            } else {
                return true;
            }
        }
    }
}
