package linkedlist;

import java.util.Iterator;

public class CircularLinkedList<T> extends LinkedList<T> implements LinkedListInterface<T> {
    private int size;

    public CircularLinkedList() {
        super();
        head = null;
        size = 0;
    }

    @Override
    public void add(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node<T> current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
        size++;
    }

    @Override
    public void add(int index, T data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> newNode = new Node<T>(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
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
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        Node<T> removed;
        if (index == 0) {
            removed = head;
            head = head.next;
        } else {
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            removed = current.next;
            current.next = current.next.next;
        }
        size--;
        return removed.data;
    }

    @Override
    public int remove(T data) {
        Node<T> current = head;
        int index = 0;
        while(current.next != head) {
            if(current.next.data.equals(data)) {
                current.next = current.next.next;
                size--;
                return index;
            }
            current = current.next;
        }
        return -1;
    }

    @Override
    public int size() {
        int size = 0;
        Node<T> current = head;
        while (current.next != head) {
            current = current.next;
            size++;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null || size == 0;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public boolean contains(T data) {
        Node<T> current = head;
        while (current.next != head) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int indexOf(T data) {
        Node<T> current = head;
        int index = 0;
        while (current.next != head) {
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
        Node<T> current = this.head;
        while (current.next != head) {
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
        Node<T> slow = head.next;
        Node<T> fast = head.next;
        while (slow != head && fast != head && fast.next != head) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast && slow != head) {
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
