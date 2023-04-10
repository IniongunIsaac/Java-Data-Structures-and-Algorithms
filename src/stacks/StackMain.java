package stacks;

import java.util.EmptyStackException;

public class StackMain {
    public static void main(String[] args) {
        ArrayListStack stack = new ArrayListStack();
        //System.out.println(stack.peek());
        LinkedListStack linkedListStack = new LinkedListStack();
        try {
            System.out.println(linkedListStack.peek());
        } catch (EmptyStackException exception) {
            System.out.println("Stack is empty");
        }
    }
}
