package collections;
import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Creating a HashSet
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

  

        // Iterating over the list
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Iterating over the set
        for (int num : set) {
            System.out.println(num);
        }

       
    }
}

