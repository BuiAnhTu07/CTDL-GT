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

 public void LNR(Node root) {
    if (root != null) {
        LNR(root.left);
        System.out.print(root.data + " ");
        LNR(root.right);
    }
 }  
public Node findMin(Node root) {
    while (root.left != null) {
        root = root.left;
    }
    return root;
}

//Xóa Node
public Node delete(Node root, int value) {
    if (root == null) return null;
    if (value < root.data) {
        root.left = delete(root.left, value);
    } else if (value > root.data) {
        root.right = delete(root.right, value);
    }else {
        if (root.left == null) return root.right;
        if (root.right == null) return root.left;

        Node minNode = findMin(root.right);
        root.data = minNode.data;
        root.right = delete(root.right, minNode.data);
    }
    return root;
  }
}

