package Zadanie6;

import java.util.Objects;
import java.util.Scanner;

public class MyArrayCollection<E> {
    protected int size;
    Scanner scanner = new Scanner(System.in);

    protected int getSize() {
        System.out.println("Введите размер массива");
        size = scanner.nextInt();
        return size;
    }

    Object[] arr = new Object[size];

    protected void add(E item) {
        arr = new Objects[size + 1];
        arr[size + 1] = item;
    }

    protected void remove(int index) {
        arr[index] = null;
    }

    protected void remove(E item) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == item) {
                arr[i] = null;
            }
        }
    }

    protected E get(int index) {

        return (E) arr[index];
    }

    protected void clear() {
        for (int i = 0; i < size; i++) {
            arr[i] = null;
        }
    }

}