package stacks;

import utils.Employee;

import java.util.EmptyStackException;

public class ArrayStack {
    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    public void push(Employee employee) {
        if (top == stack.length) {
            //Stack is full so we need to resize it
            Employee[] newStack = new Employee[top * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
        stack[top++] = employee;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public Employee pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        Employee employee = stack[--top];
        stack[top] = null;

        return employee;
    }

    public Employee peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public void print() {
        for (int i = top - 1; top >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
