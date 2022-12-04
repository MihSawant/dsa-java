package linked_list;

public class SinglyLinkedList {

    static class Node{
        int data;
        Node next;

        public String toString(){
            return " "+data;
        }
    }

    Node head;
    Node tail;
    int size;

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;

        newNode.next = head;
        head = newNode;

        if(tail == null) tail = newNode;
        size++;
    }

    public void insertLast(int data){
        if(tail == null){
            insertFirst(data);
        } else{
            Node newNode = new Node();

            newNode.data = data;
            newNode.next = null;
            tail.next = newNode;

            tail = newNode;
            size++;
        }
    }

    public void insertAt(int data, int index){
        if(index > size) throw new RuntimeException("Index out of Size, Node does not exists");
        if(index == 0){
            insertFirst(data);
        } else if(index == size ){
            insertLast(data);
        } else{
            Node node = head;
            int ptr = 1;
            Node prvNode = node;
            while (node != null){
                if(ptr == index){
                    Node newNode = new Node();
                    newNode.data = data;
                    // insert in between
                    prvNode.next = newNode;
                    newNode.next = node;

                    size++;
                }
                ptr++;
                // previous Node becomes the node before moving forward
                prvNode = node;
                node = node.next;
            }
        }
    }

    public void insertAfterNode(int n, int value){
       Node node = head;
       while(node != null){
           if(node.data == n){
               System.out.println("Found "+node);
               Node newNode = new Node();
               newNode.data = value;

               // more easy to read
               Node next = node.next;
               node.next = newNode;
               newNode.next = next;
               // also works but little confusing to read
//                newNode.next = node.next;
//                node.next = newNode;
               size++;
               return;
           }
           node = node.next;
       }
    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.println(node);
            node = node.next;
        }
    }
}
