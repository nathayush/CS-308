public class Question5 extends BinarySearchTree {
	  public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert("E");
        bst.insert("A");
        bst.insert("S");
        bst.insert("Y");
        bst.insert("Q");
        bst.insert("U");
        bst.insert("E");
        bst.insert("S");
        bst.insert("T");
        bst.insert("I");
        bst.insert("O");
        bst.insert("N");

        System.out.println("Inorder traversal");
        bst.printInorder();
	  }
}

class Node<T> {
    public String value;
    public Node left;
    public Node right;

    public Node(String value) {
        this.value = value;
    }
}

class BinarySearchTree {
    public Node root;

    public void insert(String value) {
        Node node = new Node<>(value);

        if ( root == null ) {
            root = node;
            return;
        }
        insertRec(root, node);
    }

    private void insertRec(Node latestRoot, Node node) {

        if (latestRoot.value.compareTo(node.value) == 0) {
            return;
        } else if (latestRoot.value.compareTo(node.value) > 0) {
            if (latestRoot.left == null) {
                latestRoot.left = node;
                return;
            } else {
                insertRec(latestRoot.left, node);
            }
        } else {
            if (latestRoot.right == null){
                latestRoot.right = node;
                return;
            } else {
                insertRec(latestRoot.right, node);
            }
        }
    }

    public void printInorder() {
        printInOrderRec(root);
        System.out.println("");
    }

    private void printInOrderRec(Node currRoot) {
        if (currRoot == null) {
            return;
        }
        printInOrderRec(currRoot.left);
        System.out.print(currRoot.value + " ");
        printInOrderRec(currRoot.right);
    }
}
