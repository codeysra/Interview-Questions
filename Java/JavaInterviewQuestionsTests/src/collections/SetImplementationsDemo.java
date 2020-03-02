package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplementationsDemo {

    public static void main(String[] args) {
        HashSet<Long> t = new HashSet<>();

        System.out.println("HashSet");
        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);
        System.out.println(numbers);

        System.out.println("\nLinkedHashSet");
        numbers = new LinkedHashSet<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);
        System.out.println(numbers);

        System.out.println("\nTreeHashSet");
        numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);
        System.out.println(numbers);
    }
}
