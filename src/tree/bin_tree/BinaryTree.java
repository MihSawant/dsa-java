package tree.bin_tree;



import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {

    private Node root = null;
    private int nodeCount = 0;

    private class Node{
        Node right;
        Node left;
        private final T element;

        public Node(T element){
            this.element = element;
            this.left = null;
            this.right = null;
        }

        public Node(T element, Node left, Node right){
            this.element = element;
            this.left = left;
            this.right = right;
        }
    }

    public boolean insert(T element){
        if(element == null) return false;
        if(root == null){
            root = new Node(element);
            nodeCount++;
        }
        insert(root, element);
        return true;
    }

    // We have the root node now other nodes are to be inserted
    private void insert(Node node, T element){
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()){
           node = queue.peek();
           queue.poll();

           if(node.left == null){
               node.left = new Node(element);
               nodeCount++;
               break;
           } else {
               queue.add(node.left);
           }

           if(node.right == null){
               node.right = new Node(element);
               nodeCount++;
               break;
           } else{
               queue.add(node.right);
           }
        }
    }

    public void inOrderTraversal(){
        printInOrder(root);
    }

    public void preOrderTraversal(){
        printPreOrder(root);
    }

    public void postOrderTraversal(){
        printPostOrder(root);
    }

    public void getTotalNodes(){
        System.out.println("Total Nodes: "+nodeCount);
    }

    private void printInOrder(Node node){
        if(node != null){
            printInOrder(node.left);
            System.out.print(" "+node.element);
            printInOrder(node.right);
        }
    }

    private void printPreOrder(Node node){
        if(node != null){
            System.out.println(" "+node.element);
            printPreOrder(node.left);
            printPreOrder(node.right);
        }
    }

    private void printPostOrder(Node node){
        if(node != null){
          printPostOrder(node.left);
          printPostOrder(node.right);
            System.out.println(" "+node.element);
        }
    }
}
