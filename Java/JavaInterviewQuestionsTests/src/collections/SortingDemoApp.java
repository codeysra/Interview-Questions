package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingDemoApp {

    public static void main(String[] args) {
        Person p1 = new Person("Terre", 20, "CA");
        Person p2 = new Person("Abc", 15, "CA");
        Person p3 = new Person("Sun", 38, "AU");
        Person p4 = new Person("Cde", 8, "US");

        List<Person> personList = Arrays.asList(p1,p2,p3,p4);
        System.out.println("Before sorting: ");
        printList(personList);

        System.out.println("After sorting: ");
        Collections.sort(personList);
        printList(personList);

        System.out.println();

        System.out.println("Sorting by name: ");
        Collections.sort(personList, new NameComparator());
        System.out.println("After sorting by name: ");
        printList(personList);

//        System.out.println("Sorting using streams");
//        personList.stream().sorted().forEach(System.out::println);

    }

    private static void printList(final List<Person> persons) {
        persons.forEach(System.out::println);
    }

    static class NameComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.name.compareTo(o2.name);
        }
    }
}
