package linkedlists;

import utils.Employee;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        Employee jabe  = new Employee("Jabe", "Jogn", 123);
        Employee john  = new Employee("John", "Jones", 456);
        Employee kate  = new Employee("Kate", "Ingya", 789);
        Employee karim  = new Employee("Usman", "Zico", 102);
        Employee usman  = new Employee("Innocent", "Aba", 112);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(jabe);
        list.addToFront(john);
        list.addToFront(kate);
        list.addToFront(karim);
        list.addToEnd(usman);

        list.printList();
        System.out.println(list.getSize());

        list.removeFromFront();

        list.printList();
        System.out.println(list.getSize());

        list.removeFromEnd();

        list.printList();
        System.out.println(list.getSize());

    }
}
