public class Question4 extends BinaryTree {
	  public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node("A");
	  }
}

class Node<T> {
    private T value = null;
    private Node left = null;
    private Node right = null;
    private Node parent = null;
    private int helperSize = 0;

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    private void setParent(Node parent) {
        this.parent = parent;
    }

    //parent
    public Node getParent() {
        return parent;
    }

    public int getHelperSize() {
        return this.helperSize;
    }

    //addLeft
    public void addLeft(Node child) {
        child.setParent(this);
        this.left = child;
        this.size ++;
    }

    //hasLeft
    public boolean hasLeft() {
        if (this.left != null)
            return True
        else
            return False
    }

    //addRight
    public void addRight(Node child) {
        child.setParent(this);
        this.right = child;
        this.size ++;
    }

    //hasRight
    public boolean hasRight() {
        if (this.right != null)
            return True
        else
            return False
    }

    //numChildren
    public int numChildren() {
        int total = 0;
        total += this.getHelperSize();
        if this.hasLeft()
            total += this.left.numChildren()
        if this.hasRight()
            total += this.right.numChildren()
        return total;
    }

    //isRoot
    public boolean isRoot() {
        if (this.getParent() == null)
            return True
        else
            return False
    }

    //isInternal
    public boolean isInternal(){
        if (this.left!=null || this.right!=null)
            return true;
        else
            return false;
    }

    //isExternal
    public boolean isExternal(Node node){
        if (this.left==null && this.right==null)
            return true;
        else
            return false;
    }

    //depth
    public int depth() {
        if (node.getParent() == null)
           return 0;
        else
           return (1 + node.getParent().depth());
    }

    public int height() {
        int height = 0;
        int left = 0;
        int right = 0;
        if (this.left != null)
            left = this.left.height();
        if (this.right != null)
            right = this.right.height();
        return (1 + left + right);
    }
}

class BinaryTree {
    private Node root= null;

    //root
    public Node root() {
        return this.root;
    }

    public void setRoot(Node node) {
        this.root = node;
    }

    //size
    public int size(Node node) {
        return this.root.numChildren();
    }

    //isEmpty
    public boolean isEmpty()
    {
        if (root == null)
            return True;
        else
            return False;
    }

    public void isInternal(Node node){
        if (node.left
        this.right = child;!=null)
            return true;
        else if (node.right!=null)
            return true;
        else
            return false;
    }

    public void isExternal(Node node){
        if (node.left==null && node.right==null)
            return true;
        else
            return false;
    }

    //height
    public int height() {
        return this.root.height();
    }
}
