public  static void main(String[] args) {
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

}