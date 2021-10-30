package linkedlist;

import java.util.Iterator;

class DoublyNode<T> extends Node<T> {
    public DoublyNode<T> prev;
    public DoublyNode<T> next;
    public DoublyNode(T data) {
        super(data);
        this.next = null;
        this.prev = null;
    }
}

interface LinkedListInterface<T> extends Iterable<T> {
    public void add(T data);
    public void add(int index, T data);
    public T get(int index);
    public T remove(int index);
    public int remove(T data);
    public int size();
    public boolean isEmpty();
    public void clear();
    public boolean contains(T data);
    public int indexOf(T data);
    public int lastIndexOf(T data);
    public boolean detectLoop();
}

public class LinkedList<T> implements LinkedListInterface<T> {
    protected Node<T> head;

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void add(T data) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void add(int index, T data) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public T get(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T remove(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int remove(T data) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean contains(T data) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int indexOf(T data) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int lastIndexOf(T data) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean detectLoop() {
        // TODO Auto-generated method stub
        return false;
    }
}