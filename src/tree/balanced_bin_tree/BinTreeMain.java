package tree.balanced_bin_tree;

public class BinTreeMain {
    public static void main(String[] args) {
        BinTree<Integer> bst = new BinTree<>();

        bst.insert(10);
        bst.insert(15);
        bst.insert(5);
        bst.insert(20);
        bst.insert(2);

//        System.out.println("Inorder Traversal:");
//        bst.printInOrder();
//        System.out.println("Preorder traversal:");
//        bst.printPreOrder();
//        System.out.println("Postorder traversal:");
//        bst.printPostOrder();

        // search for a node
        bst.search(2);
        bst.search(3);
        bst.search(15);
    }
}
