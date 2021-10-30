package linkedlist;

import java.util.Iterator;

public class LinkedListIterator<T> implements Iterator<T> {

    private Node<T> current;
    private Node<T> head;
    private boolean isFirst = true;

    public LinkedListIterator(Node<T> node) {
        this.current = node;
        this.head = node;
    }

    @Override
    public boolean hasNext() {
        if (isFirst) return current != null;
        return current != null && head != current;
    }

    @Override
    public T next() {
        T data = current.data;
        current = current.next;
        return data;
    }

}