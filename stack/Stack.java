package stack;

import java.util.Iterator;

class StackException extends Exception {
    public StackException(String message) {
        super("Stack is empty - Underflow");
    }
}

class UnderflowException extends StackException {
    public UnderflowException() {
        super("Stack is empty - Underflow");
    }
}

class OverflowException extends StackException {
    public OverflowException() {
        super("Stack is full - Overflow");
    }
}

interface StackInterface<T> {
    public void push(T element) throws OverflowException;
    public T pop() throws UnderflowException;
    public T peek() throws UnderflowException;
    public boolean isEmpty();
    public boolean isFull();
    public int count();
    public void change(int index, T element);
}

public class Stack<T> implements StackInterface<T> {
    private T[] stack;
    private int top;
    private int maxSize;

    Stack(int size) {
        maxSize = size;
        stack = (T[]) new Object[maxSize];
        top = -1;
    }

    @Override
    public void push(T element) throws OverflowException {
        if (top == maxSize - 1) {
            throw new OverflowException();
        }
        stack[++top] = element;
    }

    @Override
    public T pop() throws UnderflowException {
        if (top == -1) {
            throw new UnderflowException();
        }
        return stack[top--];
    }

    @Override
    public T peek() throws UnderflowException {
        if (top == -1) {
            throw new UnderflowException();
        }
        return stack[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == maxSize - 1;
    }

    @Override
    public int count() {
        return top + 1;
    }

    @Override
    public void change(int index, T element) {
        if (index > top || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        stack[index] = element;
    }
}
