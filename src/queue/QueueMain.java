package queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<String> people = new Queue<>(5);
        people.enqueue("Mihir");
        people.enqueue("Yash");
        people.enqueue("Hari");
        people.enqueue("Jainil");
        people.enqueue("Azirel");
        people.enqueue("Suresh");
        people.enqueue("Shayan");
        people.enqueue("Aayan");
        people.enqueue("Prasad");
        people.enqueue("Karan");


        people.getSize();
        people.dequeue();
        people.dequeue();
        people.dequeue();
        people.dequeue();

        // azirel is on front
        System.out.println(people.peek());




    }
}
