package Zadanie6;

import java.util.Objects;
import java.util.Scanner;

public class MyLinkedCollection<E> {
    private ListNode<E> front = null;
    protected int size;

    protected int getSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        size = scanner.nextInt();
        return size;
    }

    Object[] arr = new Object[size];

    protected void add(E item) {
        arr = new Objects[size + 1];
        arr[size + 1] = item;
        size++;
        ListNode<E> temp = front;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new ListNode<E>(temp, item, null);
    }

    protected void remove(int index) {
        arr[index] = null;
    }

    protected void remove(E item) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == (E) item) {
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