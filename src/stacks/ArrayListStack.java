package stacks;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class ArrayListStack {

    private ArrayList<Integer> list;

    public ArrayListStack() {
        list = new ArrayList<>();
    }

    public void push(int item) {
        list.add(item);
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int item = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
