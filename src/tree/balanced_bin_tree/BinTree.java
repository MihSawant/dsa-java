package tree.balanced_bin_tree;

public class BinTree<T extends Comparable<T>> {

    Node root = null;
    private class Node{
        Node left;
        Node right;
        private final T element;

        public Node(T element){
            this.element = element;
            this.left = null;
            this.right = null;
        }

        public Node(Node left, Node right, T element){
            this.element = element;
            this.left = left;
            this.right = right;
        }
    }

    public boolean insert(T element){
        if(element == null) return false;
        if(root == null){
            root = new Node(element);
        }
        insert(root, element);
        return true;
    }

    private Node insert(Node current, T element){
        if(current == null){
            return new Node(null, null, element);
        }
        if(element.compareTo(current.element) < 0){
            current.left = insert(current.left, element);
        } else{
            current.right = insert(current.right, element);
        }
        return current;
    }

    public void printInOrder(){
        inOrder(root);
    }

    public void printPreOrder(){
        preOrder(root);
    }

    public void printPostOrder(){
        postOrder(root);
    }

    private void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            System.out.println(" "+node.element);
            inOrder(node.right);
        }
    }

    private void preOrder(Node node){
        if(node != null){
            System.out.println(" "+node.element);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    private void postOrder(Node node){
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(" "+node.element);
        }
    }
}
