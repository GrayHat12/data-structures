package tree;

import java.util.Iterator;

interface TreeInterface<T> {
    public void insert(T data);
    public void remove(T data);
    public boolean contains(T data);
    public Iterator<T> inorder();
    public Iterator<T> preorder();
    public Iterator<T> postorder();
}

public class BinaryTree<T> {
    protected BinaryTreeNode<T> root;

    public BinaryTree() {
        root = null;
    }
}
