package linked_list.doubly;

public class DoublyLinkedList {
    static class Node{
        int data;
        Node prv;
        Node next;

        public String toString(){
            return ""+data;
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

        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int data){
        if(tail == null){
            insertFirst(data);
        } else{
            Node newNode = new Node();
            newNode.data = data;

            newNode.prv = tail;
            tail.next = newNode;

            tail = newNode;
            size++;
        }
    }

    public void insertAfter(int n, int value){
       Node node = head;
       while(node != null){
           if(node.data == n){
               Node newNode = new Node();
               newNode.data = value;

              Node next = node.next;
               newNode.prv = node;
               newNode.next = next;
               next.prv = newNode;
               node.next = newNode;
               size++;
           }
           node = node.next;
       }
    }

    public void deleteFirst(){
        if(head == null) throw new RuntimeException("Linked List is not created");
        head = head.next;
        size--;
    }

    public void deleteLast(){
        if(tail == null) throw new RuntimeException("Linked List is not created");
        tail = tail.prv;
        tail.next = null;
        size--;
    }

    public boolean delete(int n){
        Node node = head;

        if(head.data == n) {
            deleteFirst();
            return true;
        } else if(tail.data == n){
            deleteLast();
            return true;
        } else{

            while(node != null){
                if(node.data == n){
                    // found the node
                    Node prvNode = node.prv;
                    Node next = node.next;

                    prvNode.next = next;
                    next.prv = prvNode;
                    return true;
                }
                node = node.next;
            }
        }
        return false;
    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.println(node);
            node = node.next;
        }
    }

    public int getSize(){
        return size;
    }
}
