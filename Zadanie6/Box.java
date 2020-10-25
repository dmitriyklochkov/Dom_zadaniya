package Zadanie6;

import java.util.Comparator;

public class Box<E> extends ArrayCollection implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    public static void main(String[] args) {
    }

    ArrayCollection<Apple> boxApple = new ArrayCollection<>();
    ArrayCollection<Orange> boxOrange = new ArrayCollection<>();

    boolean compare(Object item) {

        int comp = compare(boxApple, boxOrange);
        {
            if (comp == 0) {
                return false;
            } else {
                return true;
            }
        }
    }
}
