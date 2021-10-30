package queue;

class QueueException extends Exception {
    public QueueException(String s) {
        super(s);
    }
}

class QueueOverflowException extends QueueException {
    public QueueOverflowException() {
        super("Queue is full");
    }
}

class QueueUnderflowException extends QueueException {
    public QueueUnderflowException() {
        super("Queue is empty");
    }
}

interface QueueInterface<T> {
    public void enqueue(T element) throws QueueOverflowException;
    public T dequeue() throws QueueUnderflowException;
    public T peek() throws QueueUnderflowException;
    public boolean isEmpty();
    public boolean isFull();
    public int size();
    public void clear();
}

public class Queue<T> {
    protected T[] queue;
    protected int front;
    protected int rear;
    protected int maxSize;

    public Queue(int size) {
        maxSize = size;
        queue = (T[]) new Object[maxSize];
        front = 0;
        rear = 0;
    }
}
