package linkedlists;

public class EmployeeDoublyLinkedList {
    private EmployeeDoublyNode head;
    private EmployeeDoublyNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeDoublyNode node = new EmployeeDoublyNode(employee);

        if (isEmpty()) {
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }

        node.setPrevious(null);
        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeDoublyNode node = new EmployeeDoublyNode(employee);
        if (isEmpty()) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        node.setNext(null);
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeDoublyNode current = head;

        System.out.println("HEAD => ");
        while (current != null) {
            System.out.println(current);
            System.out.println(" <===> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public EmployeeDoublyNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        EmployeeDoublyNode removedNode = head;

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }

        head = removedNode.getNext();
        removedNode.setNext(null);
        size--;
        return removedNode;
    }

    public EmployeeDoublyNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }

        EmployeeDoublyNode removedNode = tail;

        if (removedNode.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }

        tail = removedNode.getPrevious();
        removedNode.setPrevious(null);
        size--;

        return removedNode;
    }
}
