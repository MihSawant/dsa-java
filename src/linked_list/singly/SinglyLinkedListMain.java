package linked_list.singly;

public class SinglyLinkedListMain {
    public static void main(String[] args) {
     SinglyLinkedList list = new SinglyLinkedList();
     list.insertFirst(10);
     list.insertLast(20);
     list.insertLast(30);
     list.insertLast(40);
     list.insertFirst(5);

     list.display();

     System.out.println("Insert 50 at 3 index");
     list.insertAt(50, 3);
     list.display();
     System.out.println("Insert 35 after 30 and 25 after 20");
     list.insertAfterNode(30, 35);
     list.insertAfterNode(20, 25);
     list.display();

     // Delete head
     list.deleteFirst();
     System.out.println("After deletion of head");
     list.display();


     System.out.println("Delete node 25");
     list.delete(25);
     list.display();

     // Delete tail
     list.deleteLast();
     System.out.println("After deletion of tail");
     list.display();

    }
}
