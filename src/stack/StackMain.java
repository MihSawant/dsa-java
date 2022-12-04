package stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);
        myStack.push(9);
        myStack.pop();
        myStack.push(10);
        // At this point stack is full
        myStack.push(11);
        myStack.pop();
        myStack.push(12);

        myStack.printElements();
        System.out.println("Topmost element of stack: "+myStack.peek());

    }
}
