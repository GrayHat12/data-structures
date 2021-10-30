package linkedlist;

import java.util.Iterator;

public class DoublyLinkedList<T> extends LinkedList<T> implements LinkedListInterface<T> {

    protected DoublyNode<T> tail;
    protected DoublyNode<T> head;

    DoublyLinkedList() {
        head = new DoublyNode<T>(null);
        tail = new DoublyNode<T>(null);
        head.next = tail;
        tail.prev = head;
    }

    @Override
    public void add(T data) {
        DoublyNode<T> newNode = new DoublyNode<T>(data);
        if (head.next == null) {
            head.next = newNode;
            newNode.prev = head;
            tail.prev = newNode;
        } else {
            newNode.prev = tail.prev;
            tail.prev = newNode;
            newNode.next = tail;
            newNode.prev.next = newNode;
        }
    }

    @Override
    public void add(int index, T data) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        DoublyNode<T> newNode = new DoublyNode<T>(data);
        DoublyNode<T> current = head.next;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        newNode.prev = current.prev;
        newNode.next = current;
        current.prev.next = newNode;
        current.prev = newNode;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        DoublyNode<T> current = head.next;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        DoublyNode<T> current = head.next;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        return current.data;
    }

    @Override
    public int remove(T data) {
        DoublyNode<T> current = head.next;
        int index = 0;
        while (current != tail) {
            if (current.data.equals(data)) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public int size() {
        int size = 0;
        DoublyNode<T> current = head.next;
        while (current != tail) {
            size++;
            current = current.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head.next == tail;
    }

    @Override
    public void clear() {
        head.next = tail;
        tail.prev = head;
    }

    @Override
    public boolean contains(T data) {
        DoublyNode<T> current = head.next;
        while (current != tail) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int indexOf(T data) {
        int index = 0;
        DoublyNode<T> current = head.next;
        while (current != tail) {
            if (current.data.equals(data)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T data) {
        int index = this.size() - 1;
        DoublyNode<T> current = tail.prev;
        while (current != head) {
            if (current.data.equals(data)) {
                return index;
            }
            current = current.prev;
            index--;
        }
        return -1;
    }

    @Override
    public boolean detectLoop() {
        DoublyNode<T> slow = head;
        DoublyNode<T> fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            DoublyNode<T> current = head.next;
            @Override
            public boolean hasNext() {
                return current != tail;
            }

            @Override
            public T next() {
                T data = current.data;
                current = current.next;
                return data;
            }

        };
    }

}
