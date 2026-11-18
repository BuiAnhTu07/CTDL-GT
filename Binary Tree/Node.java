public class Node {
    int data;
    Node left;
    Node right;

public Node(int data) {
    this.data = data;
    left = null;
    right = null;
  }
}

 class BTS {
    Node root;

    public  BTS() {
        root = null;
    }

 //Insert
 public Node Insert(Node root, int value)  {
    if (root == null) {
        return new Node(value);
    }

    if (value < root.data) {
        root.left = Insert(root.left, value);
    } else if (value > root.data) {
        root.right = Insert(root.right, value);
    }
    return root;
 }

 public  void LNR(Node root) {
    if (root != null) {
        LNR(root.left);
        System.out.println(root.data + "");
        LNR(root.right);
    }
 }
}

