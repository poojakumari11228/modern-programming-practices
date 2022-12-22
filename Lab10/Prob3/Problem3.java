package Lab10.Prob3;

import java.util.*;

public class Problem3 {

    public static <T>  boolean contains(List<T> list, T item){

        for (T t: list){
            if(t == null && item ==null ) return true;
            if(t == null || item == null ) continue;
            if (t.equals(item)) return true;
        }

        return false;
    }
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Bill", "Joe", "Tom");
        boolean result = contains(list, "Joe");
        System.out.println(result);


        List<Employee> list2 = new ArrayList<>();
        list2.add(new Employee(1, "Pooja", 60000));
        list2.add(new Employee(2, "Jack", 70000));
        list2.add(new Employee(3, "John", 50000));
        Employee emp = new Employee(3, "John", 50000);
        boolean foundIt = contains(list2, emp);
        System.out.println(foundIt);

    }
}
