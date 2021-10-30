package linkedlist;

import java.util.Iterator;

public class SinglyLinkedList<T> extends LinkedList<T> {

    public SinglyLinkedList () {
        head = null;
    }

    @Override
    public void add(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    @Override
    public void add(int index, T data) {
        Node<T> newNode = new Node<T>(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            if (index > size()) {
                throw new IndexOutOfBoundsException();
            }
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    @Override
    public T get(int index) {
        if (index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public T remove(int index) {
        if (index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        if (index == 0) {
            T data = current.data;
            head = current.next;
            return data;
        }
        Node<T> previous = null;
        for (int i = 0; i < index - 1; i++) {
            previous = current;
            current = current.next;
        }
        Node<T> temp = current;
        previous.next = current.next;
        return temp.data;
    }

    @Override
    public int remove(T data) {
        Node<T> current = head;
        int index = 0;
        while (current.next != null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
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
        Node<T> current = head;
        while (current != null) {
            current = current.next;
            size++;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public boolean contains(T data) {
        Node<T> current = head;
        while (current != null) {
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
        Node<T> current = head;
        while (current != null) {
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
        int index = 0;
        int lastIndex = -1;
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                lastIndex = index;
            }
            current = current.next;
            index++;
        }
        return lastIndex;
    }

    @Override
    public boolean detectLoop() {
        Node<T> slow = head;
        Node<T> fast = head;
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
        return new LinkedListIterator<T>(this.head);
    }
}
