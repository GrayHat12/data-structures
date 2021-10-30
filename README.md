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
    public void quick_sort();
    public void merge_sort();
    public int linear_search(T element);
    public int binary_search(T element);
}
```

* [`public void selection_sort();`](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/array/Array.java#L29)
* [`public void bubble_sort();`](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/array/Array.java#L43)
* [`public void insertion_sort();`](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/array/Array.java#L58)
* [`public void quick_sort();`](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/array/Array.java#L103)
* [`public void merge_sort();`](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/array/Array.java#L148)
* [`public int linear_search(T element);`](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/array/Array.java#L153)
* [`public int binary_search(T element);`](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/array/Array.java#L177)

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

* `public void add(T data);` : [Singly](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/SinglyLinkedList.java#L12) | [Doubly](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/DoublyLinkedList.java#L18) | [Circular](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/CircularLinkedList.java#L15)
* `public void add(int index, T data);` : [Singly](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/SinglyLinkedList.java#L26) | [Doubly](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/DoublyLinkedList.java#L33) | [Circular](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/CircularLinkedList.java#L32)
* `public T get(int index);` : [Singly](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/SinglyLinkedList.java#L45) | [Doubly](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/DoublyLinkedList.java#L49) | [Circular](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/CircularLinkedList.java#L52)
* `public T remove(int index);` : [Singly](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/SinglyLinkedList.java#L57) | [Doubly](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/DoublyLinkedList.java#L61) | [Circular](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/CircularLinkedList.java#L64)
* `public int remove(T data);` : [Singly](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/SinglyLinkedList.java#L78) | [Doubly](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/DoublyLinkedList.java#L75) | [Circular](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/CircularLinkedList.java#L85)
* `public int size();` : [Singly](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/SinglyLinkedList.java#L93) | [Doubly](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/DoublyLinkedList.java#L91) | [Circular](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/CircularLinkedList.java#L100)
* `public boolean isEmpty();` : [Singly](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/SinglyLinkedList.java#L104) | [Doubly](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/DoublyLinkedList.java#L102) | [Circular](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/CircularLinkedList.java#L111)
* `public void clear();` : [Singly](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/SinglyLinkedList.java#L109) | [Doubly](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/DoublyLinkedList.java#L107) | [Circular](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/CircularLinkedList.java#L116)
* `public boolean contains(T data);` : [Singly](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/SinglyLinkedList.java#L114) | [Doubly](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/DoublyLinkedList.java#L113) | [Circular](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/CircularLinkedList.java#L122)
* `public int indexOf(T data);` : [Singly](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/SinglyLinkedList.java#L126) | [Doubly](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/DoublyLinkedList.java#L125) | [Circular](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/CircularLinkedList.java#L134)
* `public int lastIndexOf(T data);` : [Singly](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/SinglyLinkedList.java#L140) | [Doubly](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/DoublyLinkedList.java#L139) | [Circular](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/CircularLinkedList.java#L148)
* `public boolean detectLoop();` : [Singly](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/SinglyLinkedList.java#L155) | [Doubly](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/DoublyLinkedList.java#L153) | [Circular](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/linkedlist/CircularLinkedList.java#L163)

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

* [`public void push(T element) throws OverflowException;`](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/stack/Stack.java#L45)
* [`public T pop() throws UnderflowException;`](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/stack/Stack.java#L53)
* [`public T peek() throws UnderflowException;`](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/stack/Stack.java#L61)
* [`public boolean isEmpty();`](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/stack/Stack.java#L69)
* [`public boolean isFull();`](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/stack/Stack.java#L74)
* [`public int count();`](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/stack/Stack.java#L79)
* [`public void change(int index, T element);`](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/stack/Stack.java#L84)

## Queue

A Queue is a linear data structure that follows the FIFO (First-In-First-Out) principle.

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

* `public void enqueue(T element) throws QueueOverflowException;` : [Linear](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/queue/LinearQueue.java#L10) | [Circular](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/queue/CircularQueue.java#L10) | [Priority](https://github.com/GrayHat12/data-structures/blob/4c9f5ab14caf2a86ebe31ccc3dec85af302dd408/queue/PriorityQueue.java#L47)
* `public T dequeue() throws QueueUnderflowException;` : [Linear](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/queue/LinearQueue.java#L19) | [Circular](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/queue/CircularQueue.java#L19) | [Priority](https://github.com/GrayHat12/data-structures/blob/4c9f5ab14caf2a86ebe31ccc3dec85af302dd408/queue/PriorityQueue.java#L55)
* `public T peek() throws QueueUnderflowException;` : [Linear](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/queue/LinearQueue.java#L29) | [Circular](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/queue/CircularQueue.java#L30) | [Priority](https://github.com/GrayHat12/data-structures/blob/4c9f5ab14caf2a86ebe31ccc3dec85af302dd408/queue/PriorityQueue.java#L72)
* `public void clear();` : [Linear](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/queue/LinearQueue.java#L52) | [Circular](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/queue/CircularQueue.java#L53) | [Priority](https://github.com/GrayHat12/data-structures/blob/4c9f5ab14caf2a86ebe31ccc3dec85af302dd408/queue/PriorityQueue.java#L95)

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

* [`public void insert(T data);`](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/tree/BinarySearchTree.java#L10)
* [`public void remove(T data);`](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/tree/BinarySearchTree.java#L35)
* [`public boolean contains(T data);`](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/tree/BinarySearchTree.java#L67)
* [`public Iterator<T> inorder();`](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/tree/BinarySearchTree.java#L94)
* [`public Iterator<T> preorder();`](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/tree/BinarySearchTree.java#L110)
* [`public Iterator<T> postorder();`](https://github.com/GrayHat12/data-structures/blob/b9b0503b06eaf256f29a0f66383dac3d5f073d8a/tree/BinarySearchTree.java#L126)