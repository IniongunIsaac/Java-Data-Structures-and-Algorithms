package linkedlists;

import utils.Employee;

public class EmployeeDoublyNode {
    private Employee employee;
    private EmployeeDoublyNode next;
    private EmployeeDoublyNode previous;

    public EmployeeDoublyNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeDoublyNode getNext() {
        return next;
    }

    public void setNext(EmployeeDoublyNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return employee.toString();
    }

    public EmployeeDoublyNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeDoublyNode previous) {
        this.previous = previous;
    }
}
