
/*public class Main {
    public static void main(String[] args) {

        BTS tree = new BTS();

        // Them node
        int[] a = {50, 30, 70, 20, 40, 60, 80}; 
        
        for (int x : a) {
            tree.root = tree.Insert(tree.root, x);
        }

        // Truoc khi xoa
        System.out.println("Truoc khi xoa: ");
        tree.LNR(tree.root);

        // Xoa node 50
        tree.root = tree.delete(tree.root, 50);

        // Sau khi xoa
        System.out.print("Sau khi xoa: ");
        tree.LNR(tree.root);
    }
} */


class Node {
    int key;
    Node left;
    Node right;

    public Node(int key) {
        this.key = key;
        this.left = left;
        this.right = right;
    }
}

class BinarySearchTree {
    Node root;
    public  BinarySearchTree() {
        root = null;
    }

    public void insert(int key) {
        root = insert(root, key);
    }

    public Node insert(Node node, int key) {
        if (node == null) {
            return  new Node(key);
            //Node n = new Node(key);
            //return n;
        }
        if (key < node.key) {
            node.left = insert(node.left, key);
        }
        else if (key > node.key) {
        node.right = insert(node.right, key);
        }
        return  node;
    }

    //public  boolean isEmplty() {
      //  return root == null;
    //}
}

void main() {
    BinarySearchTree tree = new BinarySearchTree();
    int[] values = {50, 30, 70, 20, 40, 60, 80};

    for (int value: values) {
        tree.insert(value);
    }
}