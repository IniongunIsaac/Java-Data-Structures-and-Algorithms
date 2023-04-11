package hashtables;

import utils.Employee;

import java.util.HashMap;
import java.util.Map;

public class HashtableMain {
    public static void main(String[] args) {
        Employee jane = new Employee("Jane", "Doe", 1);
        Employee ice = new Employee("Ice", "Bunde", 2);
        Employee cube = new Employee("Tainya", "Achin", 3);
        Employee smith = new Employee("Mesuur", "Tindi", 4);

//        ChainedHashtable hashtable = new ChainedHashtable();
//
//        hashtable.put("jane", jane);
//        hashtable.put("ice", ice);
//        hashtable.put("cube", cube);
//        hashtable.put("smith", smith);
//
//        hashtable.print();
//
//        System.out.println(hashtable.get("cube"));
//        System.out.println(hashtable.remove("jane"));

        Map<String, Employee> hashMap = new HashMap<>();

        hashMap.put("jane", jane);
        hashMap.put("ice", ice);
        hashMap.put("cube", cube);
        hashMap.put("smith", smith);

        hashMap.forEach((key, value) -> System.out.println(key + " => " + value));

        for (Employee employee : hashMap.values()) {
            System.out.println(employee);
        }
    }
}
