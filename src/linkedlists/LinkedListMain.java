package linkedlists;

import utils.Employee;

public class LinkedListMain {
    public static void main(String[] args) {
        Employee jabe  = new Employee("Jabe", "Jogn", 123);
        Employee john  = new Employee("John", "Jones", 456);
        Employee kate  = new Employee("Kate", "Ingya", 789);
        Employee karim  = new Employee("Usman", "Zico", 102);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(jabe);
        list.addToFront(john);
        list.addToFront(kate);
        list.addToFront(karim);

        System.out.println(list.getSize());

        list.printList();

        System.out.println(list.removeFromFront());

        System.out.println(list.getSize());

        list.printList();
    }
}
