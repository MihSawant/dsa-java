package linked_list.doubly;


public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(10);
        dll.insertLast(20);
        dll.insertLast(30);
        dll.insertLast(40);
        dll.insertLast(50);
        dll.insertLast(60);

        dll.insertAfter(10, 15);
        dll.insertAfter(15, 17);

        dll.display();
        System.out.println("Insert after node 40 45");
        dll.insertAfter(40, 45);
        dll.display();

        System.out.println("Deleting head");
        dll.deleteFirst();
        dll.display();


        System.out.println("Deleting tail");
        dll.deleteLast();
        dll.display();

        System.out.println("Deleting 20");
        boolean delete20 = dll.delete(20);
        dll.display();

        System.out.println("Deleting 40");
        dll.delete(40);
        dll.display();

    }
}
