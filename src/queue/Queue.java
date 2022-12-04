package queue;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Queue<T> {
    T[] queue;
    int cap;

    private int count;

    private int rear;
    private int front;

    public Queue(int initialCapacity){
        cap = initialCapacity;
        count = 0;
        rear = -1;
        front = 0;
        queue = (T[]) Array.newInstance(Object[].class.componentType(), cap);
    }

    public void enqueue(T element){
        if(isFull()){
            maximize();
        } else{
            rear = (rear + 1) % cap;
            queue[rear] = element;
            count++;
        }
    }

    public T dequeue(){
        if(isEmpty()){
            throw new RuntimeException("Queue is Empty");
        } else{

          T element = queue[front];
          queue[front] = null;
          front = (front + 1) % cap;
          count--;

          return element;
        }
    }

    public T peek(){
        if(isEmpty()){
            throw  new RuntimeException("Queue is Empty");
        } else{
            return queue[front];
        }
    }

    public boolean isEmpty(){
        return queue.length == 0;
    }

    private boolean isFull(){
        return count == cap;
    }
    private void maximize(){
        int size = queue.length * 2;
        queue = Arrays.copyOf(queue, size);
        cap = size;
    }

    public int getSize(){
        return count + 1;
    }

}
