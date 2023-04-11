package hashtables;

import utils.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashtable {

    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashtable() {
        hashtable = new LinkedList[10];
        for (int i = 0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<>();
        }
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);

        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee storedEmployee;

        while (iterator.hasNext()) {
            storedEmployee = iterator.next();
            if (storedEmployee.key.equals(key)) {
                return storedEmployee.employee;
            }
        }

        return null;
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);

        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee storedEmployee = null;
        int index = -1;
        while (iterator.hasNext()) {
            storedEmployee = iterator.next();
            index++;
            if (storedEmployee.key.equals(key)) {
                break;
            }
        }

        if (storedEmployee == null || !storedEmployee.key.equals(key)) {
            return null;
        } else {
            hashtable[hashedKey].remove(index);
            return storedEmployee.employee;
        }
    }

    private int hashKey(String key) {
        //return key.length() % hashtable.length;
        return Math.abs(key.hashCode() % hashtable.length);
    }

    public void print() {
        for (LinkedList<StoredEmployee> storedEmployees : hashtable) {
            if (storedEmployees.isEmpty()) {
                System.out.println("empty");
            } else {
                System.out.println("Non-empty");
                for (StoredEmployee storedEmployee : storedEmployees) {
                    System.out.println(storedEmployee.employee);
                    System.out.println("=>");
                }
                System.out.println("null");
            }
        }
    }
}
