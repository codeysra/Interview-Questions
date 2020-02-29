package collections;

public class Person implements Comparable<Person> {
    String name;
    int age;
    String country;


    public Person() {
    }

    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
//        if (this.age == o.age ) {
//            return 0;
//        } else if (this.age > o.age) {
//            return 1;
//        }
//        return 0;
        return (this.age - o.age);
    }
}
