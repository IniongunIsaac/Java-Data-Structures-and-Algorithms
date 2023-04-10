package linkedlists;

import utils.Employee;

import java.util.ArrayList;
import java.util.List;

public class ListsMain {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Jabe", "Jogn", 123));
        employeeList.add(new Employee("Jabe", "Jogn", 123));
        employeeList.add(new Employee("Jabe", "Jogn", 123));
        employeeList.add(new Employee("Jabe", "Jogn", 123));

        employeeList.forEach(employee -> System.out.println(employee));

        Employee[] employees = employeeList.toArray(new Employee[0]);

        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }
}
