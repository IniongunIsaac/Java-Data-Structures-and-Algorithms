package hashtables;

import utils.Employee;

public class HashtableMain {
    public static void main(String[] args) {
        Employee jane = new Employee("Jane", "Doe", 1);
        Employee ice = new Employee("Ice", "Bunde", 2);
        Employee cube = new Employee("Tainya", "Achin", 3);
        Employee smith = new Employee("Mesuur", "Tindi", 4);

        SimpleHashtable hashtable = new SimpleHashtable();

        hashtable.put("jane", jane);
        hashtable.put("ice", ice);
        hashtable.put("cube", cube);
        hashtable.put("smith", smith);

        hashtable.print();

        System.out.println(hashtable.get("cube"));
    }
}
