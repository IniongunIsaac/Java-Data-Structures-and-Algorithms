package stacks;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class LinkedListStack {

    private final LinkedList<Integer> list;

    public LinkedListStack() {
        list = new LinkedList<>();
    }

    public void push(int item) {
        list.addLast(item);
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.removeLast();
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.getLast();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}

