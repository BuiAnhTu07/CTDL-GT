
public class Main {
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
}