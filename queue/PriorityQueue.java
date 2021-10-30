package queue;
import linkedlist.SinglyLinkedList;
import linkedlist.Node;

class PriorityNode<T> extends Node<T> {

    public int priority;

    public PriorityNode(T data) {
        super(data);
        this.priority = 0;
    }

    public PriorityNode(T data, int priority) {
        super(data);
        this.priority = priority;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof PriorityNode) {
            PriorityNode<?> node = (PriorityNode<?>) obj;
            return this.data.equals(node.data);
        }
        else return super.equals(obj);
    }
}

public class PriorityQueue<T> implements QueueInterface<T> {

    protected SinglyLinkedList<PriorityNode<T>> queue;
    protected int maxSize;

    public PriorityQueue(int size) {
        this.maxSize = size;
        this.queue = new SinglyLinkedList<PriorityNode<T>>();
    }

    @Override
    public void enqueue(T element) throws QueueOverflowException {
        if (this.isFull()) {
            throw new QueueOverflowException();
        }
        this.queue.add(new PriorityNode<T>(element));
    }

    @Override
    public T dequeue() throws QueueUnderflowException {
        if (this.isEmpty()) {
            throw new QueueUnderflowException();
        }
        int size = this.queue.size();
        PriorityNode<T> max = this.queue.get(0);
        for (int i = 1; i < size; i++) {
            PriorityNode<T> temp = this.queue.get(i);
            if (temp.priority > max.priority) {
                max = temp;
            }
        }
        this.queue.remove(max);
        return max.data;
    }

    @Override
    public T peek() throws QueueUnderflowException {
        if (this.isEmpty()) {
            throw new QueueUnderflowException();
        }
        return this.queue.get(0).data;
    }

    @Override
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    @Override
    public boolean isFull() {
        return this.queue.size() == this.maxSize;
    }

    @Override
    public int size() {
        return this.queue.size();
    }

    @Override
    public void clear() {
        this.queue.clear();
    }

}
