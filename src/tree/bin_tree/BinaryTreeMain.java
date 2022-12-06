package tree.bin_tree;

public class BinaryTreeMain {
    public static void main(String[] args) {
//        BinaryTree<Integer> tree = new BinaryTree<>();
          BinaryTree<Character> btree = new BinaryTree<>();

//       tree.insert(10);
//       tree.insert(20);
//       tree.insert(30);
//       tree.insert(40);
//
//       tree.inOrderTraversal();
//       tree.getTotalNodes();
       // trying another example
        btree.insert('A');
        btree.insert('B');
        btree.insert('C');
        btree.insert('D');
        btree.insert('E');
        btree.insert('F');
        btree.insert('G');
        btree.insert('H');
        btree.insert('I');


        btree.getTotalNodes();
        btree.preOrderTraversal();
    }
}
