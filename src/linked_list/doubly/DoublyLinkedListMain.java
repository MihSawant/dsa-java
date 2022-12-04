package linked_list.doubly;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(10);
        dll.insertLast(20);
        dll.insertLast(30);
        dll.insertLast(40);
        dll.insertLast(50);

        dll.display();
        System.out.println("Insert after node 40 45");
        dll.insertAfter(40, 45);
        dll.display();

        if(dll.getSize() != 6) throw new AssertionError("Size must be 6 as new Node is added in between");
    }
}
