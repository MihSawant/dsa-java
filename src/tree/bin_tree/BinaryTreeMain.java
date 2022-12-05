package tree.bin_tree;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();


       tree.insert(10);
       tree.insert(20);
       tree.insert(30);
       tree.insert(40);

       tree.inOrderTraversal();
       tree.getTotalNodes();
    }
}
