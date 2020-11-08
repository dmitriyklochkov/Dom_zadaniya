package Zadanie6;

public class ListNode<E> {
    protected E item;

    protected ListNode<E> next;

    protected ListNode<E> prev;

    ListNode(E item) {
        this(null, item, null);
    }

    ListNode(ListNode<E> prev, E item, ListNode<E> next) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }
}

