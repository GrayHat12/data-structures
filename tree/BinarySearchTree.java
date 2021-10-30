package tree;

import java.util.Iterator;

import linkedlist.SinglyLinkedList;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> implements TreeInterface<T> {

    @Override
    public void insert(T data) {
        BinaryTreeNode<T> newNode = new BinaryTreeNode<>(data);
        if (this.root == null) {
            this.root = newNode;
            return;
        }
        BinaryTreeNode<T> current = this.root;
        while (current != null) {
            if (data.compareTo(current.data) <= 0) {
                if (current.left == null) {
                    current.left = newNode;
                    return;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    return;
                }
                current = current.right;
            }
        }
    }

    @Override
    public void remove(T data) {
        if (this.root == null) {
            throw new NullPointerException("Tree is empty");
        }
        BinaryTreeNode<T> current = this.root;
        BinaryTreeNode<T> parent = null;
        boolean isLeftChild = false;
        while (current != null) {
            if (data.compareTo(current.data) == 0) {
                break;
            } else if (data.compareTo(current.data) < 0) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (parent == null) {
            throw new NullPointerException("Data not found");
        }

        if (isLeftChild)
            parent.left = null;
        else
            parent.right = null;

    }

    @Override
    public boolean contains(T data) {
        if (this.root == null) {
            return false;
        }
        BinaryTreeNode<T> current = this.root;
        while (current != null) {
            if (data.compareTo(current.data) == 0) {
                return true;
            } else if (data.compareTo(current.data) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    private void inorder(BinaryTreeNode<T> node, SinglyLinkedList<T> list) {
        if (node == null) {
            return;
        }
        inorder(node.left, list);
        list.add(node.data);
        inorder(node.right, list);
    }

    @Override
    public Iterator<T> inorder() {
        SinglyLinkedList<T> list = new SinglyLinkedList<>();
        inorder(this.root, list);
        return list.iterator();
    }

    private void preorder(BinaryTreeNode<T> node, SinglyLinkedList<T> list) {
        if (node == null) {
            return;
        }
        list.add(node.data);
        inorder(node.left, list);
        inorder(node.right, list);
    }

    @Override
    public Iterator<T> preorder() {
        SinglyLinkedList<T> list = new SinglyLinkedList<>();
        preorder(this.root, list);
        return list.iterator();
    }

    private void postorder(BinaryTreeNode<T> node, SinglyLinkedList<T> list) {
        if (node == null) {
            return;
        }
        inorder(node.left, list);
        inorder(node.right, list);
        list.add(node.data);
    }

    @Override
    public Iterator<T> postorder() {
        SinglyLinkedList<T> list = new SinglyLinkedList<>();
        postorder(this.root, list);
        return list.iterator();
    }

}
