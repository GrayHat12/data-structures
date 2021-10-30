# Data Structures

1. [Array](#array)
2. [Linked List](#linked-list)
3. [Stack](#stack)
4. [Queue](#queue)
5. [Binary Search Tree](#binary-search-tree)


## Array

An array is a collection of items stored at contiguous memory locations.

### Implementation

```java
interface ArrayInterface<T> extends Iterable<T> {
    public void add(T element);
    public T get(int index);
    public void set(int index, T element);
    public void remove(int index);
    public int size();
    public void selection_sort();
    public void bubble_sort();
    public void insertion_sort();
    public void quick_sort(PIVOT pivot);
    public void merge_sort();
    public int linear_search(T element);
    public int binary_search(T element);
}
```

## Linked List

A linked list is a sequence of data structures, which are connected together via links.

* Singly Linked List
* Doubly Linked List
* Circular Linked List

### Implementation

```java
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
```

## Stack

A Stack is a linear data structure that follows the LIFO (Last-In-First-Out) principle.

### Implementation

```java
interface StackInterface<T> {
    public void push(T element) throws OverflowException;
    public T pop() throws UnderflowException;
    public T peek() throws UnderflowException;
    public boolean isEmpty();
    public boolean isFull();
    public int count();
    public void change(int index, T element);
}
```

## Queue

A Queue is a linear data structure that follows the LIFO (First-In-First-Out) principle.

* Linear Queue
* Circular Queue
* Priority Queue (using Singly Linked List)

### Implementation

```java
interface QueueInterface<T> {
    public void enqueue(T element) throws QueueOverflowException;
    public T dequeue() throws QueueUnderflowException;
    public T peek() throws QueueUnderflowException;
    public boolean isEmpty();
    public boolean isFull();
    public int size();
    public void clear();
}
```

## Binary Search Tree

Binary Search tree can be defined as a class of binary trees, in which the nodes are arranged in a specific order, i.e, the left subtree of a node contains only nodes with keys less than the node’s key, and the right subtree of a node contains only nodes with keys greater than the node’s key.

### Implementation

```java
interface TreeInterface<T> {
    public void insert(T data);
    public void remove(T data);
    public boolean contains(T data);
    public Iterator<T> inorder();
    public Iterator<T> preorder();
    public Iterator<T> postorder();
}
```