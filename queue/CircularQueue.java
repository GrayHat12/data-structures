package queue;

public class CircularQueue<T> extends Queue<T> implements QueueInterface<T> {

    CircularQueue(int size) {
        super(size);
    }

    @Override
    public void enqueue(T element) throws QueueOverflowException {
        if (isFull()) {
            throw new QueueOverflowException();
        }
        queue[rear] = element;
        rear = (rear + 1) % maxSize;
    }

    @Override
    public T dequeue() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        }
        T element = queue[front];
        queue[front] = null;
        front += 1;
        return element;
    }

    @Override
    public T peek() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        }
        return queue[front];
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    @Override
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    @Override
    public int size() {
        return (rear - front + maxSize) % maxSize;
    }

    @Override
    public void clear() {
        front = rear = 0;
    }

}
