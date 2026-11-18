/*public  static void main(String[] args) {
    //Insert
    BTS tree = new BTS();
    tree.root = tree.Insert(tree.root, 30);
    tree.root = tree.Insert(tree.root, 20);
    tree.root = tree.Insert(tree.root, 15);
    tree.root = tree.Insert(tree.root, 45);
    tree.root = tree.Insert(tree.root, 35);
    tree.root = tree.Insert(tree.root, 50);
    tree.root = tree.Insert(tree.root, 25);
   // System.out.println("Root" + tree.root.data);
    //System.out.print("Duyet cay LNR: ");
   // tree.LNR(tree.root);
    System.out.println("Đã thêm các node vào cây BTS :");
    System.out.println("Root: " + tree.root.data);

}*/
public class Main {
    public static void main(String[] args) {

        BTS tree = new BTS();

        // Them node
        int[] a = {50, 30, 70, 20, 40, 60, 80};

        for (int x : a) {
            tree.root = tree.Insert(tree.root, x);
        }

        // Truoc khi xoa
        System.out.println("Truoc khi xoa:");
        tree.LNR(tree.root);

        // Xoa node 50
        tree.root = tree.delete(tree.root, 50);

        // Sau khi xoa
        System.out.println("Sau khi xoa:");
        tree.LNR(tree.root);
    }
}