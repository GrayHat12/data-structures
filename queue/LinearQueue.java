package queue;

public class LinearQueue<T> extends Queue<T> implements QueueInterface<T> {
    
    LinearQueue(int size) {
        super(size);
    }

    @Override
    public void enqueue(T element) throws QueueOverflowException {
        if (isFull()) {
            throw new QueueOverflowException();
        }
        queue[rear] = element;
        rear = rear + 1;
    }

    @Override
    public T dequeue() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        }
        T element = queue[front];
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
        return rear == maxSize;
    }

    @Override
    public int size() {
        return rear - front;
    }

    @Override
    public void clear() {
        front = rear = 0;
    }
}
