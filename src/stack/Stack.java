package stack;

import java.lang.reflect.Array;
import java.util.EmptyStackException;

class StackFullException extends RuntimeException{
    public StackFullException(String message){
        super(message);
    }
}

public class Stack<T> {

    T[] stack;
    int top;
    final static int CAP = 10;

    public Stack(){
        stack = (T[]) Array.newInstance(Object[].class.componentType(), CAP);
        top = 0;
    }


    public void push(T element) {
        if(isFull()){
            throw new StackFullException("Stack is Full");
        } else{
            stack[top++] = element;
        }
    }

    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        } else{
            T element = stack[--top];
            stack[top] = null;
            return element;
        }
    }

    public T peek(){
        if(isEmpty()){
            throw  new EmptyStackException();
        } else{
            return stack[top - 1];
        }
    }

    public void printElements(){
        System.out.println("Printing Stack:");
        for(T element : stack){
            System.out.println(element);
        }
    }

    private boolean isFull(){
        return top == CAP;
    }

    private boolean isEmpty(){
        return top == 0;
    }

}
