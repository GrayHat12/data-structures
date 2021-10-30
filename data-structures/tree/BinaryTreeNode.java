package tree;

public class BinaryTreeNode<T> {
    protected BinaryTreeNode<T> left;
    protected BinaryTreeNode<T> right;
    protected T data;

    public BinaryTreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
