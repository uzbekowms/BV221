package org.example;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        ArrayList<String> strings = new ArrayList<>(20);
//        strings.ensureCapacity();
//        strings.add("John");
//        strings.add("Doe");
//        strings.add("Kate");
//        strings.add("Ann");
//        strings.add("Petro");
//        strings.add("Oleg");
//        System.out.println(strings);
//        System.out.println(strings.get(0));
//        System.out.println(strings.get(5));
//        System.out.println(strings.get(9));
//        LinkedList<String> strings = new LinkedList<>();
//
//        strings.get(5);
//        for (String string : strings) {
//            System.out.println(string);
//        }
//        HashSet<Integer> numbers = new HashSet<>();
//        numbers.add(1);
//        numbers.add(10);
//        numbers.add(10000000);
//        numbers.add(6546);
//        numbers.add(15646);
//
//        System.out.println(numbers);
//
//        HashSet<Person> personHashSet = new HashSet<>();
//        personHashSet.add(new Person("Name", 20));
//        personHashSet.add(new Person("Name", 20));
//        personHashSet.add(new Person("Hello", 40));
//        personHashSet.add(new Person("Oleg", 15));
//        System.out.println(personHashSet);
//        TreeSet
//        TreeSet<String> ts = new TreeSet<>();
//        ts.add("Ukraine");
//        ts.add("Belgium");
//        ts.add("Italy");
//        ts.add("Canada");
//        ts.add("Argentina");
//
//        System.out.println(ts);

//        TreeSet<Person> personTreeSet = new TreeSet<>();
//        personTreeSet.add(new Person("Oleg", 80));
//        personTreeSet.add(new Person("Petro", 12));
//        personTreeSet.add(new Person("Ann", 60));
//        personTreeSet.add(new Person("Kate", 2));
//
//        System.out.println(personTreeSet);
//
//        PriorityQueue<Person> queue = new PriorityQueue<>(new PersonComparator());
//        queue.add(new Person("asd", 10));
//        queue.add(new Person("asd", 20));
//        queue.add(new Person("asd", 5));
//        queue.add(new Person("asd", 15));
//        queue.add(new Person("asd", 70));
//        queue.add(new Person("asd", 2));
//
//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
//        }
//
//        PriorityQueue<Integer> numbers = new PriorityQueue<>();
//        numbers.add(4);
//        numbers.add(3);
//        numbers.add(1);

//        numbers.retainAll()
//
//        while (!numbers.isEmpty()) {
//            System.out.println(numbers.poll());
//        }
        Map<Integer, Integer> users = new HashMap<>();
        users.put(1, 5);

        Map<List<String>, Integer> elements = new HashMap<>();
        List<String> key = new ArrayList<>();
        key.add("first");
        key.add("second");
        elements.put(key, 5);

        key.add("asd");

        System.out.println(elements.get(key));

        elements.put(null, 4);

        System.out.println(elements.get(null));

        for (Map.Entry<List<String>, Integer> entry : elements.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
//        List<Integer> integers = Collections.synchronizedList(new ArrayList<>());

    }
    // Ctrl + Space - Show Hints


    public static class PersonComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.age - o2.age;
        }
    }

    static class Person implements Comparable<Person> {
        private final String element;
        private String name;
        private int age;

        public Person(String element, String name, int age) {
            this.element = element;
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return 1;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public int compareTo(Person o) {
            return name.length() > o.name.length() ? 1 : -1;
        }
    }
}